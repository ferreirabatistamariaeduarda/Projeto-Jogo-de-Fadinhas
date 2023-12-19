import java.util.Scanner;

public class JogoWinx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Personagem jogador1 = new Stella();
        Personagem jogador2 = new IcyBruxa();

        // Batalha
        System.out.println("Batalha iniciada entre " + jogador1.getNome() + " e " + jogador2.getNome());

        while (jogador1.getVida() > 0 && jogador2.getVida() > 0) {
            // Turno do jogador 1
            System.out.println("Turno de " + jogador1.getNome());
            mostrarOpcoes(jogador1);
            int escolhaJogador1 = lerEscolha(scanner);
            processarAcao(jogador1, jogador2, escolhaJogador1);

            // Verifica se o jogador 2 foi derrotado
            if (jogador2.getVida() <= 0) {
                break;
            }

            // Turno do jogador 2
            System.out.println("Turno de " + jogador2.getNome());
            mostrarOpcoes(jogador2);
            int escolhaJogador2 = lerEscolha(scanner);
            processarAcao(jogador2, jogador1, escolhaJogador2);

            // Verifica se o jogador 1 foi derrotado
            if (jogador1.getVida() <= 0) {
                break;
            }
        }

        // Resultados da Batalha
        System.out.println("**** Resultado da Batalha: ****");
        System.out.println("Vencedor: " + ((jogador1.getVida() > jogador2.getVida()) ? jogador1.getNome() : jogador2.getNome()));
        System.out.println("Vida restante do " + jogador1.getNome() + ": " + jogador1.getVida());
        System.out.println("Vida restante do " + jogador2.getNome() + ": " + jogador2.getVida());
    }

    private static void mostrarOpcoes(Personagem jogador) {
        System.out.println("*** Escolha a ação: ***");
        System.out.println("1. Atacar com " + jogador.getPoder());
        System.out.println("2. Usar Poder Especial: " + jogador.getPoderEspecial());
    }

    private static int lerEscolha(Scanner scanner) {
        System.out.print("Digite o número da ação escolhida: ");
        return scanner.nextInt();
    }

    private static void processarAcao(Personagem atacante, Personagem alvo, int escolha) {
        if (escolha == 1) {
            atacante.atacar(alvo);
        } else if (escolha == 2) {
            atacante.usarPoderEspecial();
        } else {
            System.out.println("Ação inválida. Perdeu o turno.");
        }
    }
}