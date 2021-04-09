/*Задание 1
* Напишите программу на Java для переворачивания строки,
* изменив расположение символов в строке задом наперёд
* без использования встроенных в String функций
* */
public class StringReverse1 {
    public static void main(String[] args) {
        String str = "Hello world!";
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder = strBuilder.reverse();
        String strReversed = strBuilder.toString();
        System.out.println(strReversed);
    }
}
