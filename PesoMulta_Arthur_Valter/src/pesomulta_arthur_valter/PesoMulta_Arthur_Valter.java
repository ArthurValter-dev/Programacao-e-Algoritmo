/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pesomulta_arthur_valter;
import javax.swing.JOptionPane;
public class PesoMulta_Arthur_Valter {

    public static void main(String[] args) {
        
      double exPP, Multa;  
      double PP = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o peso do peixe"));
      if(PP > 50){
          exPP = PP - 50;
          Multa = exPP * 4.0;
          JOptionPane.showMessageDialog(null,"Voce exedeu o peso");
          JOptionPane.showMessageDialog(null,"Sua multa e "+Multa);}
      else{
          JOptionPane.showMessageDialog(null,"Peso entro do limite");
      }
    }
    
}
