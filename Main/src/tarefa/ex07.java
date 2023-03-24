package tarefa;

import java.util.Arrays;

public class ex07 {
    
    public static void main(String[] args){
        
        int matriz [][] = new int [5] [5];
        
        int a = 0;
        int b = 4;
        int somae = 0;
        int somad = 0;
        
        for(int linha=0; linha<matriz.length;linha++){
            
            for(int coluna=0; coluna<matriz[linha].length;coluna++){
                
                double num = Math.random()*10;
                matriz[linha][coluna] = (int)num; 
            } 
        }
   
        for(int i=0;i<matriz.length;i++){
            somae += matriz[a][a]; 
            somad += matriz[a][b-i];
            a += 1;
        }
        
        
        System.out.println(Arrays.deepToString(matriz));
        System.out.println("Soma da diagonal esquerda: " + somae);
        System.out.println("Soma da diagonal direita: " + somad);

    }
    
}
