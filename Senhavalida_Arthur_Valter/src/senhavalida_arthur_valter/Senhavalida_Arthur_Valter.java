/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package senhavalida_arthur_valter;

import javax.swing.JOptionPane;
public class Senhavalida_Arthur_Valter {

    public static void main(String[] args) {
        String Csenha;
        Csenha = "dcba";
        String senha = JOptionPane.showInputDialog(null,"Digite a senha de quatro digitos ");
        
        if(senha.equals(Csenha)){
            JOptionPane.showMessageDialog(null,"Senha correta");
        }else{
            JOptionPane.showMessageDialog(null,"Senha incorreta");
        }
      
    }
    
}
