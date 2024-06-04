import javax.swing.JOptionPane;

public class ex003 {
    public static void main(String[] args) {
        StringBuilder primeNumber = new StringBuilder();

        for(int number = 0; number <= 100; number++) {
            primeNumber.append(checkPrime(number));
        }

        JOptionPane.showMessageDialog(null,"Números primos: " + primeNumber.toString(), "Primos", JOptionPane.INFORMATION_MESSAGE);
    }
    public static String checkPrime(int n){  
        int i,m=0;
        m=n/2;      
        if(n!=0&&n!=1){ 
            for(i=2;i<=m;i++){      
                if(n%i==0){      
                    return "";     
                }      
            } 
            return n + ", ";     
        }
        return "";
    }    
}
