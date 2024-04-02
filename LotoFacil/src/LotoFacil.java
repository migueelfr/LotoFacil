import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
public class LotoFacil {

    public static void main(String[] args) {
        System.out.println("Loto Facil com Aramuni");
        int opcao = -1;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("********** Loto Facil **********");
            System.out.println("Aposta 1: números de 1 a 100");
            System.out.println("Aposta 2: Letra de A a Z");
            System.out.println("Aposta 3: Apostas números impares ou pares");
            opcao = in.nextInt();
            System.out.println("*****************************************");
            switch (opcao){
                case 1:
                    System.out.println("Aposta 1 escolhida.");
                    Aposta1();
                    break;
                case 2:
                    System.out.println("Aposta 2 escolhida.");
                    Aposta2();
                    break;
                case 3:
                    System.out.println("Aposta 3 escolhida.");
                    Aposta3();
                    break;
                default:
                    System.out.println("O número escolhido é inválido!.");
            }
        }while(opcao != 0);
    }
    private static void Aposta1(){
        System.out.println("digite um valor entre zero e cem:");
        Scanner s = new Scanner(System.in);
        int aposta = s.nextInt();
        if(aposta < 0 || aposta >100 ) {
            System.out.println("valor invalido");
        } else {
            double numeroAleatorio = Math.random() * 101;
            int oi = (int)numeroAleatorio;
            System.out.println("número sorteado " + oi);
            if( aposta == oi){
                System.out.println("o apostador ganhou 1000 R$");
            } if( aposta != oi){
                System.out.println("Perdeu seu TROUXA!!!");
            }
        }
        }
        private static void Aposta2() {
            System.out.println("Digite uma letra de A até Z: ");
            Scanner s = new Scanner(System.in);

            try {
                char letra = (char) System.in.read();
                if (Character.isLetter(letra)) {
                    letra = (Character.toUpperCase(letra));
                    if (letra >= 'A' && letra <= 'Z') {
                        System.out.println("Sua letra é: " + letra);
                        Random random = new Random();
                        int numeroAleatorio = random.nextInt(26) + 65;
                        char letraAleatorio = (char) numeroAleatorio;
                        System.out.println("letra sorteada: " + letraAleatorio);
                        if (letra == letraAleatorio) {
                            System.out.println("o apostador ganhou 500 R$");

                        } else if (letra != letraAleatorio) {
                            System.out.println("Não foi dessa vez, OTÁRIO!!!");
                        }
                    }
                } else {
                    System.out.println("Aposta inválida.");

                }

            } catch (IOException e) {
                System.out.println("Erro ao ler entrada do teclado: " + e.getMessage());
            }
        }
            private static void Aposta3 () {
                System.out.println("Digite um número:");
                Scanner s = new Scanner(System.in);
                int numDigitado = s.nextInt();
                if (numDigitado % 2 == 0) {
                    System.out.println("Voce ganhou 100 R$" );
                } else {
                    System.out.println("Perdeu de novo, OTARIO!!!!!!");
                }
            }

            }

