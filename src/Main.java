import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // диалог для ввода имени
        String name = JOptionPane.showInputDialog(
                null,
                "Введите ваше имя:",
                "Ввод имени",
                JOptionPane.QUESTION_MESSAGE
        );

        // если пользователь не нажал "Отмена" и что-то ввёл
        if (name != null && !name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Привет, " + name + "!",
                    "Информация",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Имя не введено!",
                    "Ошибка",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }
}
