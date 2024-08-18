class PerStack{
    int[] stck;
    int maxsize;
    int top;
    PerStack(int maxsize) {
        this.maxsize = maxsize;
        stck = new int[maxsize];
        top = -1;
    }
    public void push(int k) {
        stck[++top] = k;
    }
    public int pop() {
        return stck[top--];
    }
    public int peek() {
        return stck[top];
    }
    boolean isFull() {
        return (top == maxsize-1);
    }
    boolean isEmpty() {
        return (top == -1);
    }
}
public class PersonalStack {
    public static void main(String[] args) {
        PerStack stck1 = new PerStack(6);
        stck1.push(4);
        stck1.push(6);
        stck1.push(1);
        stck1.push(3);
        stck1.push(7);
        stck1.push(8);
        System.out.println(stck1.isFull());
        System.out.println(stck1.isEmpty());
    }
}
