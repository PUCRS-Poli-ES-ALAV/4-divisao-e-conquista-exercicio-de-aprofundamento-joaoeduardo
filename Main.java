import java.util.Scanner;

public class Main {

    // static double V;
    static Algoritmos algoritmo = new Algoritmos();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean terminou = false;
        
        int tamanho = 2048;
        int[] vetor = algoritmo.gerarVetor(tamanho);
        while(!terminou){
            System.out.println("\n------ Escolha uma das questões-------\n");
            System.out.println("1 - Questão1");
            System.out.println("2 - Questão2");
            System.out.println("3 - Questão3");
            System.out.println("4 - Questão4");
            System.out.println("5 - Finalizar");
            int opçao = in.nextInt();
            System.out.println("\n");
            
            switch(opçao){
                case 1:
                    long startTime;
                    long endTime;

                    startTime = System.currentTimeMillis();
                        
                    exibirQuestao1(vetor, tamanho);

                    endTime = System.currentTimeMillis();
                    double d = (double)(endTime - startTime) / 1000;
                    System.out.println("Tempo gasto: " + d); // Mostra o tempo
                    break;
                case 2:
                    long startTime1;
                    long endTime1;
                    startTime1 = System.currentTimeMillis();
                        
                    exibirQuestao2(vetor, tamanho);

                    endTime1 = System.currentTimeMillis();
                    double e = (double)(endTime1 - startTime1) / 1000;
                    System.out.println("Tempo gasto: " + e); // Mostra o tempo
                    break;
                case 3:
                    long startTime2;
                    long endTime2;
                    startTime2 = System.currentTimeMillis();
                    
                    exibirQuestao3(vetor, tamanho);

                    endTime2 = System.currentTimeMillis();
                    double v = (double)(endTime2 - startTime2) / 1000;
                    System.out.println("Tempo gasto: " + v); // Mostra o tempo
                    break;
                case 4:
                    long startTime3;
                    long endTime3;
                    startTime3 = System.currentTimeMillis();
                    String a = "0001";
                    String b = "0010";
                    long c = a.length();
            
                    
                    exibirQuestao4(Long.parseLong(a), Long.parseLong(b), c);
            
                    endTime3 = System.currentTimeMillis();
                    double g = (double)(endTime3 - startTime3) / 1000;
                    System.out.println("Tempo gasto: " + g); // Mostra o tempo
        
                    break;
                case 5:
                    System.out.println("Finalizando....\n");
                    terminou = true;  
                    break;
                default:
                    System.out.println("Digite SOMENTE números entre 1 e 5");
                    break;

            }

        }
    

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

    public static void exibirQuestao4(long x, long y, long n) {
        System.out.println(algoritmo.multiply(x, y, n));
        System.out.println("Número de iterações: " + algoritmo.getIteracao4());
    }
}