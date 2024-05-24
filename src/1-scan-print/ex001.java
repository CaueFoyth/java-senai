import javax.swing.JOptionPane;

public class ex001 {
    public static void main(String[] args) {
        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: ", "Informe um número", JOptionPane.QUESTION_MESSAGE));  
        
        if (number % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + number + " é par", "Par", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "O número " + number + " é impar", "Impar", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}