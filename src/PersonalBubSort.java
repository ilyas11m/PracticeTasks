class ArrayBub {
    private long[] a;
    private int nElems;

    //--------------------------------------------------------------
    public ArrayBub(int max) {
        a = new long[max];
        nElems = 0;
    }

    //--------------------------------------------------------------
    public void insert(long value) {
        if (nElems < a.length) {
            a[nElems] = value;
            nElems++;
        } else {
            System.out.println("Массив переполнен");
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println(" ");
    }

    public void bubbleSort() {
        int out, in;
        for (out = nElems - 1; out > 1; out--) { // Изменено условие на out > 0
            for (in = 0; in < out; in++) { // Внутренний цикл (прямой)
                if (a[in] > a[in + 1]) { // Порядок нарушен?
                    swap(in, in + 1); // Поменять местами
                }
            }
        }
    }
    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 100; // Размер массива
        ArrayBub arr = new ArrayBub(maxSize);

        // Вставка 10 элементов
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(4);
        arr.insert(66);
        arr.insert(33);

        arr.display();
        arr.bubbleSort();
        arr.display();
    }
}

