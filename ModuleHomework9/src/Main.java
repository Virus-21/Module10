// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        MyStack<Integer> myStack = new MyStack<>();
        myHashMapTest(myHashMap);
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
//        myHashMap.put("Myron", 19);
//        myHashMap.put("Igor", 17);
//        myHashMap.put("Katya", 21);
//        System.out.println("myHashMap.get(\"Igor\") = " + myHashMap.get("Igor"));
//        myHashMap.remove("Myron");
//        System.out.println("myHashMap.size() = " + myHashMap.size());
//        myHashMap.clear();
//        System.out.println("myHashMap.get(\"Katya\") = " + myHashMap.get("Katya"));

        myHashMap.put("p1", 19);
        myHashMap.put("p2", 17);
        myHashMap.put("p3", 21);
        myHashMap.put("p4", 19);
        myHashMap.put("p5", 17);
        myHashMap.put("p6", 21);
        myHashMap.put("p7", 19);
        myHashMap.put("p8", 17);
        myHashMap.put("p9", 21);
        myHashMap.put("p10", 19);
        myHashMap.put("p11", 17);
        myHashMap.put("p12", 21);
        myHashMap.put("p13", 19);
        myHashMap.put("p14", 17);
        myHashMap.put("p15", 21);
        myHashMap.put("p16", 19);
        myHashMap.put("p18", 17);
        myHashMap.put("p19", 21);
        System.out.println("myHashMap.get(\"p15\") = " + myHashMap.get("p15"));
        System.out.println("myHashMap.get(p1) = " + myHashMap.get("p1"));
        System.out.println("myHashMap.get(\"p14\") = " + myHashMap.get("p14"));
        System.out.println("myHashMap.get(\"p16\") = " + myHashMap.get("p16"));
        System.out.println("myHashMap.get(\"p10\") = " + myHashMap.get("p10"));
        System.out.println("myHashMap.get(\"p12\") = " + myHashMap.get("p12"));

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

