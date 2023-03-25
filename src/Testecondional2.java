public class Testecondional2 {

            public static void main(String[] args) {
                System.out.println("testando condicionais");

                int idade = 15;
                int quantidadePessoas = 1;
                // Usando uma variavel do tipo boolean pra testar se está acompanhado ou não
                boolean acompanhado;

                // testando condição se a quantidadePessoas for maior que 2 a variavel acompanhado é verdadeiro
                if (quantidadePessoas >= 2) {
                    acompanhado = true;
                } else {
                // Se nao a variavel acompanhado tem que me retornar falso
                    acompanhado = false;
                }
                // Testando condição se idade for maior que 18 ou acompanhado for verdadeiro ele pode acessar senão ele nao esta encaixado as regras do programa
                if (idade >= 18 || acompanhado) {

                    System.out.println("Seja bem vindo");
                } else {
                    System.out.println("infelizmente voce nao pode entrar");
                }

            }
        }



