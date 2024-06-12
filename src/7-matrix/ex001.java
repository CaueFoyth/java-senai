import javax.swing.JOptionPane;

public class ex001 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][5];
        int[] sumLine = new int[4];
        JOptionPane.showMessageDialog(null, "Programa para saber o calculo da soma de uma matriz 4x5 e a soma de cada linha", "Programa de matriz", JOptionPane.INFORMATION_MESSAGE);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para " + (j+1) + "° coluna da " + (i+1) + "° linha: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
                sumLine[i] += matrix[i][j];
            }
        }

        JOptionPane.showMessageDialog(null,"Soma da primeira linha: " + sumLine[0]+ "Soma da segunda linha: "+ sumLine[1] + "\nSoma da terceira linha: " + sumLine[2] + "\nSoma da quarta linha: " + sumLine[3]+"\nSoma da matriz: " + (sumLine[0] + sumLine[1] + sumLine[2] + sumLine[3]),"Somas da matriz", JOptionPane.INFORMATION_MESSAGE);
    }
}
