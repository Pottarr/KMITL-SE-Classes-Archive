# Queue

## What is Queue?

Answer: A collection of data where you can
`enqueue` (insert the element into it) and `dequeue` (take the element
out from it). Work in the same way in IRL Queue.  

- This makes it `FIFO` (First in first out).

## Queue ADT

- Required operations
    - `void enqueue(int d`
    - `int (dequeue)`
- Convinient operation
    - `int front()`
- Utility operations
    - `boolean isFull()`
    - `boolean isEmpty()`
    - `String toString()`

```java
// Queue implementation for int
public class MyQueue {
    public void enqueue(int d) {
        // your code here
    }
    public int dequeue() {
        // your code here
    }
    public int front() {
        // your code here
    }
    public boolean isFull() {
        // your code here
    }
    public boolean isEmpty() {
        // your code here
    }
    public String toString() {
        // your code here
    }
}
```

### Queue (Array Implementation)

```java
// Queue implementation for in made with Array
public class MyQueueA {
    int MAX_SIZE = 100;
    int queue[] = new int[MAX_SIZE];
    int head = 0;
    int tail = queue.length;

    public void enqueue(int d) {
        queue[tail] = d;
        tail = (tail + 1) % MAX_SIZE;
    }

    public int dequeue() {
        int d = queue[head];
        head = (head + 1) % MAX_SIZE;
        return d;
    }

    public int front() {
        return queue[head];
    }

    public boolean isFull() {
        return ((tail + 1) % MAX_SIZE) == head;
    }

    public boolean isEmpty() {
        return head == tail;
    }
}
```

### Queue (Linked List Implementation)

```java
// Queue implementation for int made with Linked List
public class MyQueueL {
    public class Node {
        int data
        Node next;
        public Node(int d) {
            data = d;
        }
    }

    Node head = null, tail;

    public void enqueue(int d) {
        Node p = new Node(d);
        if (head == null)
            head = tail = p;
        else {
            tail.next = p;
            tail = tail.next;
        }
    }

    public int dequeue() {
        int d = head.data;
        head = head.next;
        return d;
    }

    public int front() {
        return head.data;
    }

    public boolean isFull() {
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
```

## Shunting-Yard Algorithm

### What is Shunting-Yard Algorithm?

Answer: The way to convert infix expression to postfix expression.

### Shunting-Yard Algorithm Analysis

```
Given stack s, queue q
while more token t:
    case t is a number:
        q.enqueue(t)
    case t is an operator:
        while s.top() > t:
            q.enqueue(s.pop())
        s.push(t)
    case t is "(":
        s.push(t)
    case t is ")":
        while s.top() != "(":
            q.enqueue(s.pop())
        s.pop()
while !s.isEmpty():
    q.enqueue(.pop())
```

## Example Challenge

### Flood Fill Algorithm

GIven a 2D grid (image), a starting cell (sr, sc), a target color, and
a new color, replace all 4 directionally connected cells with the target
color to the new color.Algorithm

- Before ((sr, sc) == (1, 1))

| 1 | 1 | 1 |
| :-: | :-: | :-: |
| 1 | 1 | 0 |
| 1 | 0 | 1 |

- After

| 2 | 2 | 2 |
| :-: | :-: | :-: |
| 2 | 2 | 0 |
| 2 | 0 | 1 |

#### Key Ideas:

- Use `DFS` or `BFS` to traverse the region
- Only visit cells with the same initial color
- Avoid revisiting by checking or marking

```java
public void floodFille(int[][] image, int sr, int sv, int newColor) {
    int targetColor = image[sr][sc];
    if (targetColor == newColor) return;

    int rows = image.length, col = image[0].length;
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{sr, sc});

    int[][] dirs = {{0, 1}, {1, 0}, {1, -1}, {-1, 0}}

    while (!queue.isEmpty()) {
        int[] cell = queue.poll();
        int r = cell[0], c = cell[1];

        if (image[r][c] != targetColor) continue;

        image[r][c] = newColor;
        for (int[] d : dirs) {
            int nr = r + d[0], nc = c + d[1];
            if (nr >= 0 && nr < rows && nc >= 0 && nc < cols 
                && image[nr][nc] == targetColor) {
                queue.offer(new int[]{nr, nc});
            }
        }
    }
}
```

What are the pros and cons between BFS and DFS?
