package baekjoon.silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Silver4_1388X {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());

        String[][] graph = new String[height][width];

        for (int i = 0; i < height; i++) {
            String s = br.readLine();
            String[] tmp = s.split("");
            for (int j = 0; j < width; j++) {
                graph[i][j] = tmp[j];
            }
        }

        Graph g = new Graph(height * width);

        for (int i = 0; i < height - 1; i++) {
            for (int j = 0; j < width - 1; j++) {
                String before = graph[i][j];

                if (before.equals("-")) {
                    String after = graph[i][j + 1];

                    if (before.equals(after)) {
                        g.addEdge(i * width + j, i * width + j + 1);
                    }


                } else if (before.equals("|")) {
                    String after = graph[i + 1][j];

                    if (before.equals(after)) {
                        g.addEdge(i * width + j, i * width + j + width);
                    }
                }

            }
        }

        int answer = 0;
        for (int i = 0; i < width*height; i++) {
            answer += g.dfs(i);
        }
        System.out.println(answer);
    }


    static class Graph {
        class Node {
            int date;
            boolean marked;
            LinkedList<Node> adjacent;

            public Node(int data) {
                this.date = data;
                this.marked = false;
                this.adjacent = new LinkedList<>();
            }
        }

        Node[] nodes;

        Graph(int size) {
            nodes = new Node[size];

            for (int i = 1; i <= size; i++) {
                nodes[i - 1] = new Node(i);
            }
        }


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

        int dfs(int index) {
            Node root = nodes[index];
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            root.marked = true;
            int answer = 0;

            while (!stack.isEmpty()) {
                answer++;
                Node pop = stack.pop();

                for (Node n : pop.adjacent) {
                    if (n.marked == false) {
                        n.marked = true;
                        stack.push(n);
                    }
                }
            }
            return answer;
        }
    }
}
