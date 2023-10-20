package HashAndThree;

import java.util.ArrayList;
import java.util.List;


public class Three {
    Node root;

    public boolean exists(int value) {
        if (root != null) {
            Node node = find(root, value);
            if (node != null) {
                return true;
            }
        }
        return false;
    }

    public boolean exists1(int value) {
        if (root != null) {
            Node node = find(value);
            if (node != null) {
                return true;
            }
        }
        return false;
    }

    /** Метод обхода элементов дерева "в глубину"
     * @param node
     * @param value
     * @return
     */
    private Node find(Node node, int value) {
        if (node.value == value) {
            return node;
        } else {
            for (Node child : node.children) {
                Node result = find(child, value);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }

    /** Метод обхода элементов дерева "в ширину"
     * @param value
     * @return
     */
    private Node find(int value) {
        List<Node> line = new ArrayList<>();
        line.add(root);
        while (line.size() > 0) {
            List<Node> nextLine = new ArrayList<>();
            for (Node node : line) {
                if (node.value == value) {
                    return node;
                }
                nextLine.addAll(node.children);
            }
            line = nextLine;
        }
        return null;
    }
     
    public class Node {
        int value;
        List<Node> children;
    }
}
