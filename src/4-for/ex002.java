import javax.swing.JOptionPane;

public class ex002 {
    public static void main(String[] args) {
        String word =  JOptionPane.showInputDialog(null, "Digite uma frase: ", "Frase", JOptionPane.QUESTION_MESSAGE);

        int amountVowels = 0;
        int amountConsonants = 0;
        int amountSpaces = 0;
        int amountSpecialsCharacters = 0;

        for(int i=0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    amountVowels++;
                    break;

                case 'b': case 'c': case 'd': case 'f': case 'g': case 'h': case 'j': case 'k': case 'l': case 'm': case 'n': case 'p': case 'q': case 'r': case 's': case 't': case 'v': case 'w': case 'x': case 'y': case 'z':
                    amountConsonants++;
                    break;

                case ' ':
                    amountSpaces++;
                    break;
                default:
                    amountSpecialsCharacters++;
                    break;
            }
        }

        JOptionPane.showMessageDialog(null, "Quantidade de vogais: " + amountVowels+"\nQuantidade de consoantes: " + amountConsonants+"\nQuantidade de espacos: " + amountSpaces+"\nQuantidade de caracteres especiais: " + amountSpecialsCharacters, "Frase informada", JOptionPane.INFORMATION_MESSAGE);
    }
}
