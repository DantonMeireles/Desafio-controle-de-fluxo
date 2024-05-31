import java.util.Locale;
import java.util.Scanner; // Importei o scanner

public class Contador { // Criei a classe contador
    public static void main(String[] args) { // metodo main para poder rodar a aplicacao
        Scanner terminal = new Scanner(System.in); // scanner para perguntar no cmd
        System.out.println("Os parâmetros solicitados precisam ser números inteiros");
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt(); // pegando o primeiro numero
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt(); // pegando o segundo numero

        try { // bloco que pode conter uma excecao
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) { // bloco que trata excecao
            System.out.println(exception.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        // throws e usado para excecoes
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        int i;
        //realizar o for para imprimir os números com base na variável contagem*/
        for(i = 1; i <= contagem; i++){
            System.out.println("Imprimindo numero: "+i);
        }
    }
}

