import java.util.Random;
import java.lang.*;

public class PasswordGenerator {
    /**
     * The length of the password
     */
    private int passwordlength;

    private final char[] numbers = { '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9' };

    private final char[] letterslower = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
            'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z' };

    private final char[] lettersupper = { 'A', 'B', 'C', 'D', 'E', 'F', 'G',
            'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z' };

    private final char[] specialchar = { '!', '@', '#', '$', '%', '^', '&',
            '*', '_' };

    public PasswordGenerator(int length) {
        this.passwordlength = length;
    }

    /**
     * Returning the generated password
     *
     * @return
     */

    public String getPassword() {

        String password = "";

        for (int p = 0; p < passwordlength; p++) {
            char randomchar = getRandomChar();
            password += Character.toString(randomchar);

        }
        return password;

    }

    /**
     * Getting a random character from the numbers array
     *
     * @return
     */
    private char getRandomChar() {

        char randomchar = ' ';
        // This generates a random integer
        Random generator = new Random();
        int i = generator.nextInt(4);
        switch (i) {
            case 0:
                int randomnumberindex = generator.nextInt(specialchar.length);
                randomchar = specialchar[randomnumberindex];
                break;
            case 1:
                int randomnumberindex2 = generator.nextInt(lettersupper.length);
                randomchar = lettersupper[randomnumberindex2];
                break;
            case 2:
                int randomnumberindex3 = generator.nextInt(letterslower.length);
                randomchar = letterslower[randomnumberindex3];
                break;
            case 3:
                int randomnumberindex4 = generator.nextInt(numbers.length);
                randomchar = numbers[randomnumberindex4];
                break;
        }
        // This int is the random index number

        // index to the array

        return randomchar;
    }

    /**
     * Getting a random character from the numbers array
     *
     * @return
     */
    private char getRandomChar2() {

        // This generates a random integer
        Random generator = new Random();
        // This int is the random index number
        int randomnumberindex = generator.nextInt(numbers.length);
        // index to the array
        return numbers[randomnumberindex];

    }

}
