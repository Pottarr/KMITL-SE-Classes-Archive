// Theepakorn Phayonrat 67011352
package pack;

public class MyTrickyLinkedList extends MyLinkedList {

    public MyTrickyLinkedList() {}

    public void q1_rotate_counter_clockwise(int k) {
        if (k > this.size()) {
            return;
        }
        for (int i = 0; i < k; i++) {
            int last = this.getAt(this.size() - 1);
            this.delete(last);
            this.add(last);
        }
    }

    public void q2_reverse() {
        int l = 0;
        int r = this.size() - 1;

        while (l < r) {
            int ld = this.getAt(l);
            int rd = this.getAt(r);
            this.setAt(l, rd);
            this.setAt(r, ld);
            l++;
            r--;
        }
    }

    public void q3_remove_dup() {
        int i = 0;
        int s = this.size() - 1;
        Node iter = this.head;
        while (i < s) {
            if (iter.next != null) {
                if (iter.data == iter.next.data) {
                    System.out.println(iter.data);
                    this.delete(iter.data);
                    s--;
                    i++;
                    iter = this.head;
                    continue;
                } else if (iter.data != iter.next.data) {
                    iter = iter.next;
                    i++;
                    continue;
                }
            } else if (iter.next == null) {
                return;
            }
        }
    }

    public void q4_add_one() {
        // Just for ideal case of each Node contains only 0-9
        boolean carry = false;
        this.q2_reverse();
        if (this.head.data < 9) {
            this.head.data ++;
            this.q2_reverse();
            return;
        } else if (this.head.data == 9) {
            this.head.data = 0;
            carry = true;
        }
        // Need carry all along to the Most Signifigant Digit
        Node iter = this.head;
        if (iter.next != null) {
            iter = iter.next;
        } else {
            return;
        }
        while (iter.next != null) {
            if (iter.data < 9) {
                if (carry) {
                    iter.data ++;
                    this.q2_reverse();
                    return;
                } else if (!carry) {
                    this.q2_reverse();
                    return;
                }
            } else if (iter.data == 9) {
                if (carry) {
                    iter.data = 0;
                    carry = true;
                    iter = iter.next;
                } else if (!carry) {
                    this.q2_reverse();
                    return;
                }
            }
        }
        if (iter.data == 9) {
            iter.data = 0;
            this.q2_reverse();
            this.add(1);
        } else {
            iter.data ++;
            this.q2_reverse();
        }
    }

    public boolean q5_isPalindrome() {
        int l = 0;
        int r = this.size() - 1;

        while (l < r) {
            int ld = this.getAt(l);
            int rd = this.getAt(r);
            if (ld != rd) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
