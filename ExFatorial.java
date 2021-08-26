import javax.swing.*;

public class ExFatorial {
    public static void main(String[] args) throws Exception {

        /* 3. Escreva um programa que calcula o fatorial de um valor natural digitado pelo usuário. */

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        int multi = 1, i;
        
        for (i = 1; i <= num; i++){
            multi = multi * i;
        }

        JOptionPane.showMessageDialog(null, num + "! é " + multi);
     }
 }
