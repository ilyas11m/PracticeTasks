public class Solution {
    public static int fact(int n){
        if (n==1) {
            return 1;
        }
        return n + fact(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fact(2));
    }
}
// 4 * fact(3) = 3 * fact(2) = 2 * (fact1) = 1