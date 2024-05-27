import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JCheckBox;

public class ex004 {
    public static void main(String[] args) {
        String name;
        int duration;
        boolean ligthViolationScene = false;
        boolean mediumViolationScene = false;
        boolean hardViolationScene = false;
        boolean ligthSexScene = false;
        boolean mediumSexScene = false;
        boolean hardSexScene = false;
        boolean lightNudityScene = false;
        boolean mediumNudityScene = false;
        boolean hardNudityScene = false;
        boolean lightDrugsScene = false;
        boolean mediumDrugsScene = false;
        boolean hardDrugsScene = false;

        int result;
        
        name = JOptionPane.showInputDialog(null, "Nome do Filme: ", "Nome", JOptionPane.QUESTION_MESSAGE);
        duration = Integer.parseInt(JOptionPane.showInputDialog(null, "Duração do filme (Minutos): ", "Duração", JOptionPane.QUESTION_MESSAGE));
        if (duration < 0) {
            duration = Integer.parseInt(JOptionPane.showInputDialog(null, "Duração inválida, informe novamente: ", "Duração", JOptionPane.QUESTION_MESSAGE)); 
        }

        JPanel panel1 = new JPanel();
        JCheckBox ligthViolationCheckBox = new JCheckBox("Cena de violência leve");
        JCheckBox mediumViolationCheckBox = new JCheckBox("Cena de violência media");
        JCheckBox hardViolationCheckBox = new JCheckBox("Cena de violencia grave");
        panel1.add(ligthViolationCheckBox);
        panel1.add(mediumViolationCheckBox);
        panel1.add(hardViolationCheckBox);
        result = JOptionPane.showConfirmDialog(null, panel1, "Cenas de violência (Se não houver, deixe o campo em branco)", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            ligthViolationScene = ligthViolationCheckBox.isSelected();
            mediumViolationScene = mediumViolationCheckBox.isSelected();
            hardViolationScene = hardViolationCheckBox.isSelected();
        }

        JPanel panel2 = new JPanel();
        JCheckBox ligthSexCheckBox = new JCheckBox("Cena de sexo leve");
        JCheckBox mediumSexCheckBox = new JCheckBox("Cena de sexo media");
        JCheckBox hardSexCheckBox = new JCheckBox("Cena de sexo grave");
        panel2.add(ligthSexCheckBox);
        panel2.add(mediumSexCheckBox);
        panel2.add(hardSexCheckBox);
        result = JOptionPane.showConfirmDialog(null, panel2, "Cenas de sexo (Se não houver, deixe o campo em branco)", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            ligthViolationScene = ligthSexCheckBox.isSelected();
            mediumViolationScene = mediumSexCheckBox.isSelected();
            hardViolationScene = hardSexCheckBox.isSelected();
        }

        JPanel panel3 = new JPanel();
        JCheckBox ligthNudityCheckBox = new JCheckBox("Cena de nudismo leve");
        JCheckBox mediumNudityCheckBox = new JCheckBox("Cena de nudismo media");
        JCheckBox hardNudityCheckBox = new JCheckBox("Cena de nudismo grave");
        panel3.add(ligthNudityCheckBox);
        panel3.add(mediumNudityCheckBox);
        panel3.add(hardNudityCheckBox);
        result = JOptionPane.showConfirmDialog(null, panel3, "Cenas de nudismo (Se não houver, deixe o campo em branco)", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            lightNudityScene = ligthNudityCheckBox.isSelected();
            mediumNudityScene = mediumNudityCheckBox.isSelected();
            hardNudityScene = hardNudityCheckBox.isSelected();
        }

        JPanel panel4 = new JPanel();
        JCheckBox ligthDrugsCheckBox = new JCheckBox("Cena de drogas leve");
        JCheckBox mediumDrugsCheckBox = new JCheckBox("Cena de drogas media");
        JCheckBox hardDrugsCheckBox = new JCheckBox("Cena de drogas grave");
        panel4.add(ligthDrugsCheckBox);
        panel4.add(mediumDrugsCheckBox);
        panel4.add(hardDrugsCheckBox);
        result = JOptionPane.showConfirmDialog(null, panel4, "Cenas de drogas (Se não houver, deixe o campo em branco)", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            lightDrugsScene = ligthDrugsCheckBox.isSelected();
            mediumDrugsScene = mediumDrugsCheckBox.isSelected();
            hardDrugsScene = hardDrugsCheckBox.isSelected();
        }

        if(hardDrugsScene==true && hardNudityScene==true && hardSexScene==true && hardViolationScene==true){
            JOptionPane.showMessageDialog(null, "O filme " + name +" tem "+ duration+" minutos e é indicado para maiores de 18 anos ", "Classificação", JOptionPane.INFORMATION_MESSAGE);
        }else if(hardDrugsScene==true || hardNudityScene==true || hardSexScene==true || hardViolationScene==true){
            JOptionPane.showMessageDialog(null, "O filme " + name +" tem "+ duration+" minutos e é indicado para maiores de 16 anos ", "Classificação", JOptionPane.INFORMATION_MESSAGE);        
        }else if(mediumDrugsScene==true || mediumNudityScene==true || mediumSexScene==true || mediumViolationScene==true){
            JOptionPane.showMessageDialog(null, "O filme " + name +" tem "+ duration+" minutos e é indicado para maiores de 14 anos ", "Classificação", JOptionPane.INFORMATION_MESSAGE);
        }else if(lightDrugsScene==true || lightNudityScene==true || ligthSexScene==true || ligthViolationScene==true){
            JOptionPane.showMessageDialog(null, "O filme " + name +" tem "+ duration+" minutos e é indicado para maiores de 12 anos ", "Classificação", JOptionPane.INFORMATION_MESSAGE);
        }else{
            javax.swing.JOptionPane.showMessageDialog(null, "O filme " + name +" tem "+ duration+" minutos e é indicado para todas as idades ", "Classificação", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}