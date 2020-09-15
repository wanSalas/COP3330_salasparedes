import java.util.*;

public class main {
    public static void main(String[] args)
    {
        Encrypter encrypter = new Encrypter();
        Decrypter decrypter = new Decrypter();
        System.out.println("Enter four digits to encrypt:");
        Scanner numbers = new Scanner(System.in);
        String fourNumbers = numbers.next();
        encrypter.encrypt(fourNumbers);

        System.out.println("Enter four digits to decrypt:");
        Scanner scan = new Scanner(System.in);
        String fourNumbers2 = numbers.next();
        decrypter.unscramble(fourNumbers2);

    }
}
