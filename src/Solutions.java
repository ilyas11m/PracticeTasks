public class Solutions {
    enum Apple {
        Jonathan(12), Winesap(23), Golden(4), Redel(10), Cortland(9);
        private final int price;
        Apple(int price) {
            this.price = price;
        }
        int getPrice() {
            return price;
        }
    }
    public static void main(String[] args) {
        for (Apple a : Apple.values()) {
            System.out.println("Яблоки сорта: " + a + " стоят: " + a.getPrice());
        }
    }
}