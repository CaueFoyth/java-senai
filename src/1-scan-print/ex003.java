import javax.swing.JOptionPane;

public class ex003{ 
    public static void main(String[] args) {
        int celcius;

        celcius = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite uma temperatura em graus Celcius: ", "Informe uma temperatura", JOptionPane.QUESTION_MESSAGE));
    
        JOptionPane.showMessageDialog(null, celcius + "°C equivale: \n" + (celcius * 1.8) + "°F" + "\n" + (celcius + 273.15) + "°K", "Temperatura informada", JOptionPane.INFORMATION_MESSAGE);
    }
}