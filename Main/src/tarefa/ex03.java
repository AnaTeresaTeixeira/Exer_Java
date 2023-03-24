package tarefa;

public class ex03 {
    
    public static void main(String[] args){
        
    int num = 10;
    int i = 1;
    String a = "*";
    
    while(num>0){
        if(num==10){ System.out.println(a.repeat(num) + "(" + num + ")" + a.repeat(i) + "(" + "0" + i + ")");}
        if(num<10 && i<10){ System.out.println(a.repeat(num) + "(" + "0" + num + ")" + a.repeat(i) + "(" + "0" + i + ")");}
        if(num==1){ System.out.println(a.repeat(num) + "(" + "0" + num + ")" + a.repeat(i) + "(" + i + ")");}
        num--;
        i++;
    }

    }
    
}
