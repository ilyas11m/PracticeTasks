interface StringFunc<T> {
    T func(T n);
}
public class Reverse {
    public static void main(String[] args) {
        StringFunc<String> reverse = (n) -> {
            n = n.toUpperCase();
            String result = "";
            int i;
            for (i = n.length()-1; i >= 0; i--) {
                result += n.charAt(i);
            }
            return result;
        };
        StringFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++){
                result = result * i;
            }
            return result;
        };
        System.out.println(reverse.func("ильяс"));
        System.out.println(factorial.func(4));
    }
}