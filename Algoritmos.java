import java.util.Random;

public class Algoritmos {

    private int iteracao1;
    private int iteracao2;
    private int iteracao3;
    private int iteracao4;

    public int getIteracao3() {
        return iteracao3;
    }

    public int getIteracao2() {
        return iteracao2;
    }

    public int getIteracao1() {
        return iteracao1;
    }

    public int getIteracao4() {
        return iteracao4;
    }

    public int[] gerarVetor(int tamanho) {
        Random gerador = new Random();
        int[] vetAux = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetAux[i] = gerador.nextInt(tamanho + 1000);
            if (vetAux[i] < 0) {
                vetAux[i] = vetAux[i] * -1;
            }
        }
        return vetAux;
    }

    // NÚMERO 1

    public void doMerge(int[] numbers, int left, int mid, int right, int tamanho) {
        int[] temp = new int[tamanho];
        int i, left_end, num_elements, tmp_pos;

        left_end = (mid - 1);
        tmp_pos = left;
        num_elements = (right - left + 1);

        while ((left <= left_end) && (mid <= right)) {
            if (numbers[left] <= numbers[mid])
                temp[tmp_pos++] = numbers[left++];
            else
                temp[tmp_pos++] = numbers[mid++];
        }

        while (left <= left_end)
            temp[tmp_pos++] = numbers[left++];

        while (mid <= right)
            temp[tmp_pos++] = numbers[mid++];

        for (i = 0; i < num_elements; i++) {
            numbers[right] = temp[right];
            right--;
        }
    }

    public void mergeSort_Recursive(int[] numbers, int left, int right, int tamanho) {
        iteracao1++;
        int mid;
        if (right > left) {
            mid = (right + left) / 2;
            mergeSort_Recursive(numbers, left, mid, tamanho);

            mergeSort_Recursive(numbers, (mid + 1), right, tamanho);

            doMerge(numbers, left, (mid + 1), right, tamanho);
        }
    }

    // NÚMERO 2
    public int maxVal1(int A[], int n) {
        int max = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] > max)
                max = A[i];
            iteracao2++;
        }
        return max;
    }

    // NÚMERO 3
    public int maxVal2(int A[], int init, int end) {
        iteracao3++;
        if (end - init <= 1) {
            return max(A[init], A[end]);
        } else {
            int m = (init + end) / 2;
            int v1 = maxVal2(A, init, m);
            int v2 = maxVal2(A, m + 1, end);
            return max(v1, v2);
        }
    }

    public int max(int init, int end) {
        if (end > init)
            return end;
        return init;
    }

    //NÚMERO 4

    public long multiply(long x, long y, long n) {
        iteracao4++;
        if(n == 1){
            return x * y;
        }else{
            long m = (long)Math.ceil(n/2);

            long a = (long)Math.floor(x/(potenciaN(2, m)));
            long b = x%(potenciaN(2, m));

            long c = (long)Math.floor(y/(potenciaN(2, m)));
            long d = y%(potenciaN(2, m));

            long e = multiply(a, c, m);
            long f = multiply(b, d, m);
            long g = multiply(b, c, m);
            long h = multiply(a, d, m);
            return ((potenciaN(2, 2 * m) * e) + (potenciaN(2, m)*(g + h)) + f);
        }
    }

    public long potenciaN(long number, long potencia){
        long res = 1;
        long sq = number;
        while(potencia > 0){
            if(potencia % 2 == 1){
                res *= sq; 
            }
            sq = sq * sq;
            potencia /= 2;
        }
        return res;
    }

    public static long floor(long number) {
        return (long)Math.floor(number);
    }

}