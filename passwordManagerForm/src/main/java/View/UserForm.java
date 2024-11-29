package passwordManagerForm.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserForm extends JFrame {
    private JPanel panel1;
    private JTextField UserName;
    private JPasswordField UserPassword;
    private JButton LoginButton;
    private JButton ForgotPassButton;

    public UserForm() {
        super("Inicio de sesión");
        setContentPane(panel1);

        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (UserName.getText().isEmpty() || UserPassword.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(UserForm.this, "Ingrese los datos correctamente");
                }
            }
        });
    }
}
