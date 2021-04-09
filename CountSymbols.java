import java.util.HashMap;

/*
* Задание 15
* Напишите программу на Java, чтобы
* найти повторяющиеся символы в строке
* */
public class CountSymbols {
    public static void main(String[] args) {
        String str = "Hello world!";
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }
}
