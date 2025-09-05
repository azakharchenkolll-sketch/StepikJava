import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Press SPACE");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(360, 180);
            frame.setLocationRelativeTo(null);

            JLabel label = new JLabel("Нажмите ПРОБЕЛ", SwingConstants.CENTER);
            frame.add(label);

            // Надёжная обработка клавиш: Key Bindings (работает даже без фокуса на виджете)
            JComponent root = frame.getRootPane();
            root.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                    .put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0), "showName");
            root.getActionMap().put("showName", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(
                            frame,
                            "Привет! Меня зовут Артем 😊",
                            "Информация",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            });

            frame.setVisible(true);
        });
    }
}
