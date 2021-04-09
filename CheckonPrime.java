/*
* Задание 7
* Напишите программу на Java, чтобы
* узнать, является ли число простым или нет
* */
public class CheckonPrime {
    public static void main(String[] args) {
        int n = 100;
        boolean isPrime = true;
        if(n <= 0){
            System.out.println("Число должно быть натуральным!");
            System.exit(1);
        }
        if(n == 1){
            System.out.println("Число 1 не натуральное и не составное!");
            System.exit(1);
        }
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("Число " + n + " простое.");
            else System.out.println("Число " + n + " не простое.");
    }
}
