package tarefa;

public class TestaDd extends DdMaior{
    
    public static void main(String[] args){
        
        // instanciar a classe: variavel que faz referencia a um objeto
        DdMaior numero = new DdMaior();
        
        // atribuir valores ao metodo setVerificar
        numero.setVerificar(3, 6);
        
        // chamar pelo return do metodo setVerificar
        System.out.println(numero.getVerificar());
        
    }
    
}
