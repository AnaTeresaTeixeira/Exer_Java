package tarefa;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ex02 {
    
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.println("Introduza um número: ");
    int num = in.nextInt();
    String out = "";
    
    switch(num){
        case 0:
            out = "Zero";
            break;
        case 1:
            out = "Um";
            break;
        case 2:
            out = "Dois";
            break;
        case 3:
            out = "Três";
            break;
        case 4:
            out = "Quatro";
            break;
        case 5:
            out = "Cinco";
            break;
        case 6:
            out = "Seis";
            break;
        case 7:
            out = "Sete";
            break;
        case 8:
            out = "Oito";
            break;
        case 9:
            out = "Nove";
            break;
        case 10:
            out = "Dez";
            break;
        default:
            out = "Erro";
    }
            
    JOptionPane.showMessageDialog(null, out);
    
    }
}
