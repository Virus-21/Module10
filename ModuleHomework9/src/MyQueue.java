public class MyQueue<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size = 0;

    public void add(T value) {
        if (firstNode == null) {
            this.firstNode = new Node<>(null, null, value);
            size++;
        } else if (lastNode == null) {
            lastNode = new Node<>(firstNode, null, value);
            firstNode.setNextNode(lastNode);
            size++;
        } else {
            Node<T> node = new Node<>(lastNode, null, value);
            lastNode.setNextNode(node);
            lastNode = node;
            size++;

        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    public T peek() {
        return firstNode.getValue();
    }

    public T pool() {
        T value = firstNode.getValue();
        firstNode.getNextNode().setPrevNode(null);
        firstNode = firstNode.getNextNode();
        size--;
        return value;
    }
}
