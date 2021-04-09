import java.util.ArrayList;
import java.util.Iterator;

/*
* Задание 10
* Напишите Java-программу для обхода
* ArrayList с использованием цикла for,
* while и улучшенного цикла for
* */
public class IterationArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(1);
        array.add(1);
        for(int i = 0; i < array.size(); i++){
            System.out.print(array.get(i) + " ");
        }
        System.out.println("");
        for(Integer ar : array){
            System.out.print(ar + " ");
        }
        System.out.println("");
        Iterator<Integer> iter = array.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
    }
}
