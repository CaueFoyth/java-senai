import javax.swing.JOptionPane;

public class ex004 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Programa de jogo de adivinhacao, você tem 5 chances para acertar um número", "Jogo", JOptionPane.INFORMATION_MESSAGE);
        int raffleNumber = (int) (Math.random() * 10) + 1;
        boolean result = false;

        for(int i = 0; i < 5; i++) {
            int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor de 1 a 10: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
            result = raffle(number, raffleNumber);
            if(result) {
                break;
            }
        }
        if(result){
            JOptionPane.showMessageDialog(null, "PARABÉNS! Você ganhou o brinde!", "Jogo", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Que pena. Infelizmente você não acertou. O número era " + raffleNumber + "!", "Jogo", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static boolean raffle(int number, int raffleNumber) {
        if(number == raffleNumber) {
            return true;
        } else {
            return false;
        }
    }
}