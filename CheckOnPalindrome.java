/*
* Задание 8
* Напишите Java-программу, чтобы определить,
* является ли строка или число палиндромом, или нет
* */
public class CheckOnPalindrome {
    public static void main(String[] args) {
        String str = "qweewq";
        char[] chars = str.toCharArray();
        boolean isPalindrome = true;
        for(int i = 0; i < chars.length / 2; i++){
            if(chars[i] != chars[chars.length - i - 1]){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) System.out.println("Строка палиндром");
            else System.out.println("Строка не палиндром");
    }
}
