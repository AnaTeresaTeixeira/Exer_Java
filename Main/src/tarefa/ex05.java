package tarefa;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ex05 {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int[] array = new int[10];
        int i=0;
        int a=1;
        
        while(i<=9){
            array[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza o " + a + "º número: "));
            i++;
            a++;
        }
        
        System.out.println(Arrays.toString(array));
        
        int b=0;
        
        for(i=0; i<10;i++){
            if(array[i]%2==0){
                b++;
            }  
        }
        System.out.println(b + " números são pares.");
    }
    
}
