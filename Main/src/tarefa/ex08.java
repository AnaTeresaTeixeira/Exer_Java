package tarefa;

import javax.swing.JOptionPane;

public class ex08 {
    
    public static void main(String[] args){
        
        String resposta="Sim";
        
        if(resposta=="Sim"){

        do{
           
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?"));
            if(idade<=45){idade = 0;}
            else{idade = ((idade-45)*5);}

            int servico = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos anos tem de serviço?"));
            if(servico<=10){servico = servico*10;}
            else{servico = (((servico-10)*20)+(10*10));}

            int filhos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos filhos tem?"));
            if(filhos<=3){filhos = filhos*25;}
            else{filhos = 75;}

            int resultado = idade + servico + filhos;
            JOptionPane.showMessageDialog(null, resultado); 

        }while(resposta=="Sim");
        
        resposta = JOptionPane.showInputDialog(null, "Quer iniciar o programa?");
        }
        
    }
    
}
