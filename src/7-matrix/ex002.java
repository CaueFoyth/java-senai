import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
public class ex002 {
    public static void main(String[] args) {
        int[][] matrixA = new int[4][4];
        int[][] matrixB = new int[4][4];
        int amountEquals = 0;

        JOptionPane.showMessageDialog(null, "Programa para saber a quantidade de elementos iguais entre as duas matrizes 4x4 de inteiros", "Programa de matriz de inteiros", JOptionPane.INFORMATION_MESSAGE);
        matrixA = intsertMatrix(matrixA);
        matrixB = intsertMatrix(matrixB);   
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrixA[i][j] == matrixB[i][j]) {
                    amountEquals++;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "A quantidade de elementos iguais entre as duas matrizes é: " + amountEquals, "Quantidade de elementos iguais de matriz de inteiros", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int[][] intsertMatrix(int[][] matrix) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        JTextField[][] fields = new JTextField[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                fields[i][j] = new JTextField();
                panel.add(fields[i][j]);
            }
        }
        if (JOptionPane.showConfirmDialog(null, panel, "Insira a Matriz de matriz de inteiros", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    matrix[i][j] = Integer.parseInt(fields[i][j].getText());
                }
            }
        }
        return matrix;
    }
}
