import java.util.Scanner;

public class GaussSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Начальное значение последовательности
        int start = 100;

        // Количество чисел в последовательности
        long count = n - start + 1;

        // Вычисляем сумму используя формулу арифметической прогрессии
        long sum = count * (start + n) / 2;

        // Выводим результат
        System.out.println(sum);

        scanner.close();
    }
}
