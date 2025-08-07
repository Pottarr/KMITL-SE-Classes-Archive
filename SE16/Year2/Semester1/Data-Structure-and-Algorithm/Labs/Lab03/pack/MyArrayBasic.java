package pack;

public class MyArrayBasic {
    protected int MAX_SIZE = 5;
    protected int data[] = new int[MAX_SIZE];
    protected int size = 0;

    public void add(int d) {
        this.data[this.size] = d;
    }

    public int find(int d) {
        for (int i = 0; i < this.size; i++) {
            if (i == d) {
                return i;
            }
        }
        return -1;
    }

    public void delete(int index) {
        for (int i = index; i < this.size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.size--;
    }
}
