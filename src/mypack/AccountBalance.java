package mypack;

class Balance {
    String name;
    double bal;
    Balance ( String name, double bal) {
        this.name = name;
        this.bal = bal;
    }
    void show() {
        if(bal<0)
            System.out.print("--> ");
        System.out.println(name + ": $" + bal);
    }
}
class AccountBalance {
    public static void main(String[] args) {
        Balance[] current = new Balance[34];
        current[0] = new Balance("K.J.Kennedy", 10000);
        current[1] = new Balance("M.N.Karim",100000);
        current[2] = new Balance("T.J.Bob",-1);
        for (int i = 0; i<3; i++) {
            current[i].show();
        }
    }
}