package teste;

public class PiramideNumeros {
    static void main() {
        int linhas = 5;
            for (int i = 1; i <= linhas; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
            }
    }
}

