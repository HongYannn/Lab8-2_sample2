import java.util.LinkedList;

class MyQueue<T> extends LinkedList<T> {

    public void enqueue(T item) {
        this.addLast(item);
    }


    public T dequeue() {
        return this.pollFirst();
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int size() {
        return super.size();
    }
}

public class QueueExample {
    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>();

        queue.enqueue(10);
        queue.enqueue(20);

        System.out.println("size = " + queue.size());        
        System.out.println("dequeue = " + queue.dequeue());  
        System.out.println("isEmpty = " + queue.isEmpty());  

        MyQueue<Person> personQueue = new MyQueue<>();
        personQueue.enqueue(new Person("John", 18));
        personQueue.enqueue(new Person("Mary", 20));

        System.out.println(personQueue.dequeue()); 
    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
