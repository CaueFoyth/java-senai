import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JCheckBox;

import java.text.DecimalFormat;
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
        double averageFemaleAge = 0.0;
        int amountFemale = 0;
        double averageMaleAge = 0.0;
        int amountMale = 0;
        double averageSalary = 0.0;
        double averageFameleSalary = 0.0;
        double averageMaleSalary = 0.0;
        double highestSalary = 0.0;
        double lowestSalary = 0.0;

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
        for(int i = 0; i < ageList.size(); i++){
            averageAge += ageList.get(i);
            averageSalary += salaryVerificationList.get(i);

            if(salaryVerificationList.get(i) > highestSalary){
                highestSalary = salaryVerificationList.get(i);
            }
            if(i == 0 || salaryVerificationList.get(i) < lowestSalary){
                lowestSalary = salaryVerificationList.get(i);
            }

            if(gender.get(i).equals("Feminino")){
                averageFemaleAge += ageList.get(i);
                amountFemale++;
                averageFameleSalary += salaryVerificationList.get(i);
            }else{
                averageMaleAge += ageList.get(i);
                amountMale++;
                averageMaleSalary += salaryVerificationList.get(i);
            }
        }

        averageAge /= ageList.size();
        averageFemaleAge /= amountFemale;
        averageMaleAge /= amountMale;
        averageSalary /= salaryVerificationList.size();
        averageFameleSalary /= amountFemale;
        averageMaleSalary /= amountMale;
        JOptionPane.showMessageDialog(null,"Média de idade geral: "+ averageAge+"\nMédia de idade feminina: "+ averageFemaleAge+"\nMédia de idade masculina: "+ averageMaleAge + "\nMédia de salário geral: "+ df.format(averageSalary) + "\nMédia de salário feminina: "+ df.format(averageFameleSalary) + "\nMédia de salário masculino: "+ df.format(averageMaleSalary) + "\nMaior salário: "+ df.format(highestSalary) + "\nMenor salário: "+ lowestSalary);

    }
}
