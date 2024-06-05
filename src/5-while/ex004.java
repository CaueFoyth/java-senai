import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.GridLayout;

public class ex004 {
    String name;
    int age;
    int rate;
    public static void main(String[] args) {
        while(true){
            name, age, rate = forms("Pesquisa sobre o filme.");;
            genderList.add(name.getText());
            ageList.add(Integer.parseInt(age.getText()));
            rateList.add(Integer.parseInt(rate.getText()));
        }
    }

    public static FormData  forms(String title){
        ArrayList<String> genderList = new ArrayList<String>();
        ArrayList<Integer> ageList = new ArrayList<Integer>();
        ArrayList<Integer> rateList = new ArrayList<Integer>(); 

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel genderLabel = new JLabel("Gênero: ");
        JTextField name = new JTextField();

        JLabel ageLabel = new JLabel("Idade: ");
        JTextField age = new JTextField();

        JLabel rateLabel = new JLabel("Avaliação (0 a 10): ");
        JTextField rate = new JTextField();

        panel.add(genderLabel);
        panel.add(name);
        panel.add(ageLabel);
        panel.add(age);
        panel.add(rateLabel);
        panel.add(rate);
        
        int result = JOptionPane.showConfirmDialog(null, panel, title, JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            FormData formData = new FormData();
            formData.name = nameField.getText();
            formData.age = (int) ageSpinner.getValue();
            formData.rate = (int) rateSpinner.getValue();
            return formData;
        } else {
            return null; // ou lançar uma exceção, dependendo do comportamento desejado
        }
    }
    
}
