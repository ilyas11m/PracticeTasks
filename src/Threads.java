import java.sql.SQLOutput;

class Threads implements Runnable {
    String name;
    Thread t;

    @Override
    public void run() {
        try {
            for (int i = 0; i > 0; i--){
                System.out.println(name +": " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " Завершен.");

    }

    Threads(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
    }
}
class MultiThread {
    public static void main(String[] args) {
        Threads nt1 = new Threads("One");
        Threads nt2 = new Threads("Two");
        Threads nt3 = new Threads("Three");

        nt1.t.run();
        nt2.t.start();
        nt3.t.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Завершение главного потока.");
    }
}
