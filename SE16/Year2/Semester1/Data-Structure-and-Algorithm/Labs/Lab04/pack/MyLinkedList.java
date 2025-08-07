// Theepakorn Phayonrat 67011352
package pack;

public class MyLinkedList {
    // MyLinkedList attributes
    public class Node {
        // Node attributes
        int data;
        Node next;
        // Node Constructor
        public Node(int d) {
            this.data = d;
        }
    }
    Node head = null;
    
    // MyLinkedList Constructor
    public MyLinkedList() {
    }

    // Return MyLinkedList size
    public int size() {
        if (head == null) return 0;
        int count = 1;
        Node iter = this.head;
        while (iter.next != null) {
            iter = iter.next;
            count ++;
        }
        return count;
    }

    // Add a Node with value of d (as int) at the front
    public void add(int d) {
        Node newHead = new Node(d);
        newHead.next = this.head;
        this.head = newHead;
    }

    // Insert a Node with value of d (as int) after Node n where
    // n.data is the highest and less than d
    public void insert(int d) {

        Node insertNode = new Node(d);
        if (this.head == null || this.head.data >= d) {
            this.add(d);
            return;
        }

        Node iter = this.head;
        while (iter.next != null) {
            if (iter.next.data >= d) {
                insertNode.next = iter.next;
                iter.next = insertNode;
                return;
            }
            iter = iter.next;
        }
        iter.next = insertNode;
    }

    // Return the index of the node valued d, or -1 if not found
    public int find(int d) {
        // If MyLinkedList is empty
        if (this.head == null) {
            return -1;
        }
        Node iter = this.head;
        int count = 0;
        while (iter != null) {
            if (iter.data == d) {
                return count;
            } else if (iter.data != d) {
                if (iter.next == null) {
                    return -1;
                } else if (iter.next != null) {
                    iter = iter.next; count ++;
                }
            }

        }
        // If not found
        return -1;
    }

    // Delete
    public void delete(int d) {
        Node target = new Node(-1);
        target.next = this.head;
        Node iter = target;
        while ((iter.next != null) && (iter.next.data != d)) {
            iter = iter.next;
        }
        if (iter.next != null) {
            iter.next = iter.next.next;
        }
        this.head = target.next;
    }

    public int getAt(int i) {
        Node iter = this.head;
        while (i > 0) {
            iter = iter.next;
            i--;
        }
        return iter.data;
    }

    public void setAt(int i, int d) {
        Node iter = this.head;
        while (i > 0) {
            iter = iter.next;
            i--;
        }
        iter.data = d;
    }
    
    // Convert MyLinkedList to String for output
    public String toString() {
        StringBuffer sb = new StringBuffer("head");
        Node p = this.head;
        while (p != null) {
            sb.append("--> [");
            sb.append(p.data);
            sb.append("] ");
            p = p.next;
        }
        sb.append("--> null");
        return new String(sb);
    }
    // --------------------------------------------------------------------
    
    public void add(int[] d) {
        for (int i = d.length - 1; i >= 0; i--) {
            // Node newHead = new Node(d[i]);
            // newHead.next = this.head;
            // this.head = newHead;
            this.add(d[i]);
        }
    }

    public void insert(int[] d) {
        for (int i =  0; i < d.length; i++) {
        //     Node insertNode = new Node(d[i]);
        //     if (this.head == null) {
        //         this.head = insertNode;
        //         continue;
        //     }
        //     if (this.head.data >= d[i]) {
        //         this.add(d);
        //         continue;
        //     }
        //     Node iter = this.head;
        //     while (iter != null) {
        //         if (iter.next != null) {
        //             if (iter.next.data >= d[i]) {
        //                 insertNode.next = iter.next;
        //                 iter.next = insertNode;
        //                 iter = iter.next;
        //                 break;
        //             } else if (iter.next.data < d[i]) {
        //                 iter = iter.next;
        //                 continue;
        //             }
        //         } else if (iter.next == null) {
        //             iter.next = insertNode;
        //             break;
        //         }
        //     }
            this.insert(d[i]);
        }
    }
}
