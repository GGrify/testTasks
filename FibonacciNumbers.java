/*
* Задание 9
* Написать программу на Java для
* вычисления серии чисел Фибоначчи
* */
public class FibonacciNumbers {
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        int b = 1;
        for(int i = 0; i < n / 2; i++){
            System.out.print(a + " " + b + " ");
            a = a + b;
            b = a + b;
        }
    }
}
