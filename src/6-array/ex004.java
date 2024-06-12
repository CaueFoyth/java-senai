import javax.swing.JOptionPane;
import java.util.Arrays;

public class ex004 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
        }
        Arrays.sort(numbers);
        JOptionPane.showMessageDialog(null, Arrays.toString(numbers), "Valores", JOptionPane.INFORMATION_MESSAGE);
    }
}
