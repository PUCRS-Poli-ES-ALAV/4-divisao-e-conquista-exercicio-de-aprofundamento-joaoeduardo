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

    // NÚMERO 4
    public long MULTIPLY(long x, long y,long n){
        iteracao4++;
        if(n == 1){
            return x * y;
        }else{
            long m = (n/2);
            long a = (x/(m*m)); long b = x % (m*m);
            long c = (y/m*m); long d = y % (m*m);
            long e = MULTIPLY(a, c, m);
            long f = MULTIPLY(b, d, m);
            long g = MULTIPLY(b, c, m);
            long h = MULTIPLY(a, d, m);
            return ((2 * m) *(2 * m)) * e + (m*(g + h) * m *(g + h)) + f;
        }
    } 
}