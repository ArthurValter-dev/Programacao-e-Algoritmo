/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idade_arthur_valter;
import javax.swing.JOptionPane;


public class Idade_Arthur_Valter {

    public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("Diga seu ano de nascimento");
    int Anis = Integer.parseInt(input);
    int Idade = 2026 - Anis;
    if (Idade >= 18){
        JOptionPane.showMessageDialog(null,"Voce e maior de idade, sua idade: "+Idade+" anos");
    }else{
        JOptionPane.showMessageDialog(null,"Voce nao e maior de idade,pois sua e idade: "+Idade+" anos");
    }
        }
    }
    

