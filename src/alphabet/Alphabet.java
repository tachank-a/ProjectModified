package alphabet;

import java.util.HashMap;

public class Alphabet {
    private final HashMap<Character, Integer> encodingMap = new HashMap<>();

    public Alphabet() {
        encodingMap.put('�', 79);
        encodingMap.put('�', 11);
        encodingMap.put('�', 12);
        encodingMap.put('�', 13);
        encodingMap.put('�', 14);
        encodingMap.put('�', 15);
        encodingMap.put('�', 16);
        encodingMap.put('�', 17);
        encodingMap.put('�', 18);
        encodingMap.put('�', 19);
        encodingMap.put('�', 78);
        encodingMap.put('�', 21);
        encodingMap.put('�', 22);
        encodingMap.put('�', 23);
        encodingMap.put('�', 24);
        encodingMap.put('�', 25);
        encodingMap.put('�', 26);
        encodingMap.put('�', 27);
        encodingMap.put('�', 28);
        encodingMap.put('�', 29);
        encodingMap.put('�', 77);
        encodingMap.put('�', 31);
        encodingMap.put('�', 32);
        encodingMap.put('�', 33);
        encodingMap.put('�', 34);
        encodingMap.put('�', 35);
        encodingMap.put('�', 36);
        encodingMap.put('�', 37);
        encodingMap.put('�', 38);
        encodingMap.put('�', 39);
        encodingMap.put('�', 76);
        encodingMap.put('�', 41);
        encodingMap.put('�', 42);

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
