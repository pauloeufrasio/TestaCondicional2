public class Testecondional2 {

            public static void main(String[] args) {
                System.out.println("testando condicionais");

                int idade = 15;
                int quantidadePessoas = 1;
                // Usando uma variavel do tipo boolean pra testar se est� acompanhado ou n�o
                boolean acompanhado;

                // testando condi��o se a quantidadePessoas for maior que 2 a variavel acompanhado � verdadeiro
                if (quantidadePessoas >= 2) {
                    acompanhado = true;
                } else {
                // Se nao a variavel acompanhado tem que me retornar falso
                    acompanhado = false;
                }
                // Testando condi��o se idade for maior que 18 ou acompanhado for verdadeiro ele pode acessar sen�o ele nao esta encaixado as regras do programa
                if (idade >= 18 || acompanhado) {

                    System.out.println("Seja bem vindo");
                } else {
                    System.out.println("infelizmente voce nao pode entrar");
                }

            }
        }



