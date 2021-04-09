/*
 * Задание 19
 * Напишите Java-программу для удаления
 * всех пробелов из строки без использования replace()
 * */
public class DeleteSpaceWithoutReplace {
    public static void main(String[] args) {
        String str = "Hello world !";
        StringBuilder stringBuilder = new StringBuilder(str);
        for(int i = 0; i < stringBuilder.length(); i++){
            if(stringBuilder.charAt(i) == ' ')
                stringBuilder.deleteCharAt(i);
        }
        System.out.println(stringBuilder);

    }
}
