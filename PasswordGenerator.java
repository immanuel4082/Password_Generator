import java.util.Random;

public class PasswordGenerator {

    // A string that contains all the possible characters for the password
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";

    // A random number generator
    private static final Random RANDOM = new Random();

    // A method that returns a random character from the characters string
    private static char getRandomCharacter() {
        return CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length()));
    }

    // A method that returns a random password of a given length
    public static String generatePassword(int length) {
        // A string builder to append the random characters
        StringBuilder password = new StringBuilder();

        // A loop that iterates length times and appends a random character each time
        for (int i = 0; i < length; i++) {
            password.append(getRandomCharacter());
        }

        // Return the password as a string
        return password.toString();
    }

    // A main method to test the password generator
    public static void main(String[] args) {
        // Generate and print a 10-character password
        System.out.println("Your 10-character password is: " + generatePassword(10));

        // Generate and print a 15-character password
        System.out.println("Your 15-character password is: " + generatePassword(15));
    }
}
