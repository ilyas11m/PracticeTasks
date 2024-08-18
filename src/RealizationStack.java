import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RealizationStack implements Stack {
    int[] stck = new int[6];

    @Override
    public void push(int x) {
        Arrays.fill(stck, x);
        System.out.print(Arrays.toString(stck));
    }

    @Override
    public void Pop(int x) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static void main(String[] args) {
        Stack obj = new RealizationStack();
        obj.push(12);
        obj.push(12);
        obj.push(12);
        obj.push(12);
        obj.push(12);
        obj.push(12);
        obj.push(15);
    }
}

