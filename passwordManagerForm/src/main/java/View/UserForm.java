package passwordManagerForm.View;

import javax.swing.*;

public class UserForm extends JFrame {
    private JPanel panel1;
    private JTextField UserName;
    private JPasswordField UserPassword;
    private JButton LoginButton;
    private JButton ForgotPassButton;

    public UserForm() {
        super("Inicio de sesión");
        setContentPane(panel1);
    }
}
