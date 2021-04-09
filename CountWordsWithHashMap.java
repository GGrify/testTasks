import java.util.HashMap;

/* Задание 5
* Напишите программу на Java для подсчета
* количества конкретных слов в строке, используя HashMap
* */
public class CountWordsWithHashMap {
    public static void main(String[] args) {
        String str = "It is rain today Yesterday was rain too Again rain";
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = str.split(" ");
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map.toString());
    }
}
