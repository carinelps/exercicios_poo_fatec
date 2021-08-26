import javax.swing.*;

public class ExIfElseSalario {
    public static void main(String[] args) throws Exception {

        /*1. Escreva um programa que obtém o salário de uma pessoa e diz se ela está ganhandopelo menos o salário mínimo. */

        Double salario = Double.parseDouble(JOptionPane.showInputDialog("Quanto você recebe por mês?"));

        String salarioMinimo;

        if (salario < 1.100){
            salarioMinimo = "Você recebe menos que um salário mínimo :'(";
        
        }else{
            salarioMinimo = "Você recebe mais ou um salário mínimo :)";
        }

         JOptionPane.showMessageDialog(null, salarioMinimo);
     }
 }
