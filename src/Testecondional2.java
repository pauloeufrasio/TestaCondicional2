public class Testecondional2 {

    public static void main(String[] args) {
        // Usando operadores logicos
        System.out.println("Testando condicionais ");
        int idade = 20;
        int quantidadePessoa = 3;
        if (idade >= 18 || quantidadePessoa >= 2) { // Testando operado logico (OU)
            System.out.println("Voce tem mais de 18 anos "); // Testando condição
        } else {
            System.out.println("Infelizmente voce não pode entrar");
        }
    }
}

