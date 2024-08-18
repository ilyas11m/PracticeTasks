import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int x;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число > 0");
            x = in.nextInt();
            if (x>0) System.out.print("Число успешно введено! Выход из программы.");
            else System.out.println("Введенное число меньше 0! Повторите ввод.");
        }
        while (x<=0);
    }
}
