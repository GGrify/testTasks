import java.util.Arrays;

/*
* Задание 16
* Напишите Java-программу, чтобы найти
* второе по величине число в массиве*/
public class FindSecondMax {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 6, 2, 7, 3};
        Arrays.sort(array);
        System.out.println(array[array.length - 2]);
    }
}
