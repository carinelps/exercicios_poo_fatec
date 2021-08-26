import javax.swing.*;

public class ExPrimo {
    public static void main(String[] args) throws Exception {

        /* Escreva um programa que verifica se um número natural digitado pelo usuário é primo. */

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        int i, cont = 0;
        
        for (i = 1; i <= num; i++){

           if(num % i == 0){
               cont += 1;
           }
        }

        if (cont == 2){
            JOptionPane.showMessageDialog(null, num + " é primo.");
        }else{
            JOptionPane.showMessageDialog(null, num + " não é primo.");
         }
    }    
}