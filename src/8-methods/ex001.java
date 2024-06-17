import javax.swing.JOptionPane;

public class ex001 {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma nota de 0 a 10: ", "Entrada de nota", JOptionPane.QUESTION_MESSAGE));
        while(number < 0 || number > 10) {
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "Nota inválida. Digite novamente: ", "Entrada de nota", JOptionPane.QUESTION_MESSAGE));
        }
        String result = moveOnNextGrade(number);    

        JOptionPane.showMessageDialog(null, result, "Situação", JOptionPane.INFORMATION_MESSAGE);
    }
    public static String moveOnNextGrade(int number) {
        if(number >= 7) {
            return "Aprovado";
        }else if(number >= 5 && number < 7) {
            return "Recuperação";
        }else {
            return "Reprovado";
        }
    }
    
}