import java.util.Random;
import java.util.Scanner;
class Method {
    public void createWorld(int n) throws Exception
    {
        if (n == 0)
            throw new Exception("Людей вообще нет!");
        if (n == 1)
            throw new Exception("Слишком мало людей!");
        System.out.println("Создан прекрасный мир. Население: " + n);
    }
}
public class Exceptions {
    public static void main(String[] args) throws Exception {
        Method er = new Method();
        er.createWorld(23);
    }
}
