package pack;

public class MyArrayBasic {
    protected int MAX_SIZE = 5;
    protected int data[] = new int[MAX_SIZE];
    protected int size = 0;

    public MyArrayBasic(int ... a) {
        if (a.length != 0) {
            this.MAX_SIZE = a.length;
            this.data = new int[MAX_SIZE];
            for (int i = 0; i < MAX_SIZE; i++) {
                this.add(a[i]);
                System.out.println(a[i]);
            }
        } else {
            this.data = new int[MAX_SIZE];
        }
    }

    public void add(int d) {
        this.data[this.size++] = d;
    }
    
    public void insert_unordered(int d, int idx) {
        this.data[this.size++] = this.data[idx];
        this.data[idx] = d;
    }

    public int find(int d) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == d) {
                return i;
            }
            continue;
        }
        return -1;
    }

    public void delete(int index) {
        for (int i = index; i < this.size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.size--;
    }

    public int getAt(int index) {
        return this.data[index];
    }

    public void setAt(int index, int d) {
        this.data[index] = d;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Array: [");
        for (int i = 0; i < this.size; i++) {
            sb.append(this.getAt(i));
            if (i < this.size - 1) {
                sb.append(", ");
                continue;
            }
        }
        sb.append("]");
        return new String(sb);

    }
}
