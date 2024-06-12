import javax.swing.JOptionPane;

public class ex003 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][2];
        int[][] transposeMatrix = new int[2][3];
        JOptionPane.showMessageDialog(null, "Programa para saber a transposta de uma matriz 3x2", "Programa de matriz", JOptionPane.INFORMATION_MESSAGE);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para " + (j+1) + "° coluna da " + (i+1) + "° linha: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        StringBuilder matrixTransposing = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                matrixTransposing.append(" " + String.valueOf(transposeMatrix[i][j]));
            }
            matrixTransposing.append("\n");
        }
        String formatedMatrix = matrixTransposing.toString();
        JOptionPane.showMessageDialog(null, "Matriz transposta: \n"+ formatedMatrix,"Transposta da matriz", JOptionPane.INFORMATION_MESSAGE);
    }
}