// Custom LinkedList class
class MyLinkedList<T> {
    private Node<T> head;
    
    private static class Node<T> {
        T data;
        Node<T> next;
        
        Node(T data) {
            this.data = data;
        }
    }
    
    public void add(T ob) {
        Node<T> newNode = new Node<>(ob);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public boolean find(T ob) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(ob)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }
}

public class linkedList {
    public static void main(String[] args) {
        MyLinkedList<String> myList = new MyLinkedList<>();
        myList.add("Straight");
        myList.add("Bent");
        myList.add("Equals");
        myList.add("Well");
        myList.add("Storm");
        
        System.out.println("Original list: " + myList);
        System.out.println("Find 'Well': " + myList.find("Well"));
        System.out.println("Find 'Strength': " + myList.find("Strength"));
    }
}
