public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(String mensagem){
        super(mensagem); // super() acessa metodo de uma superclasse
                         // Sem o super ele da um valor nulo e nao exibe a mensagem
    }
}
