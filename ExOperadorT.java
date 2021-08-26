import javax.swing.*;

public class ExOperadorT {
    public static void main(String[] args) throws Exception {

        /* 2. Escreva um programa que obtém a idade de uma pessoa e diz se ela é maior,segundo a legislação  brasileira.  
        Escreva uma versão com if/else e outra com ooperador ternário. */

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? :)"));

        String maiorMenorIdadade;
        
        maiorMenorIdadade = idade >= 18 ? "Você é maior de idade" : "Você é menor de idade";
        JOptionPane.showMessageDialog(null, maiorMenorIdadade);
     }
 }
