import java.util.Scanner;
import java.util.concurrent.Phaser;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;
    private static String inputPhoneNumber;

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Phone number to check: ");
        inputPhoneNumber = scanner.nextLine();
        System.out.println("Your Phone number " + inputPhoneNumber + " is valid: " + phoneNumber.validatePhoneNumber(inputPhoneNumber));
    }
}
