import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
public class ex002 {
    public static void main(String[] args) {

        ArrayList<String> gender = new ArrayList<String>();
        ArrayList<Double> salaryVerificationList = new ArrayList<Double>();
        ArrayList<Integer> ageList = new ArrayList<Integer>();
        int age;
        Double salary;
        String continueQuestionary;
        
        while(true){

            age = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade: ", "Idade", JOptionPane.QUESTION_MESSAGE));
            if(age < 0){
                age = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade inválida. Tente novamente: ", "Idade", JOptionPane.QUESTION_MESSAGE));
            }else{
                ageList.add(age);
            }

            JPanel panel1 = new JPanel();
            JCheckBox maleCheckBox = new JCheckBox("Masculino");
            JCheckBox femaleCheckBox = new JCheckBox("Feminino");
            panel1.add(maleCheckBox);
            panel1.add(femaleCheckBox);
            int result = JOptionPane.showConfirmDialog(null, panel1, "Sexo", JOptionPane.OK_CANCEL_OPTION);
            if(result == JOptionPane.OK_OPTION){
                gender.add(maleCheckBox.isSelected() ? "Masculino" : "Feminino");
            }else{
                break;
            }

            salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Salário: ", "Salário", JOptionPane.QUESTION_MESSAGE));
            if(salary < 0){
                salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Salário inválido. Tente novamente: ", "Salário", JOptionPane.QUESTION_MESSAGE));
            }else{
                salaryVerificationList.add(salary);
            }


            continueQuestionary = JOptionPane.showInputDialog(null, "Deseja continuar? Digite 'Finalizar' para parar", "Continuar", JOptionPane.QUESTION_MESSAGE);
            if(continueQuestionary.equals("Finalizar")){
                break;
            }

        }

        Double averageAge = 0.0;
        for(int i = 0; i < ageList.size(); i++){
            averageAge += ageList.get(i);
        }
        averageAge /= ageList.size();
        
        double averageFemaleAge = 0.0;
        int amountFemale = 0;
        double averageMaleAge = 0.0;
        int amountMale = 0;
        for(int i = 0; i < ageList.size(); i++){
            if(gender.get(i).equals("Feminino")){
                averageFemaleAge += ageList.get(i);
                amountFemale++;
            }else{
                averageMaleAge += ageList.get(i);
                amountMale++;
            }
        }
        averageFemaleAge /= amountFemale;
        averageMaleAge /= amountMale;
        JOptionPane.showMessageDialog(null,"Média de idade geral: "+ averageAge+"\nMédia de idade feminina: "+ averageFemaleAge+"\nMédia de idade masculina: "+ averageMaleAge);

    }
}
