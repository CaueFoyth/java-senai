import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.GridLayout;
public class ex003 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<Integer> ageList = new ArrayList<Integer>();
        ArrayList<Double> salaryList = new ArrayList<Double>();
        ArrayList<Integer> amountChildrens = new ArrayList<Integer>(); 

        while(true){
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(2, 2));

            JLabel nameLabel = new JLabel("Nome: ");
            JTextField name = new JTextField();

            JLabel ageLabel = new JLabel("Idade: ");
            JTextField age = new JTextField();

            JLabel salaryLabel = new JLabel("Salário: ");
            JTextField salary = new JTextField();

            JLabel amountChildrenLabel = new JLabel("Quantidade de filhos: ");
            JTextField amountChildren = new JTextField();

            panel.add(nameLabel);
            panel.add(name);
            panel.add(ageLabel);
            panel.add(age);
            panel.add(salaryLabel);
            panel.add(salary);
            panel.add(amountChildrenLabel);
            panel.add(amountChildren);
            
            int result = JOptionPane.showConfirmDialog(null, panel, "Pesquisa de cidadões", JOptionPane.OK_CANCEL_OPTION);
            if(result == JOptionPane.OK_OPTION){
                nameList.add(name.getText());
                ageList.add(Integer.parseInt(age.getText()));
                salaryList.add(Double.parseDouble(salary.getText()));
                amountChildrens.add(Integer.parseInt(amountChildren.getText()));
            }else{
                break;
            }
        }
        double averageSalary = 0.0;
        double averageAge = 0.0;
        double averageChildren = 0.0;
        double higherSalary = 0.0;
        ArrayList<String> nameListLowerSalary = new ArrayList<String>(nameList);
        for(int i = 0; i < nameList.size(); i++){
            averageSalary += salaryList.get(i);
            averageAge += ageList.get(i);
            averageChildren += amountChildrens.get(i);
            if(salaryList.get(i) < 1000.0){
                nameListLowerSalary.add(nameList.get(i));
            }
            if(salaryList.get(i) > higherSalary){
                higherSalary = salaryList.get(i);
            }
        }
        averageSalary = averageSalary / nameList.size();
        averageAge = averageAge / nameList.size();
        averageChildren = averageChildren / nameList.size();
        JOptionPane.showMessageDialog(null, "Média de salários: " + averageSalary + "\nMédia de idades: " + averageAge + "\nMédia de filhos: " + averageChildren + "\nMaior salário: " + higherSalary);
    }
}
