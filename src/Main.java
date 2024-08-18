class TwoD {
    int x,y;
    TwoD(int a, int b) {
        x = a;
        y = b;
    }
}
class ThreeD extends TwoD {
    int z;
    ThreeD(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}
class FourD extends ThreeD {
    int t;
    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}
class Coords <T extends TwoD> {
    T[] coords;
    Coords(T[] o){
        coords = o;
    }
}
class Main {
    static void showXY (Coords<?> c) {
        System.out.println("Координаты X & Y: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
    }
    public static void main(String[] args) {
        TwoD[] td =  {new TwoD(3,6), new TwoD(1,5), new TwoD(7,9), new TwoD(8,4)};
        Coords<TwoD> tdlockd = new Coords<TwoD>(td);
        System.out.println("Содержимое tdlocks");
        showXY(tdlockd);
    }
}