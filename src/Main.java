import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int res = ex_01();                           // Вывод задачи ex_01:
//        System.out.println("Сумма всех чисел от 1 до n = " + res);

//        int res = ex_02();                           // Вывод задачи ex_02:
//        System.out.println("Поизведение всех чисел от 1 до n = " + res);

//        ex_03();                                     // Вывод задачи ex_03:

//        ex_04();                                     // Вывод задачи ex_04:



    }

    static int ex_01() {    // Задача 1
        System.out.println("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static int ex_02() {      // Задача 2
        System.out.println("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            mult = mult * i;
        }
        return mult;
    }


    static void ex_03() {      // Задача 3
        boolean a = true;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }
            }
            if (a) System.out.println(i);
            else a = true;
        }
    }


    static void ex_04() {       // Задача 4
        System.out.println("Введите первое число a: ");
        Scanner scanner1 = new Scanner(System.in);
        Integer a = scanner1.nextInt();
        System.out.println("Введите операцию: ");
        Scanner scanner3 = new Scanner(System.in);
        String operation = scanner3.next();
        System.out.println("Введите второе число b: ");
        Scanner scanner2 = new Scanner(System.in);
        Integer b = scanner2.nextInt();
        int total;
        if (Objects.equals(operation, "+")) {
            total = a + b;
            System.out.println("Результат выражения " + a + " + " + b + " = " + total);
        } else if (Objects.equals(operation, "-")) {
            total = a - b;
            System.out.println("Результат выражения " + a + " - " + b + " = " + total);
        } else if (Objects.equals(operation, "*")) {
            total = a * b;
            System.out.println("Результат выражения " + a + " * " + b + " = " + total);
        } else if (Objects.equals(operation, "/")){
            if (b != 0){
                total = a / b;
                System.out.println("Результат выражения " + a + " / " + b + " = " + total);
            }
            else {
                System.out.println("Ошибка: на 0 делить нельзя!");
            }
        }
        else {
            System.out.println("Ошибка. Необходимо ввести одну из следующих операций: +, -, *, /");
        }
    }
}

















