package tarefa;

public class DdMaior {
    
    // declarar as variaveis
    public int primeiro;
    public int segundo;

    // criar o construtor que recebe os dados para adicionar as variaveis
    public void setVerificar(int primeiro, int segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }
    
    // criar o metodo que vai retornar um valor
    public int getVerificar(){
        
        int resultado;
        
        if(this.primeiro>this.segundo){
            resultado = this.primeiro;
        }
        else {
            resultado = this.segundo;
        }
        
        return resultado;
    };

}
