import java.util.InputMismatchException;
import java.util.Scanner;

public class Password {

    public static Scanner input = new Scanner(System.in);

    public static int getint() {

        int userinput = 0;
        boolean invalid = true;

        while (invalid) {

            try {

                userinput = input.nextInt();

                break;
            }

            catch (InputMismatchException e) {
                System.out.print("Not valid input...please enter number: ");
                input.nextLine();
            }
        }
        return userinput;
    }

    public static void main(String[] args) throws Exception {
                /*
                 * Scanner input = new Scanner(System.in);
                 * 
                 * System.out.println("Please select password length:"); passwordlength
                 * = input.nextInt();
                 */

        System.out.print("Please enter password length: ");

        int passlength = getint();

        PasswordGenerator a = new PasswordGenerator(passlength);
        String pass = a.getPassword();
        System.out.println("Generating please wait...");
        Thread.sleep(2000);
        System.out.print("Generating complete: ");

        System.out.print(pass);

    }
}
