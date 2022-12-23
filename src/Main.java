import algorithm.AlgorithmRSA;
import utils.FileManager;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        String message = FileManager.readFromInput();

        System.out.println("Message: " + message);

        AlgorithmRSA algorithmRSA = new AlgorithmRSA();

        StringBuilder encryptedMessage = algorithmRSA.encrypt(message.toCharArray());

        FileManager.writeToFile(encryptedMessage.toString());

        StringBuilder decryptedMessage = algorithmRSA
                .decrypt(Arrays.stream(encryptedMessage.toString().split(" "))
                        .mapToLong(Long::parseLong).toArray());

       FileManager.writeToFile(decryptedMessage.toString());
    }
}