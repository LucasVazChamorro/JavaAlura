import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            int numeroUsurario = 0;
            Scanner leitura = new Scanner(System.in);
            int tentativas = 0;

            while (tentativas < 5) {
                System.out.println("Tente advinhar o número pensado pelo computador. \n Este número pode variar de 0 a 100: ");
                numeroUsurario = leitura.nextInt();
                tentativas++;


                if (randomNumber != numeroUsurario) {
                    System.out.println("Você errou, tente novamente!");

                    if (numeroUsurario < randomNumber) {
                        System.out.println("Dica: Você digitou um número inferior ao escolhido pela máquina!");
                    } else {
                        System.out.println("Dica: Você digitou um número superior ao escolhido pela máquina!");
                    }
                } else {
                    System.out.println("Você acertou o número em " + tentativas + ", parabéns!");
                    break;
                }
            }

            if (tentativas == 5 && numeroUsurario != randomNumber) {
                System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + randomNumber);
            }
        }
    }
