package pack;

import pack.MyArrayBasic;

public class MyArray extends MyArrayBasic {
    public MyArray() {
        this.MAX_SIZE = 100_000;
        this.data = new int[MAX_SIZE];
    }

    public MyArray(int max) {
        this.MAX_SIZE = max;
        this.data = new int[MAX_SIZE];
    }

    public boolean isFull() {
        return this.size == MAX_SIZE;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int[] expandByK(int k) {
        MyArray newArray = new MyArray(k * this.MAX_SIZE);
        for (int i = 0; i < this.MAX_SIZE; i++) {
            newArray.setAt(i, getAt(i));
        }
        this.MAX_SIZE = k * MAX_SIZE;
        return newArray.data;
    }

    public int[] expand() {
        return expandByK(2);
    }

    public void add(int d) {
        if (this.isFull()) {
            int old_max = this.size;
            this.data = this.expand();
            this.data[this.size++] = d;
            return;
        }
        this.data[this.size++] = d;
    }

    public void insert_unoredered(int d, int idx) {
        while (idx >= this.MAX_SIZE) {
            this.expand();
        }
        this.data[this.size++] = this.data[idx];
        this.data[idx] = d;
    }

    public void insert(int d, int idx) {
        while (this.size == this.MAX_SIZE) {
            this.data = this.expand();
        }
        if (idx < 0) {
            return; // Skip due to invalid index
        }
        if (this.isEmpty() && idx == 0) {
            this.add(d);
            return;
        }
        if (d <= this.data[idx]){
            for (int i = this.size; i > idx; i--) {
                this.data[i] = this.data[i - 1];
            }
            this.data[idx] = d;
            this.size++;
        }
    }

    public int binarySearch(int target) {
        int left = 0;
        int right = this.size - 1;
        while (left <= right) {
            int middle = left + ((left + right) / 2);
            if (target > this.getAt(middle)) {
                left = middle + 1;
            } else if (target < this.getAt(middle)) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        for (int i = 0; i < this.size; i++) {
            if (this.getAt(i) >= target) {
                return -(i + 1);
            }
            continue;
        }
        return -(this.size + 100);
    }
}
