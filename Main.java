
public class Main {

    static long startTime;
    static long endTime;
    static double v;
    static Algoritmos algoritmo = new Algoritmos();

    public static void main(String[] args) {

        int tamanho = 1048576;
        int[] vetor = algoritmo.gerarVetor(tamanho);

        // // Teste do vetor aleatório
        // for (int i = 0; i < vetor.length; i++) {
        //     System.out.println(i + " - " + vetor[i]);
        // }

        exibirQuestao1(vetor, tamanho);
        exibirQuestao2(vetor, tamanho);
        exibirQuestao3(vetor, tamanho);


    }

    public static void exibirQuestao1(int[] vetor, int tamanho) {

        startTime = System.currentTimeMillis();
        algoritmo.mergeSort_Recursive(vetor, 0, vetor.length - 1, tamanho);
        endTime = System.currentTimeMillis();
        v = (double) (endTime - startTime) / 100;
        System.out.println("Tempo gasto questão 1: " + v); // Mostra o tempo

        // Vetor ordenado
        for (int i = 0; i < tamanho; i++)
            System.out.println(vetor[i]);

        System.out.println("Numero de iteracoes: " + algoritmo.getIteracao1());

    }

    public static void exibirQuestao2(int[] vetor, int tamanho) {
        startTime = System.currentTimeMillis();
        System.out.println("Resultado da questão 2: " + algoritmo.maxVal1(vetor, tamanho));
        endTime = System.currentTimeMillis();
        v = (double) (endTime - startTime) / 100;
        System.out.println("Número de iterações: " + algoritmo.getIteracao2());
        System.out.println("Tempo gasto questão 2: " + v);
    }

    public static void exibirQuestao3(int[] vetor, int tamanho) {
        startTime = System.currentTimeMillis();
        System.out.println("Resultado da questão 3: " + algoritmo.maxVal2(vetor, 0, vetor.length - 1));
        System.out.println("Número de iteração: " + algoritmo.getIteracao3());
        endTime = System.currentTimeMillis();
        v = (double) (endTime - startTime) / 100;
        System.out.println("Tempo gasto questão 3: " + v);
    }

    public static void exibirQuestao4(int[]vetor, int tamanho){
        startTime =  System.currentTimeMillis();
        
        endTime = System.currentTimeMillis();
        v = (double) (endTime - startTime) / 100;
        System.out.println("Número de iterações: " + algoritmo.getIteracao2());
        System.out.println("Tempo gasto questão 4: " + v);

    }
}