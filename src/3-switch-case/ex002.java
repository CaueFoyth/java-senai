import javax.swing.JOptionPane;

public class ex002 {
    public static void main(String[] args) {
        char letter = JOptionPane.showInputDialog(null, "Digite uma letra: ", "Letra", JOptionPane.QUESTION_MESSAGE).charAt(0);
        switch (letter) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                JOptionPane.showMessageDialog(null, "Vogal");
                break;
            case 'b': case 'c': case 'd': case 'f': case 'g': case 'h': case 'j': case 'k': case 'l': case 'm': case 'n': case 'p': case 'q': case 'r': case 's': case 't': case 'v': case 'w': case 'x': case 'y': case 'z':
                JOptionPane.showMessageDialog(null, "Consoante");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Letra inválida");
        }
    }
}
