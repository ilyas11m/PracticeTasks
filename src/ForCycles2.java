import java.util.Arrays;
import java.util.Scanner;

public class ForCycles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк в массиве: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов в массиве: ");
        int columns = scanner.nextInt();
        long[][] array = new long[rows][columns];
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++){
            for (int k = 0; k < array[i].length; k ++) {
                array[i][k] = (int) (Math.random() * 100);
                System.out.printf("%4d", array[i][k]);
            }
            System.out.println();
        }
    }
}
