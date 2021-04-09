/*
* Задание 18
* Напишите Java-программу для удаления
* всех пробелов из строки с помощью replace()
* */
public class DeleteSpace {
    public static void main(String[] args) {
        String str = "Hello world !";
        str = str.replaceAll(" ", "");
        System.out.println(str);
    }
}
