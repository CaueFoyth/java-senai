import javax.swing.JOptionPane;

public class ex004 {
    static int totalPoints = 0;
    boolean continuePlaying;
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem vindo ao jogo 21", "Jogo 21", JOptionPane.INFORMATION_MESSAGE);

        while (totalPoints < 21) {
            int cardValue = (int) (Math.random() * 10) + 1;
            totalPoints += cardValue;
            JOptionPane.showMessageDialog(null, "O valor do seu novo card é: "+ cardValue + "\nTotal: " + totalPoints, "Jogo 21", JOptionPane.INFORMATION_MESSAGE);
            if (totalPoints >= 21) { break; }

            int continuePlaying = JOptionPane.showConfirmDialog(null, "Deseja continuar jogando?", "Jogo 21", JOptionPane.YES_NO_OPTION);

            if (continuePlaying == 1) { break; }
        }
        if(totalPoints == 21) {
            JOptionPane.showMessageDialog(null, "Parabéns, você ganhou!", "Jogo 21", JOptionPane.INFORMATION_MESSAGE);
        }else if(totalPoints < 21) {
            JOptionPane.showMessageDialog(null, "Sua pontuação foi de: " + totalPoints, "Jogo 21", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "Infelizmente, você perdeu!", "Jogo 21", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
