public class MyLinkedList<T> {
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

    public T get(int index) {
        if(!indexValidation(index)){
            return null;
        }
        Node<T> currentNode = firstNode;
        if (index == 0) {
            return currentNode.getValue();
        }
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();

        }
        return currentNode.getValue();
    }

    public void remove(int index) {
        if(indexValidation(index) == false){
            return;
        }
        if (index == size - 1) {
            lastNode = lastNode.getPrevNode();
            lastNode.setNextNode(null);
            System.out.println("hhhh");
        } else {
            Node<T> removeNode = firstNode;
            for (int i = 0; i < index; i++) {
                removeNode = removeNode.getNextNode();

            }
            removeNode.getPrevNode().setNextNode(removeNode.getNextNode());
            removeNode.getNextNode().setPrevNode(removeNode.getPrevNode());


        }
        size--;
    }

    public int size() {
        return size;
    }

    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }
    public boolean indexValidation(int index){
        if(index > size){
            return false;
        } else if (index < 0) {
            return false;
        }
        return true;
    }
}
