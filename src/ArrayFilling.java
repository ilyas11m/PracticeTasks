import java.util.Scanner;

public class ArrayFilling {
    public static void main(String[] args) {
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
    }
}
