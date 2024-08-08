import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Start the application with the User Login screen
        SwingUtilities.invokeLater(() -> new LoginFrame());
    }
}
