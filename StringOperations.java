public class StringOperations {
    public static void main(String[] args) {
        // Step 1: Define and assign values to strings
        String string1 = "Celestine";
        String string2 = "Okonkwo";

        // Step 2: Concatenate strings
        String concatenated = string1 + " " + string2;

        // Step 3: Print the second character of the first string
        char secondChar = string1.charAt(1);

        // Step 4: Convert the first string to uppercase
        String uppercaseString1 = string1.toUpperCase();

        // Print results
        System.out.println("Concatenated String: " + concatenated);
        System.out.println("Second Character of the First String: " + secondChar);
        System.out.println("Uppercase of First String: " + uppercaseString1);
    }
}