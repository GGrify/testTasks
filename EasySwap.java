/* Задание 3
* Напишите программу на Java для того, чтобы
* поменятьместами значения, хранящиеся в двух
* переменных с помощью третьей переменной
* */
public class EasySwap {
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        int n;
        n = a;
        a = b;
        b = n;
        System.out.println("a = " + a + ", b = " + b);
    }
}
