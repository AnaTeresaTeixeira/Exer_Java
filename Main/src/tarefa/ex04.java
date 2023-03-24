package tarefa;

import java.util.Scanner;

public class ex04 {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um número: ");
        int num = in.nextInt();
        int i=1;
        
        while(i<=10){
            System.out.println(num + " x " + i + " = " + num*i);
            i++;
        }
        
    }
}
