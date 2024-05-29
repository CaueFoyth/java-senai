import javax.swing.JOptionPane;

public class ex001 {
    public static void main(String[] args) {
        String word =  JOptionPane.showInputDialog(null, "Digite uma palavra: ", "Palavra", JOptionPane.QUESTION_MESSAGE);

        StringBuilder separete_letters_builder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            separete_letters_builder.append("\n" + word.charAt(i));
        }
        String separate_letters = separete_letters_builder.toString();

        JOptionPane.showMessageDialog(null, "Letras da palavra informada: " + separate_letters, "Palavra informada", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Quantidade de letras da palavra informada: " + word.length(), "Palavra informada", JOptionPane.INFORMATION_MESSAGE);
        
    }
     
}
