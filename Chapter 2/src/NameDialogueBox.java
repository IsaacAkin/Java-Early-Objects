import javax.swing.*;

public class NameDialogueBox {

    public static void main(String[] args) {

        // Prompt user to input name
        String name = JOptionPane.showInputDialog("What is your name?");

        // Create the message
        String message = String.format("Welcome %s, to Java programming", name);

        // Display the message to welcome the user by name
        JOptionPane.showMessageDialog(null, message);
    }
}
