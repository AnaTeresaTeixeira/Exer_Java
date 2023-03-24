package tarefa;

import javax.swing.JOptionPane;

public class ex06 {
    
    public static void main(String[] args){
        
        String nome = JOptionPane.showInputDialog(null, "Introduza o seu nome: ");
        String apelido = JOptionPane.showInputDialog(null, "Introduza o seu apelido: ");
        
        JOptionPane.showMessageDialog(null, "O seu nome é " + apelido + ", " + nome);
    }
   
}
