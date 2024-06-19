import javax.swing.JOptionPane;
import java.util.Arrays;

public class ex004 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        JOptionPane.showMessageDialog(null, "Programa para mostrar do menor para o maior valor de um array", "Programa de array", JOptionPane.INFORMATION_MESSAGE);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "° valor: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
        }
        Arrays.sort(numbers);
        JOptionPane.showMessageDialog(null, Arrays.toString(numbers), "Valores", JOptionPane.INFORMATION_MESSAGE);
    }
}
