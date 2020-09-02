
public class Main {

    // static double v;
    static Algoritmos algoritmo = new Algoritmos();

    public static void main(String[] args) {

        long startTime;
        long endTime;
        int tamanho = 1048576;
        int[] vetor = algoritmo.gerarVetor(tamanho);

        // // Teste do vetor aleatório
        // for (int i = 0; i < vetor.length; i++) {
        // System.out.println(i + " - " + vetor[i]);
        // }

        startTime = System.currentTimeMillis();
        
        // exibirQuestao1(vetor, tamanho);
        //exibirQuestao2(vetor, tamanho);
        exibirQuestao3(vetor, tamanho);

        endTime = System.currentTimeMillis();
        double v = (double)(endTime - startTime) / 1000;
        System.out.println("Tempo gasto: " + v); // Mostra o tempo

    }

    public static void exibirQuestao1(int[] vetor, int tamanho) {
        algoritmo.mergeSort_Recursive(vetor, 0, vetor.length - 1, tamanho);
        // // Vetor ordenado
        // for (int i = 0; i < tamanho; i++)
        // System.out.println(vetor[i]);
        System.out.println("Numero de iteracoes: " + algoritmo.getIteracao1());
    }

    public static void exibirQuestao2(int[] vetor, int tamanho) {
        System.out.println("Resultado da questão 2: " + algoritmo.maxVal1(vetor, tamanho));
        System.out.println("Número de iterações: " + algoritmo.getIteracao2());
    }

    public static void exibirQuestao3(int[] vetor, int tamanho) {
        System.out.println("Resultado da questão 3: " + algoritmo.maxVal2(vetor, 0, vetor.length - 1));
        System.out.println("Número de iteração: " + algoritmo.getIteracao3());
    }

    // public static void exibirQuestao4(int[] vetor, int tamanho) {
    //     System.out.println(algoritmo.MULTIPLY(x, y, n));
    //     System.out.println("Número de iterações: " + algoritmo.getIteracao4());
    // }
}