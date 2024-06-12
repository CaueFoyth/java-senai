import javax.swing.JOptionPane;
import java.util.Arrays;

public class ex001 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        int secondHighest = 0;
        int thirdLowest = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
        }

        Arrays.sort(numbers);
        secondHighest = numbers[numbers.length - 2];
        thirdLowest = numbers[2];
        JOptionPane.showMessageDialog(null, "Segundo maior valor: " + secondHighest + "\nTerceiro menor valor: " + thirdLowest, "Valores", JOptionPane.INFORMATION_MESSAGE);

    }
}
