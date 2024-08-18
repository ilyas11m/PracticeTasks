import java.util.Arrays;
import java.util.Scanner;

public class ForCycles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число, соответствующее кол-ву элементов в массиве: ");
        int number = in.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200) - 100;
        }
        System.out.println(Arrays.toString(array));
    }
}
