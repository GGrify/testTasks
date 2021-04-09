import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Задание 6
* Напишите Java-программу для итерации
* объекта типа HashMap с использованием
* цикла while и улучшенного цикла for
* */
public class IterationHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "q");
        map.put(2, "qw");
        map.put(3, "qwe");
        map.put(4, "qwer");
        map.put(5, "qwert");
        map.put(6, "qwerty");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> set = iterator.next();
            System.out.println(set.getValue() + " " + set.getKey());
        }

        for (Map.Entry<Integer, String> set : map.entrySet()) {
            System.out.println(set.getValue() + " " + set.getKey());
        }
    }
}
