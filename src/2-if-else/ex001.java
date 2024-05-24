import javax.swing.JOptionPane;

public class ex001{ 
    public static void main(String[] args) {
        int age;

        age = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: ", "Idade", JOptionPane.QUESTION_MESSAGE));

        if(age > 0 && age < 18){
            JOptionPane.showMessageDialog(null, "Criança", "Classificação", JOptionPane.INFORMATION_MESSAGE);
        }else if(age >= 18 && age < 30){
            JOptionPane.showMessageDialog(null, "Jovem", "Classificação", JOptionPane.INFORMATION_MESSAGE);
        }else if (age >= 30 && age < 60){
            JOptionPane.showMessageDialog(null, "Adulto", "Classificação", JOptionPane.INFORMATION_MESSAGE);
        }else if (age >= 60){
            JOptionPane.showMessageDialog(null, "Idoso", "Classificação", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Idade inválida", "Classificação", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}