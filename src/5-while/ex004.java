import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.GridLayout;

public class ex004 {
    String gender;
    int age;
    int rate;
    static ArrayList<String> genderList = new ArrayList<String>();
    static ArrayList<Integer> ageList = new ArrayList<Integer>();
    static ArrayList<Integer> rateList = new ArrayList<Integer>(); 

    static class FormData {
        String gender;
        int age;
        int rate;
    }
    
    public static void main(String[] args) {
        while(true){
            FormData data = forms("Pesquisa sobre o filme.");
            if (data != null){
                genderList.add(data.gender);
                ageList.add(data.age);
                rateList.add(data.rate);
            }else{
                break;
            }
        };
        
        double averageAge = 0.0;
        ArrayList<Integer> listPositionRate10 = new ArrayList<Integer>();
        int amountMaleLowerThan5 = 0;
        int amountFemaleLowerThan5 = 0;
        int amountMaleHigherThan7 = 0;
        int amountFemaleHigherThan7 = 0;
        double averageRate = 0.0;

        for(int i = 0; i < ageList.size(); i++){
            averageAge += ageList.get(i);
            averageRate += rateList.get(i);
            if(rateList.get(i) == 10){
                listPositionRate10.add(i + 1);
            }

            if(genderList.get(i).equals("Masculino") && rateList.get(i) < 5){
                amountMaleLowerThan5++;
            }else if(genderList.get(i).equals("Feminino") && rateList.get(i) < 5){
                amountFemaleLowerThan5++;
            }else if(genderList.get(i).equals("Masculino") && rateList.get(i) > 7){
                amountMaleHigherThan7++;
            }else if(genderList.get(i).equals("Feminino") && rateList.get(i) > 7){
                amountFemaleHigherThan7++;
            }
        }
        averageAge = averageAge / ageList.size();
        averageRate = averageRate / rateList.size();
        JOptionPane.showMessageDialog(null, "Média de idade: " + averageAge + "\nLista de participantes que votaram 10: " + listPositionRate10 + "\nQuantidade de homens cujas opiniões sobre o filme foram inferiores a 5: " + amountMaleLowerThan5 + "\nQuantidade de mulheres cujas opiniões sobre o filme foram inferiores a 5: "+amountFemaleLowerThan5+"\nQuantidade de homens cujas opiniões sobre o filme foram superiores a 7: "+amountMaleHigherThan7+"\nQuantidade de mulheres cujas opiniões sobre o filme foram superiores a 7: "+amountFemaleHigherThan7+"\nMédia das notas informadas: "+averageRate);
    }

    public static FormData forms(String title){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1));

        JLabel genderLabel = new JLabel("Gênero: ");
        JCheckBox gender = new JCheckBox("Masculino");
        JCheckBox gender2 = new JCheckBox("Feminino");

        JLabel ageLabel = new JLabel("Idade: ");
        JTextField age = new JTextField();

        JLabel rateLabel = new JLabel("Avaliação (0 a 10): ");
        JTextField rate = new JTextField();

        panel.add(genderLabel);
        panel.add(gender);
        panel.add(gender2);
        panel.add(ageLabel);
        panel.add(age);
        panel.add(rateLabel);
        panel.add(rate);
        
        int result = JOptionPane.showConfirmDialog(null, panel, title, JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            FormData formData = new FormData();
            if(gender.isSelected()){
                formData.gender = "Masculino";
            }else if(gender2.isSelected()){
                formData.gender = "Feminino";   
            }
            formData.age = Integer.parseInt(age.getText());
            formData.rate = Integer.parseInt(rate.getText());
            return formData;
        } else {
            return null;
        }
    }
    
}
