import javax.swing.JOptionPane;

public class ex003 {
    public static void main(String[] args) {
        double salary;
        int hours;

        salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do seu salário: ", "Salário", JOptionPane.QUESTION_MESSAGE));
        if(salary < 0) {
            JOptionPane.showMessageDialog(null, "Salário inválido", "Salário", JOptionPane.INFORMATION_MESSAGE);
        }else{
            hours = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de horas trabalhadas na primeira semana: ", "Horas trabalhadas", JOptionPane.QUESTION_MESSAGE));
            if(hours < 0) {
                JOptionPane.showMessageDialog(null, "Horas trabalhadas inválidas", "Horas trabalhadas", JOptionPane.INFORMATION_MESSAGE);
            }
            
            hours += Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de horas trabalhadas na segunda semana: ", "Horas trabalhadas", JOptionPane.QUESTION_MESSAGE));
            if(hours < 0) {
                JOptionPane.showMessageDialog(null, "Horas trabalhadas inválidas", "Horas trabalhadas", JOptionPane.INFORMATION_MESSAGE);
            }

            hours += Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de horas trabalhadas na terceira semana: ", "Horas trabalhadas", JOptionPane.QUESTION_MESSAGE));
            if(hours < 0) {
                JOptionPane.showMessageDialog(null, "Horas trabalhadas inválidas", "Horas trabalhadas", JOptionPane.INFORMATION_MESSAGE);
            }
            
            hours += Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de horas trabalhadas na quarta semana: ", "Horas trabalhadas", JOptionPane.QUESTION_MESSAGE));
            if(hours < 0) {
                JOptionPane.showMessageDialog(null, "Horas trabalhadas inválidas", "Horas trabalhadas", JOptionPane.INFORMATION_MESSAGE);
            }

            if (hours > 160) {
                JOptionPane.showMessageDialog(null, "Salário = R$" + (((salary/160)*(hours-160))*1.5 + salary), "Salário", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Salário = R$" + (salary), "Salário", JOptionPane.INFORMATION_MESSAGE);
            }   
        }
    }
}