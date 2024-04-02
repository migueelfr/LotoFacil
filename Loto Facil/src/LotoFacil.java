import java.util.Scanner;
public class LotoFacil {

    public static void main(String[] args) {
        System.out.println("Exemplo de while");
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
                    System.out.println("Aposta 2 escolhida.");
                    Aposta3();
                    break;
                default:
                    System.out.println("O número escolhido é inválido!.");
            }
        }while(opcao != 0);
    }
    private static void Aposta1(){

    }
    private static void Aposta2(){

    }
    private static void Aposta3(){

    }