import javax.swing.JOptionPane;

public class ex002 {
    public static void main(String[] args) {
        int sideOne;
        int sideTwo;
        int sideThree;

        sideOne = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do primeiro lado: ", "Lado 1", JOptionPane.QUESTION_MESSAGE));
        sideTwo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do segundo lado: ", "Lado 2", JOptionPane.QUESTION_MESSAGE));
        sideThree = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do terceiro lado: ", "Lado 3", JOptionPane.QUESTION_MESSAGE));
    
        if (sideOne == sideTwo && sideOne == sideThree) {
            JOptionPane.showMessageDialog(null, "Triângulo equilátero", "Tipo de triângulo", JOptionPane.INFORMATION_MESSAGE);
        } else if (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) {
            JOptionPane.showMessageDialog(null, "Triângulo isoceles", "Tipo de triângulo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Triângulo escaleno", "Tipo de triângulo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
