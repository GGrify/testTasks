/* Задание 4
 * Напишите программу на Java, чтобы поменять
 * местами значения, хранящиеся в двух переменных,
 * без использования третьей переменной
 * */
public class HardSwap {
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }
}
