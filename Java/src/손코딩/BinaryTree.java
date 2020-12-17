package 손코딩;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    private Node node;

    public BinaryTree(Node node) {
        this.node = node;
    }

    public Node getNode() {
        return node;
    }

    public void BFS(Node node) {
        if (node == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            traverse(queue);
        }
    }

    public void DFS(Node node) {
        if (node == null) return;
        DFS(node.getLeft());
        System.out.print(node.getValue() + " ");
        DFS(node.getRight());
    }

    private void traverse(Queue<Node> queue) {
        Node poll = queue.poll();
        if (poll != null) {
            System.out.print(poll.getValue() + " ");
            getChild(queue, poll.getLeft());
            getChild(queue, poll.getRight());
        }
    }

    private void getChild(Queue<Node> queue, Node child) {
        if (child != null) {
            queue.add(child);
        }
    }

}
