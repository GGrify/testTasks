/*Задание 2
 * Напишите программу на Java для переворота
 * последовательности символов в строке без
 * использования встроенной в String функции reverse()
 * */
public class StringReverse2 {
    public static void main(String[] args) {
        String str = "Hello world!";
        StringBuilder strBuilder = new StringBuilder(str);
        for(int i = 0; i < strBuilder.length() / 2; i++){
            char ch;
            ch = strBuilder.charAt(i);
            strBuilder.setCharAt(i, strBuilder.charAt(strBuilder.length() - i - 1));
            strBuilder.setCharAt(strBuilder.length() - i - 1, ch);
        }
        String strReversed = strBuilder.toString();
        System.out.println(strReversed);
    }
}
