import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int tamanho = 500;
        int[] vetor = gerarVetor(tamanho);

        // Teste do vetor aleatório
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(i + " - " + vetor[i]);
        }

        // NÚMERO 2

        long startTime = System.currentTimeMillis();
        
        System.out.println(maxVal1(vetor, tamanho));

        long endTime = System.currentTimeMillis();
        double v = (double) (endTime - startTime) / 1000;
        System.out.println("Tempo gasto questão 1: " + v);

        // NÚMERO 3

    }

    public static int[] gerarVetor(int tamanho) {
        Random gerador = new Random();
        int[] vetAux = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetAux[i] = gerador.nextInt(100) + 1;
            if (vetAux[i] < 0) {
                vetAux[i] = vetAux[i] * -1;
            }
        }
        return vetAux;
    }

    public static void numero1() {

    }

    // NÚMERO 2

    public static int maxVal1(int A[], int n) {
        int numeroIteracao = 0;
        int max = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] > max)
                max = A[i];
            numeroIteracao++;
        }
        System.out.println("Número de iterações: " + numeroIteracao);
        return max;
    }
}