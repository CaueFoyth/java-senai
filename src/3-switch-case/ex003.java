import javax.swing.JOptionPane;

public class ex003 {
    public static void main(String[] args) {
        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Alexandre - PSL\n2 - Matheus - PCB\n3 - Gustavo - PSOL\n4 - Pedro - PSDB\n5 - Henrique - PPSD", "Escolha o candidato", JOptionPane.QUESTION_MESSAGE));

        switch (number) {
            case 1:
                JOptionPane.showMessageDialog(null, "Alexandre - PSL");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Matheus - PCB");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Gustavo - PSOL");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Pedro - PSDB");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Henrique - PPSD");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número inválido");
                break;
        }
    }
}