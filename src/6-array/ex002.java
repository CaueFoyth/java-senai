import javax.swing.JOptionPane;

//Não terminar o exercício

public class ex002 {
    public static void main(String[] args) {
        int[] firstGrade = new int[5];
        int[] secondGrade = new int[5];
        int[] thirdGrade = new int[5];
        int[] averageGrade = new int[5];
        int wheightGrade = 0;

        for (int i = 0; i < 5; i++) {
            firstGrade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeira nota: ", "Notas", JOptionPane.QUESTION_MESSAGE));
            secondGrade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Segunda nota: ", "Notas", JOptionPane.QUESTION_MESSAGE));
            thirdGrade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Terceira nota: ", "Notas", JOptionPane.QUESTION_MESSAGE));
            wheightGrade = Integer.parseInt(JOptionPane.showInputDialog(null, "Peso da "+i+1+"° nota: ", "Notas", JOptionPane.QUESTION_MESSAGE));

            averageGrade[i] = (firstGrade[i] + secondGrade[i] + thirdGrade[i]) / 3;
            JOptionPane.showMessageDialog(null, "Média: " + averageGrade[i], "Notas", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
