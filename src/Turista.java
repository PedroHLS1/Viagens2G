public class Turista {
    //atributos
    String nome;
    String cpf;
    //métodos
    public String viajar(){
        return "Viajando...";
    }
    //construtor padrão
    Turista(){}
    //sobrecarga do construtor personalizado
    Turista(String _nome){
        this.nome = _nome;
    }
}
