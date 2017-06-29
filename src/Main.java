import java.util.Random;

public class Main {

    static Random rnd = new Random();
    static int random(int n) {
//        return Math.abs(rnd.nextInt()) % n;           // Wrong, although it occurs often

        /*
        A good method, but it is imperfect: it has three drawbacks.
    The first is that if n is a small power of two, then the sequence of generated random numbers in a very short period will begin
     repeat. The second is that if n is not a power of two, then on average some Numbers will be obtained much more often than others.
     If n is large, the indicated deficiency can be manifested rather clearly.
     Graphically this is demonstrated by the following program:

    Неплохой метод, но он несовершенен: у него есть три недостатка.
    Первый состоит в том, что если n - это небольшая степень числа два, то последовательность генерируемых случайных чисел через очень короткий период начнет
     повторяться. Второй заключается в том, что если n не является степенью числа два', то в среднем некоторые Числа будут получаться гораздо чаще других.
     Если n большое, указанный недостаток может проявляться довольно четко.
     Графически это демонстрируется следующей программой:
     */
        return rnd.nextInt(n);          //  Correct method of generation.
    }

    public static void main(String[] args) {
        int n = 2 * (Integer.MAX_VALUE / 3); int low = 0 ;
        for (int i = 0;i < 1000000; i++)
        if (random (n)< n/2)
            low++;
        System.out.println(low);
    }
}
