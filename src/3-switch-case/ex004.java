import javax.swing.JOptionPane;

public class ex004 {
    public static void main(String[] args) {
        double salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do seu salário: ", "Calculo de imposto de renda", JOptionPane.QUESTION_MESSAGE));
        
        if(salary < 1903.98 && salary > 0){
            JOptionPane.showMessageDialog(null, "Isento de imposto", "Calculo de imposto de renda", JOptionPane.INFORMATION_MESSAGE);
        }else if(salary >= 1903.98 && salary <= 2826.65){
            JOptionPane.showMessageDialog(null, "Imposto de renda = R$" + ((salary - 1903.98) * 0.075), "Calculo de imposto de renda", JOptionPane.INFORMATION_MESSAGE);
        }else if(salary >= 2826.66 && salary <= 3751.05){
            JOptionPane.showMessageDialog(null, "Imposto de renda = R$" + ((salary - 2826.66) * 0.15) + 142.80, "Calculo de imposto de renda", JOptionPane.INFORMATION_MESSAGE);
        }else if(salary >= 3751.06 && salary <= 4664.68){
            JOptionPane.showMessageDialog(null, "Imposto de renda = R$" + ((salary - 3751.06) * 0.225) + 354.80, "Calculo de imposto de renda", JOptionPane.INFORMATION_MESSAGE);
        }else if(salary > 4664.68){
            JOptionPane.showMessageDialog(null, "Imposto de renda = R$" + ((salary - 4664.68) * 0.275) + 636.13, "Calculo de imposto de renda", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Salário inválido", "Calculo de imposto de renda", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
