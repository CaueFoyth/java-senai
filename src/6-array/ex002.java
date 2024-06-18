import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class ex002 {
    public static void main(String[] args) {
        int[] firstGrade = new int[5];
        int[] secondGrade = new int[5];
        int[] thirdGrade = new int[5];
        double[] averageGrade = new double[5];

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");

        JOptionPane.showMessageDialog(null, "Programa para mostrar as notas e média de cada um dos alunos", "Programa de array", JOptionPane.INFORMATION_MESSAGE);
        for (int i = 0; i < 5; i++) {
            firstGrade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Primeira nota do aluno " + (i+1) + ": ", "Notas", JOptionPane.QUESTION_MESSAGE));
            secondGrade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Segunda nota do aluno " + (i+1) + ": ", "Notas", JOptionPane.QUESTION_MESSAGE));
            thirdGrade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Terceira nota do aluno " + (i+1) + ": ", "Notas", JOptionPane.QUESTION_MESSAGE));

            averageGrade[i] = ((firstGrade[i]*0.2) + (secondGrade[i]*0.3) + (thirdGrade[i]*0.5)) / (0.2 + 0.3 + 0.5);
        }
        for (int i = 0; i < averageGrade.length; i++) {
            JOptionPane.showMessageDialog(null,"Aluno " + (i+1) + "| Notas: " + firstGrade[i] + " " + secondGrade[i] + " " + thirdGrade[i] + " | Média: " + df.format(averageGrade[i]), "Notas", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
