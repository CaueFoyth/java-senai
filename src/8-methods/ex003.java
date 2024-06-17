import javax.swing.JOptionPane;

public class ex003 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Programa de conversão de metros", "Conversão", JOptionPane.INFORMATION_MESSAGE);
        float mesurement = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a media em metros: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
        while(mesurement < 0) {
            mesurement = Float.parseFloat(JOptionPane.showInputDialog(null, "Medida inválida. Digite novamente: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
        }
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Converter para: \n1 - Centimetros \n2 - Polegadas \n3 - Pés \n4 - Quilometros", "Conversão", JOptionPane.QUESTION_MESSAGE));
        while(number < 0 || number > 4) {
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "Opcão inválida. Tente novamente. \n1 - Centimetros \n2 - polegadas \n3 - pés \n4 - Quilometros", "Conversão", JOptionPane.QUESTION_MESSAGE));
        }
        String result = convert(mesurement, number);
        
        JOptionPane.showMessageDialog(null,"Resultado: "+ result, "Conversão", JOptionPane.INFORMATION_MESSAGE);
    }

    public static String convert(float mesurement, int number) {
        switch(number) {
            case 1:
                return (mesurement * 100) + " cm";
            case 2:
                return (mesurement * 39.3701) + " polegadas";
            case 3:
                return (mesurement * 3.28084) + " pés";
            case 4:
                return (mesurement * 0.001) + " km";
            default:
                return "";
        }
    }
}
