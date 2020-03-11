/** TheClueCreator's AGZ Crackme 5
 *
 * keygen solution by XpoZed / nullsecurity.org / 03 May, 2018
 *
 */

public class mainTest {

    public static void main(String[] args) {
        if (args.length != 1) {
        	System.out.println("Usage example: java -cp . keygen.main USERNAME");
        	return;
        }
        String username = args[0];

        // Generate the username's hash string
        StringBuilder username_hash_str = new StringBuilder();
        for (int i = 0; i < username.length(); i++) {
        	username_hash_str.append((int)username.charAt(i));
        }

        // Convert it to Double
        double username_hash = Double.parseDouble(username_hash_str.toString());

        // System specific modifier
        double mod_cpu = Runtime.getRuntime().availableProcessors();
        double mod_ram = Runtime.getRuntime().totalMemory();
        double password = username_hash - mod_ram / 1.0E8 + mod_cpu * 28.0 +
                          mod_ram / 107543.0 - mod_ram / Double.toString(username_hash).length();

        // Print the result
        System.out.println(String.format("Username: %s\nPassword: %s", username, Double.toString(password)));
    }
}
