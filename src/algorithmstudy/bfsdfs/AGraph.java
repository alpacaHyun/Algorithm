package algorithmstudy.bfsdfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AGraph {
    class Node {
        int data;
        boolean marked;
        LinkedList<Node> adjacent;

        Node(int data) {
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<>();
        }
    }

    Node[] nodes;

    void addEdge(int i1, int i2) {
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

        if (!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }
        if (!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }

    AGraph(int size) {
        Node[] graph = new Node[size];

        for (int i = 0; i < size; i++) {
            graph[i] = new Node(i);
        }
    }

    void bfs() {
        bfs(0);
    }

    void bfs(int index) {
        Node root = nodes[index];
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
                visit(n);
            }

        }
    }

    void dfs(){
        dfs(0);
    }

    void dfs(int index) {
        Node root = nodes[index];
        Stack<Node> stack = new Stack<>();

        stack.push(root);
        root.marked = true;

        while (!stack.isEmpty()) {
            Node n = stack.pop();

            for (Node r : n.adjacent) {
                if (r.marked == false) {
                    r.marked = true;
                    stack.push(r);
                }
            }
            visit(n);
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
        System.out.println(node.data);
    }
}
