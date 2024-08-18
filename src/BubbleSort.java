import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int elems = scanner.nextInt();
        int[] array = new int[elems];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Неотсортированный массив: " + Arrays.toString(array));
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++){
                if (array[i] < array[i-1]) {
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}