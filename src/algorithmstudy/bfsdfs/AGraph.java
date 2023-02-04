package algorithmstudy.bfsdfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AGraph {

    class Node {
        int data;
        LinkedList<Node> adjacent;

        boolean marked;

        Node(int data) {
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<>();
        }
    }

    Node[] nodes;

    AGraph(int size) {
        nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(i);
        }
    }

    void addEdgd(int i1, int i2) {
        Node n1 = new Node(i1);
        Node n2 = new Node(i2);

        if (!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }
        if (!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }

    }

    void dfs() {
        dfs(0);
    }

    void dfs(int index) {
        Node root = nodes[index];
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        root.marked = true;

        while (!stack.isEmpty()) {
            Node r = stack.pop();

            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    stack.push(n);
                }
            }
            visit(r);
        }

    }

    void bfs() {
        bfs(0);
    }

    void bfs(int index) {
        Node root = new Node(index);

        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        root.marked = true;

        while (!queue.isEmpty()) {
            Node r = queue.poll();
            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    queue.offer(n);
                }
            }
            visit(r);
        }
    }

    void dfsRecursion(Node r) {
        if (r == null) {
            return;
        }

        r.marked = true;
        visit(r);

        for (Node n : r.adjacent) {
            if (n.marked == false) {
                dfsRecursion(n);
            }
        }
    }

    void visit(Node node) {
        System.out.println(node.data + " ");
    }
}
