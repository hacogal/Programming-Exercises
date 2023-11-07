import java.util.Scanner;
/**
 * CaesarCipher
 */
public class CaesarCipher {

    public static String encrypt(String msg, int key){
        StringBuilder encryptedMsg = new StringBuilder();
        for (char ch : msg.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                char encryptedChar = (char) ((ch - base + key) % 26 + base);
                encryptedMsg.append(encryptedChar);
            } else {
                encryptedMsg.append(ch);
            }
        }
        return encryptedMsg.toString();
    }

    public static String decrypt(String encryptedMsg, int key) {
        return encrypt(encryptedMsg, 26 - key);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String msg = input.nextLine();

        System.out.print("Enter a shift value (an integer): ");
        int key = input.nextInt();

        String encryptedMsg = encrypt(msg, key);
        System.out.println("Encrypted message: " + encryptedMsg);

        String decryptedMsg = decrypt(encryptedMsg, key);
        System.out.println("Decrypted message: " + decryptedMsg);
    }
    
}