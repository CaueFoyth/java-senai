import javax.swing.JOptionPane;

public class ex001 {
    public static void main(String[] args) {
        int tentatives = 1;
        int number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "Número", JOptionPane.QUESTION_MESSAGE));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "Número", JOptionPane.QUESTION_MESSAGE));

        int result = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o resultado da multiplicação " + number1 + " X " + number2 + " = ", "Multiplicação", JOptionPane.QUESTION_MESSAGE));
        while(result != (number1 * number2)) {
            result = Integer.parseInt(JOptionPane.showInputDialog(null, "O resultado da multiplicação é inválido. Tente novamente. ", "Erro", JOptionPane.QUESTION_MESSAGE));
            tentatives++;
        }

        JOptionPane.showMessageDialog(null, "Acertou em " + tentatives + " tentativas");

    }
    
}
