package alphabet;

import java.util.HashMap;

public class Alphabet {
    private final HashMap<Character, Integer> encodingMap = new HashMap<>();

    public Alphabet() {
        encodingMap.put('à', 79);
        encodingMap.put('á', 11);
        encodingMap.put('â', 12);
        encodingMap.put('ã', 13);
        encodingMap.put('ä', 14);
        encodingMap.put('å', 15);
        encodingMap.put('¸', 16);
        encodingMap.put('æ', 17);
        encodingMap.put('ç', 18);
        encodingMap.put('è', 19);
        encodingMap.put('é', 78);
        encodingMap.put('ê', 21);
        encodingMap.put('ë', 22);
        encodingMap.put('ì', 23);
        encodingMap.put('í', 24);
        encodingMap.put('î', 25);
        encodingMap.put('ï', 26);
        encodingMap.put('ð', 27);
        encodingMap.put('ñ', 28);
        encodingMap.put('ò', 29);
        encodingMap.put('ó', 77);
        encodingMap.put('ô', 31);
        encodingMap.put('õ', 32);
        encodingMap.put('ö', 33);
        encodingMap.put('÷', 34);
        encodingMap.put('ø', 35);
        encodingMap.put('ù', 36);
        encodingMap.put('ú', 37);
        encodingMap.put('û', 38);
        encodingMap.put('ü', 39);
        encodingMap.put('ý', 76);
        encodingMap.put('þ', 41);
        encodingMap.put('ÿ', 42);

        encodingMap.put('a', 43);
        encodingMap.put('b', 44);
        encodingMap.put('c', 45);
        encodingMap.put('d', 46);
        encodingMap.put('e', 47);
        encodingMap.put('f', 48);
        encodingMap.put('g', 49);
        encodingMap.put('h', 75);
        encodingMap.put('i', 51);
        encodingMap.put('j', 52);
        encodingMap.put('k', 53);
        encodingMap.put('l', 54);
        encodingMap.put('m', 55);
        encodingMap.put('n', 56);
        encodingMap.put('o', 57);
        encodingMap.put('p', 58);
        encodingMap.put('q', 59);
        encodingMap.put('r', 74);
        encodingMap.put('s', 61);
        encodingMap.put('t', 62);
        encodingMap.put('u', 63);
        encodingMap.put('v', 64);
        encodingMap.put('w', 65);
        encodingMap.put('x', 66);
        encodingMap.put('y', 67);
        encodingMap.put('z', 68);

        encodingMap.put(' ',69);
        encodingMap.put(',',72);
        encodingMap.put('.',73);

    }

    public HashMap<Character, Integer> getEncodingMap() {
        return encodingMap;
    }
}
