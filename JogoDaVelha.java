import java.util.Random;    
import java.util.Scanner;

class JogoDaVelha {
    private static Scanner teclado = new Scanner(System.in);
    private JogoDaVelha_Mapa mapa;
    private JogoDaVelha_PC pc;
    private JogoDaVelha_Jogador jogador;

    public JogoDaVelha() {
        mapa = new JogoDaVelha_Mapa();
        pc = new JogoDaVelha_PC();
        jogador = new JogoDaVelha_Jogador();
    }

    public void jogar() {
        mapa.limparMapa();
        boolean vezJogador = mapa.sortear();
        int jogadas = 0;
        
        while (jogadas < 5) {
            System.out.println("\n--- Rodada " + (jogadas + 1) + " ---");
            mapa.desenharMapa();
            
            jogador.joga(mapa, teclado);
            if (mapa.verificarVitoria('X')) {
                mapa.desenharMapa();
                System.out.println(" Jogador X GANHOU!");
                return;
            }
            
            if (jogadas < 4) {
                pc.joga(mapa);
                if (mapa.verificarVitoria('O')) {
                    mapa.desenharMapa();
                    System.out.println(" PC GANHOU!");
                    return;
                }
            }
            
            jogadas++;
        }
        
        mapa.desenharMapa();
        System.out.println("\u2696\uFE0F Empate!");
    }

    public static void main(String[] args) {
        do {
            JogoDaVelha jogo = new JogoDaVelha();
            jogo.jogar();
            System.out.println("\nDeseja jogar novamente? (s/n)");
        } while (teclado.next().equalsIgnoreCase("s"));
    }
}

class JogoDaVelha_Mapa {
    private char[][] mapa = new char[3][3];
    private Random random = new Random();

    public void limparMapa() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mapa[i][j] = ' ';
            }
        }
    }

    public boolean sortear() {
        return random.nextBoolean();
    }

    public void desenharMapa() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + mapa[i][j] + " ");
            }
            System.out.println("|");
            System.out.println("-------------");
        }
    }

    public boolean marcar(int linha, int coluna, char letra) {
        if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && mapa[linha][coluna] == ' ') {
            mapa[linha][coluna] = letra;
            return true;
        }
        return false;
    }

    public boolean verificarVitoria(char letra) {
        for (int i = 0; i < 3; i++) {
            if (mapa[i][0] == letra && mapa[i][1] == letra && mapa[i][2] == letra) return true;
            if (mapa[0][i] == letra && mapa[1][i] == letra && mapa[2][i] == letra) return true;
        }
        if (mapa[0][0] == letra && mapa[1][1] == letra && mapa[2][2] == letra) return true;
        if (mapa[0][2] == letra && mapa[1][1] == letra && mapa[2][0] == letra) return true;
        return false;
    }
}

class JogoDaVelha_PC {
    private Random random = new Random();

    public void joga(JogoDaVelha_Mapa mapa) {
        int linha, coluna;
        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);
        } while (!mapa.marcar(linha, coluna, 'O'));
    }
}

class JogoDaVelha_Jogador {
    public void joga(JogoDaVelha_Mapa mapa, Scanner teclado) {
        int linha, coluna;
        do {
            System.out.println("Digite linha e coluna (0-2): ");
            linha = teclado.nextInt();
            coluna = teclado.nextInt();
        } while (!mapa.marcar(linha, coluna, 'X'));
    }
}
