import javax.swing.JOptionPane;

public class ex001 {
    public static void main(String[] args) {
        double radius;
        double side;
        double width;
        double height;
        double base;

        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual você deseja calcular?\n1 - Circulo\n2 - Quadrado\n3 - Retangulo\n4 - Triangulo", "Número", JOptionPane.QUESTION_MESSAGE));

        switch (number) {
            case 1:
                radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do raio?", "Raio", JOptionPane.QUESTION_MESSAGE));
                if(radius <= 0) {
                    radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor inválido, insira novamente.", "Raio", JOptionPane.QUESTION_MESSAGE));
                }
                JOptionPane.showMessageDialog(null, "Circunferência = " + (2 * Math.PI * radius));
                break;

            case 2:
                side = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do lado?", "Lado", JOptionPane.QUESTION_MESSAGE));
                if(side <= 0) {
                    side = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor inválido, insira novamente.", "Lado", JOptionPane.QUESTION_MESSAGE));
                }
                JOptionPane.showMessageDialog(null, "Área = " + (Math.pow(side, 2)));
                break;

            case 3:
                width = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da largura?", "Largura", JOptionPane.QUESTION_MESSAGE));
                if(width <= 0) {
                    width = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor inválido, insira novamente.", "Largura", JOptionPane.QUESTION_MESSAGE));
                }

                height = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da altura?", "Altura", JOptionPane.QUESTION_MESSAGE));
                if(height <= 0) {
                    height = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor inválido, insira novamente.", "Altura", JOptionPane.QUESTION_MESSAGE));
                }
                JOptionPane.showMessageDialog(null, "Área = " + (width * height));
                break;

            case 4:
                base = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da base?", "Base", JOptionPane.QUESTION_MESSAGE));
                if(base <= 0) {
                    base = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor inválido, insira novamente.", "Base", JOptionPane.QUESTION_MESSAGE));
                }

                height = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da altura?", "Altura", JOptionPane.QUESTION_MESSAGE));
                if(height <= 0) {
                    height = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor inválido, insira novamente.", "Altura", JOptionPane.QUESTION_MESSAGE));
                }
                JOptionPane.showMessageDialog(null, "Área = " + (base * height) / 2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número inválido");
                break;
        }
    }
}