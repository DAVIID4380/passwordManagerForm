package passwordManagerForm;

import passwordManagerForm.View.UserForm;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new UserForm();
                frame.setSize(300, 300);
                frame.setVisible(true);
            }
        });
    }
}