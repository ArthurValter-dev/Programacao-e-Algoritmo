/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc_arthur_valter;


import javax.swing.JOptionPane;
public class IMC_Arthur_Valter {
 public static void main(String[] args) {
     String sexo= JOptionPane.showInputDialog(null,("Diga se voce e homem ou mulher com 'masc' ou 'fem'"));
        
        double altura=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua altura"));
        double peso=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu peso"));
        
        
        
        if (sexo.equals("masc")){
           peso=(72.7*altura)-58;
          JOptionPane.showMessageDialog(null,"masculino,seu peso ideal e: "+peso);}
        else if (sexo.equals("fem")){
            peso=(62.1*altura)-44.7;
              JOptionPane.showMessageDialog(null,"feminino,seu peso ideal e: "+peso);}
          
        
        
        
 }
    }
    

