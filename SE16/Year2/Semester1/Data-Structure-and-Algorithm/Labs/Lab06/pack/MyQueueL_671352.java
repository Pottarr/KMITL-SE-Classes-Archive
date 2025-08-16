package Lab06.pack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyQueueL_671352<T> implements Iterable<T>{
    private List<T> items = new LinkedList<>();

    public void enqueue(T d) {
        items.addLast(d);
    }

    public T dequeue() {
        return items.removeFirst();
    }

    public T front() {
        return items.getFirst();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Front -> ");
        for (T item : items)
            sb.append(item).append(" -> ");
        sb.append("Rear");
        return sb.toString();
    }

    // @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }
}
