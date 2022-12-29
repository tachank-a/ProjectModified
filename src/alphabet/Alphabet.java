package alphabet;

import java.util.HashMap;

public class Alphabet {
    private final HashMap<Character, Integer> encodingMap = new HashMap<>();

    public Alphabet() {
        encodingMap.put('�', 11);
        encodingMap.put('�', 12);
        encodingMap.put('�', 13);
        encodingMap.put('�', 14);
        encodingMap.put('�', 15);
        encodingMap.put('�', 16);
        encodingMap.put('�', 17);
        encodingMap.put('�', 18);
        encodingMap.put('�', 19);
        encodingMap.put('�', 21);
        encodingMap.put('�', 22);
        encodingMap.put('�', 23);
        encodingMap.put('�', 24);
        encodingMap.put('�', 25);
        encodingMap.put('�', 26);
        encodingMap.put('�', 27);
        encodingMap.put('�', 28);
        encodingMap.put('�', 29);
        encodingMap.put('�', 31);
        encodingMap.put('�', 32);
        encodingMap.put('�', 33);
        encodingMap.put('�', 34);
        encodingMap.put('�', 35);
        encodingMap.put('�', 36);
        encodingMap.put('�', 37);
        encodingMap.put('�', 38);
        encodingMap.put('�', 39);
        encodingMap.put('�', 41);
        encodingMap.put('�', 42);
        encodingMap.put('�', 43);
        encodingMap.put('�', 44);
        encodingMap.put('�', 45);
        encodingMap.put('�', 46);

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
