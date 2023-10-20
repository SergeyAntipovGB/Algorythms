package Linkedlist;

public class List {
    Node head;
    Node tail;

    public class Node {
        int value;
        Node next;
        Node previous;
    }

    /** Поиск элемента списка по значению от начала до конца
     * @param value
     * @return
     */
    public Node findNode(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    /** Вставка элемента в конец списка
     * @param value
     */
    public void add(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            // tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            // tail = node;
        }
        tail = node;
    }

    /** Вставка элемента в начало списка
     * @param value
     */
    public void addBehind(int value) {
        Node node = new Node();
        node.value = value;
        if (tail == null) {
            tail = node;
        } else {
            head.previous = node;
            node.next = head;
        }
        head = node;
    }

    /** Вставка элемента после указанной ноды
     * @param value
     * @param node
     */
    public void add(int value, Node node) {
        Node next = node.next;
        Node newNode = new Node();
        newNode.value = value;
        node.next = newNode;
        newNode.previous = node;
        if (next == null) {
            tail = newNode;
        } else {
            newNode.next = next;
            next.previous = newNode;
        }
    }

    /** Удаление элемента списка
     * @param node
     */
    public void del(Node node) {
        Node prev = node.previous;
        Node next = node.next;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            if (prev == null) {
                next.previous = null;
                head = next;
            } else {
                if (next == null) {
                    prev.next = null;
                    tail = prev;
                } else {
                    prev.next = next;
                    next.previous = prev;
                }
            }
        }
        
    }

    /** Разворот двухсвязного списка
     * 
     */
    public void reverse() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }

    /** Разворот односвязного списка
     * 
     */
    public void rev() {
        Node currentNode = head;
        Node previousNode = null;
        while(currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            if (nextNode == null) {
                head = currentNode;
            }
            currentNode = nextNode;
        }
        
    }
}
