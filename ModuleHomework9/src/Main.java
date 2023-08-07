// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        MyStack<Integer> myStack = new MyStack<>();
        //myHashMapTest(myHashMap);
        //myQueueTest(myQueue);
        //myArrayListTest(myArrayList);
        //myLinkedListTest(myLinkedList);
        //myStackTest(myStack);

    }

    public static void myQueueTest(MyQueue myQueue) {
        myQueue.add("First word");
        myQueue.add("Second word");
        myQueue.add("Third word");
        System.out.println("myQueue.size() = " + myQueue.size());
        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println("myQueue.pool() = " + myQueue.pool());
        System.out.println("myQueue.size() = " + myQueue.size());
        myQueue.clear();
        System.out.println("myQueue.size() = " + myQueue.size());
    }

    public static void myArrayListTest(MyArrayList myArrayList) {
        myArrayList.add(10);
        myArrayList.add(11);
        myArrayList.add(1001);
        myArrayList.remove(1);
        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println("myArrayList.get(0) = " + myArrayList.get(0));
        myArrayList.clear();
        System.out.println("myArrayList.size() = " + myArrayList.size());

    }

    public static void myHashMapTest(MyHashMap myHashMap) {
        myHashMap.put("Myron", 19);
        myHashMap.put("Igor", 17);
        myHashMap.put("Katya", 21);
        System.out.println("myHashMap.get(\"Igor\") = " + myHashMap.get("Igor"));
        myHashMap.remove("Myron");
        System.out.println("myHashMap.size() = " + myHashMap.size());
        myHashMap.clear();
        System.out.println("myHashMap.get(\"Katya\") = " + myHashMap.get("Katya"));
    }

    public static void myLinkedListTest(MyLinkedList myLinkedList) {
        myLinkedList.add("First word");
        myLinkedList.add("Second word");
        myLinkedList.add("Third word");
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        myLinkedList.remove(2);
        System.out.println("myLinkedList.get(1) = " + myLinkedList.get(1));
        myLinkedList.clear();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());


    }

    public static void myStackTest(MyStack myStack) {
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.remove(2);
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.size() = " + myStack.size());
        myStack.clear();
        System.out.println("myStack.size() = " + myStack.size());

    }
}

