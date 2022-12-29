package alphabet;

import java.util.HashMap;

public class Alphabet {
    private final HashMap<Character, Integer> encodingMap = new HashMap<>();

    public Alphabet() {
        encodingMap.put('à', 11);
        encodingMap.put('á', 12);
        encodingMap.put('â', 13);
        encodingMap.put('ã', 14);
        encodingMap.put('ä', 15);
        encodingMap.put('å', 16);
        encodingMap.put('¸', 17);
        encodingMap.put('æ', 18);
        encodingMap.put('ç', 19);
        encodingMap.put('è', 21);
        encodingMap.put('é', 22);
        encodingMap.put('ê', 23);
        encodingMap.put('ë', 24);
        encodingMap.put('ì', 25);
        encodingMap.put('í', 26);
        encodingMap.put('î', 27);
        encodingMap.put('ï', 28);
        encodingMap.put('ð', 29);
        encodingMap.put('ñ', 31);
        encodingMap.put('ò', 32);
        encodingMap.put('ó', 33);
        encodingMap.put('ô', 34);
        encodingMap.put('õ', 35);
        encodingMap.put('ö', 36);
        encodingMap.put('÷', 37);
        encodingMap.put('ø', 38);
        encodingMap.put('ù', 39);
        encodingMap.put('ú', 41);
        encodingMap.put('û', 42);
        encodingMap.put('ü', 43);
        encodingMap.put('ý', 44);
        encodingMap.put('þ', 45);
        encodingMap.put('ÿ', 46);

        encodingMap.put('a', 47);
        encodingMap.put('b', 48);
        encodingMap.put('c', 49);
        encodingMap.put('d', 51);
        encodingMap.put('e', 52);
        encodingMap.put('f', 53);
        encodingMap.put('g', 54);
        encodingMap.put('h', 55);
        encodingMap.put('i', 56);
        encodingMap.put('j', 57);
        encodingMap.put('k', 58);
        encodingMap.put('l', 59);
        encodingMap.put('m', 61);
        encodingMap.put('n', 62);
        encodingMap.put('o', 63);
        encodingMap.put('p', 64);
        encodingMap.put('q', 65);
        encodingMap.put('r', 66);
        encodingMap.put('s', 67);
        encodingMap.put('t', 68);
        encodingMap.put('u', 69);
        encodingMap.put('v', 71);
        encodingMap.put('w', 72);
        encodingMap.put('x', 73);
        encodingMap.put('y', 74);
        encodingMap.put('z', 75);

        encodingMap.put(' ',76);
        encodingMap.put(',',77);
        encodingMap.put('.',78);

    }

    public HashMap<Character, Integer> getEncodingMap() {
        return encodingMap;
    }
}
