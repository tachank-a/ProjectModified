package algorithm;

import alphabet.Alphabet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class AlgorithmRSA {

    private long z;

    private long n;

    private long d;

    private final long p = 307;
    private final long q = 151;
    private final long e = 11;


    Alphabet alphabet = new Alphabet();

    public AlgorithmRSA() {
        n = p * q;
        z = (p - 1) * (q - 1);
        d = calculateD();
    }

    // d мультипликативно обратное к числу e по модулю phi(n),
    // т.e. число, удовлетворяющее сравнению d * e ? 1 (mod phi(n))
    private long calculateD() {
        long k = 1;

        while (true) {
            k += z;

            if (k % e == 0)
                return k / e;
        }

    }

    private StringBuilder encodeMessage(char[] rawData) {
        StringBuilder encodedMessage = new StringBuilder();
        for (Character value : rawData) {
            encodedMessage.append(alphabet.getEncodingMap().get(value));
        }
        return encodedMessage;
    }

    public StringBuilder decodeMessage(List<Integer> encodedMessage) {
        StringBuilder result = new StringBuilder();
        List<Character> decodedMessage = new ArrayList<>();
        for (Integer value : encodedMessage) {
            for (Map.Entry<Character, Integer> pair : alphabet.getEncodingMap().entrySet()) {
                if (value.equals(pair.getValue())) {
                    decodedMessage.add(pair.getKey());
                    break;
                }
            }
        }
        for (Character value :
                decodedMessage) {
            result.append(value);
        }
        return result;
    }

    public StringBuilder encrypt(char[] rawData) {
        StringBuilder encodedMessage = encodeMessage(rawData);

        List<Long> mergedMessage = merge(encodedMessage.toString().toCharArray());

        StringBuilder result = new StringBuilder();

        for (Long value :
                mergedMessage) {
            result.append(powerFast(value, e, n));
            result.append(" ");
        }
        return result;
    }

    public StringBuilder decrypt(long[] encodedMessage) {
        List<Long> decryptedMessage = new ArrayList<>();

        for (long value :
                encodedMessage) {
            decryptedMessage.add(powerFast(value, d, n));
        }

        List<Integer> unmergedMessage = unmerge(decryptedMessage);


        return decodeMessage(unmergedMessage);
    }

    private List<Long> merge(char[] encodedMessage) {
        List<Long> encryptedMessage = new ArrayList<>();
        String tempResult = "";

        for (char c : encodedMessage) {
            if (Long.parseLong(tempResult + c) < n) {
                tempResult += c;
            } else {
                encryptedMessage.add(Long.parseLong(tempResult));
                tempResult = "" + c;
            }

        }
        encryptedMessage.add(Long.parseLong(tempResult));

        return encryptedMessage;
    }

    private List<Integer> unmerge(List<Long> mergedMessage) {
        StringBuilder tempResult = new StringBuilder();
        List<Integer> encodedLetters = new ArrayList<>();
        for (Long value :
                mergedMessage) {
            tempResult.append(value);
        }

        char[] letterArray = tempResult.toString().toCharArray();

        for (int i = 1; i < letterArray.length; i += 2) {
            encodedLetters.add(Integer.parseInt(String.valueOf(letterArray[i - 1]) + letterArray[i]));
        }

        return encodedLetters;
    }

    private long powerFast(long base, long x, long p) {
        long y = 1;
        long s = base;
        long x_2;
        while (x >= 1) {
            //опеределение очередного разраяда двоичного представления степени
            x_2 = x % 2;
            x /= 2;
            //быстрое возведение в степень по модулю справа-налево
            if (x_2 == 1)
                y = y * s % p;
            s = s * s % p;
        }
        return y;
    }

}

