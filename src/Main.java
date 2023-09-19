public class Main {
    public static void main(String[] args) {
        // class objeto = construtor
        Turista mochileiro = new Turista();
        //definir formato do objeto
        mochileiro.nome = "Fernando";
        mochileiro.cpf = "12345678901";
        //definir comportamento
        String retorno = mochileiro.viajar();
        System.out.println(retorno);
    }
}