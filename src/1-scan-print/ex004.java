import javax.swing.JOptionPane;

public class ex004 {
    public static void main(String[] args) {
        String word;
        int amountCharacters;

        word = JOptionPane.showInputDialog(null, "Digite uma palavra: ", "Palavra", JOptionPane.QUESTION_MESSAGE);
        
        amountCharacters = word.length();

        JOptionPane.showMessageDialog(null, "A palavra informada tem " + amountCharacters + " letras", "Palavra informada", JOptionPane.INFORMATION_MESSAGE);
    }
}