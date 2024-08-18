import java.util.Arrays;
import java.util.Scanner;

class Array {
    public void methArray() {
        System.out.print("Введите кол-во элементов в массиве: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int searchkey = 23;
        boolean found = false;
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100);
            if (array[i] == searchkey) {
                found = true;
                System.out.println("Элемент найден!");
            }
        }
        if (found) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == searchkey) {
                    for (int j = i; j < array.length - 1; j++) {
                        array[j] = array[j + 1];
                    }
                    // Устанавливаем последнее значение в 0, так как мы сдвинули массив влево
                    array[array.length - 1] = 0;
                    break;
                }
            }
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
public class AverageArray {
    public static void main(String[] args) {
        Array arr = new Array();
        arr.methArray();
    }
}
