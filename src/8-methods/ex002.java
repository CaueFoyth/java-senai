import javax.swing.JOptionPane;

public class ex002 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Programa para aplicar uma máscara ao número de telefone", "Programa de telefone", JOptionPane.INFORMATION_MESSAGE);
        String phoneNumber = JOptionPane.showInputDialog(null, "Digite seu telefone: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
        
        String result = regex(phoneNumber);
        JOptionPane.showMessageDialog(null, result, "Número de telefone", JOptionPane.INFORMATION_MESSAGE);

    }

    public static String regex(String phoneNumber) {
        boolean numeric = phoneNumber.matches("[0-9]+");
        if (phoneNumber.length() == 11 && numeric) {
            String result = "("+phoneNumber.substring(0, 2)+") "+phoneNumber.substring(2, 7)+"-"+phoneNumber.substring(7, 11);
            return result;  
        }else{
            return "Número inválido";
        }

       
    }
}
