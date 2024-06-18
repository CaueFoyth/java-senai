import javax.swing.JOptionPane;

public class ex003 {
    public static void main(String[] args) {

        int[] students = new int[30];
        int averageGrade = 0;
        int amountHigherThenAverage = 0;
        JOptionPane.showMessageDialog(null, "Programa para saber a média da turma e quantos alunos ficaram acima da média.", "Programa de array", JOptionPane.INFORMATION_MESSAGE);
        for (int i = 0; i < students.length; i++) {
            students[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a" + (i + 1) + " nota: ", "Notas", JOptionPane.QUESTION_MESSAGE));
            while(students[i] < 0 || students[i] > 10){
                students[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Nota inválida. Digite novamente a " + (i + 1) + "° nota: ", "Notas", JOptionPane.QUESTION_MESSAGE));
            }
            if(students[i] >= 7){
                amountHigherThenAverage++;
            }

            averageGrade += students[i];
        }
        averageGrade /= students.length;
        JOptionPane.showMessageDialog(null, "Média da turma: " + averageGrade + "\nQuantidade de alunos acima da média: " + amountHigherThenAverage, "Notas", JOptionPane.INFORMATION_MESSAGE);
    }
}