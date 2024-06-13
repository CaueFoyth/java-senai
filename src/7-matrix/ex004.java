import java.util.Arrays;

import javax.swing.JOptionPane;

public class ex004 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        JOptionPane.showMessageDialog(null, "Programa para saber o resto da divisão da diagonal principal e o produto da diagonal secundária de uma matriz 4x4", "Programa de matriz", JOptionPane.INFORMATION_MESSAGE);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para " + (j+1) + "° coluna da " + (i+1) + "° linha: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
            }
        }

        int primaryDiagonal = 0;
        int secondaryDiagonal = 3;
        int[] listPrimaryDiagonal = new int[4];
        int productSecondaryDiagonal = 0;
        for (primaryDiagonal = 0; primaryDiagonal < 4; primaryDiagonal++) {
            listPrimaryDiagonal[primaryDiagonal] = matrix[primaryDiagonal][primaryDiagonal]%2;
            productSecondaryDiagonal += matrix[primaryDiagonal][secondaryDiagonal];
            secondaryDiagonal--;
        }
        JOptionPane.showMessageDialog(null, "Resto da divisão da diagonal principal: " + Arrays.toString(listPrimaryDiagonal) + "\nProduto da diagonal secundária: " + productSecondaryDiagonal, "Diagonais", JOptionPane.INFORMATION_MESSAGE);
    }
}
 