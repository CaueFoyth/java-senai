import javax.swing.JOptionPane;

public class ex002 {
    public static void main(String[] args) {
        double number;

        number = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um número: ", "Informe um número", JOptionPane.QUESTION_MESSAGE));
        
        JOptionPane.showMessageDialog(null, "O número informado foi: " + Math.round(number), "Número informado", JOptionPane.INFORMATION_MESSAGE);
    }
}