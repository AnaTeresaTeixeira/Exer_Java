package tarefa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex01 {

    public static void main(String[] args) {
        
        Date dataHoraAtual = new Date();
        String hora = new SimpleDateFormat("HH").format(dataHoraAtual);
        String resposta;
        
        int hour = Integer.parseInt(hora);
        System.out.println(hour);
        
        if(hour>=8 && hour<=11){
            resposta = "Bom dia";
        } 
        if(hour>=12 && hour<=19){
            resposta = "Boa tarde";
        } else {
            resposta = "Boa noite";
        }
        
        System.out.println(resposta);
    }
    
}
