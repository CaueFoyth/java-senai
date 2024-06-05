import javax.swing.JOptionPane;

public class ex004 {
    static int totalPoints = 0;
    boolean continuePlaying;
    static String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    static int cardValue;
    static int cardPosition = 0;
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem vindo ao jogo 21", "Jogo 21", JOptionPane.INFORMATION_MESSAGE);

        while (totalPoints < 21) {
            cardPosition = (int)(Math.random() * 12) + 0;
            if(cards[cardPosition].equals("J") || cards[cardPosition].equals("Q") || cards[cardPosition].equals("K")) {
                cardValue = 10;
            }else if(cards[cardPosition].equals("A")) {
                cardValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja que seja valor 1 ou 11?", "Jogo 21", JOptionPane.QUESTION_MESSAGE));
                while(cardValue != 0 && cardValue != 1) {
                    cardValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor incorreto. Informe 1 ou 11?", "Jogo 21", JOptionPane.QUESTION_MESSAGE));
                }
            }else{
                cardValue = Integer.parseInt(cards[cardPosition]);
            }
            totalPoints += cardValue;
            JOptionPane.showMessageDialog(null, "O valor do seu novo card é: "+ cards[cardPosition] + "\nTotal: " + totalPoints, "Jogo 21", JOptionPane.INFORMATION_MESSAGE);
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
