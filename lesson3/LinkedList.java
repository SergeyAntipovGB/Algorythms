package lesson3;

import java.util.Comparator;

/**
 * Связный список
 * @param <E>
 */
public class LinkedList <E> {

    /**
     * Указатель на первый элемент связного списка
     */
    private Node head;

    /**
     * Узел связного списка
     */
    class Node{

        /**
         * Ссылка на следующий узел
         */
        Node next;

        /**
         * Значение узла
         */
        E value;

    }

    public void reverse() {
        // Введите свое решение ниже


    }

    /**
     * Добавление нового элемента в начало списка
     * @param value значение
     */
    public void addFirst(E value){
        Node node = new Node();
        node.value = value;
        if (head != null){
            node.next = head;
        }
        head = node;
    }

    /**
     * Удалить первый элемент списка
     */
    public void removeFirst(){
        if (head != null){
            head = head.next;
        }
    }

    /**
     * Поиск элемента в списке
     * @param value значение элемента
     * @return узел
     */
    public Node contains(E value){
        Node node = head;
        while (node != null){

            if (node.value.equals(value)){
                return node;
            }

            node = node.next;
        }
        return null;
    }

    public void sort(Comparator<E> comparator){
        Node node = head;
        while (node != null){

            Node minValueNode = node;


            Node node2 = node.next;
            while (node2 != null){
                if (comparator.compare(minValueNode.value, node2.value) > 0){
                    minValueNode = node2;
                }
                node2 = node2.next;
            }

            if (minValueNode != node){
                E buf = node.value;
                node.value = minValueNode.value;
                minValueNode.value = buf;
            }

            node = node.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        while (node != null){
            stringBuilder.append(node.value);
            stringBuilder.append('\n');
            node = node.next;
        }
        return stringBuilder.toString();
    }
}






















