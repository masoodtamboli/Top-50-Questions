package Tree;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
    }
}

class Pair<T, E> {
    T key;
    E value;

    Pair(T key, E value) {
        this.key = key;
        this.value = value;
    }
}

class MyTree {
    static Scanner sc = new Scanner(System.in);

    static Node createTree() {
        System.out.println("Enter Root ");
        int data = sc.nextInt();
        Node root = new Node(data);

        if(data == -1)
            return root;

        System.out.println("Enter left of: " + data);
        root.left = createTree();

        System.out.println("Enter right of: " + data);
        root.right = createTree();

        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    //Level order traversal
    static void traversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root == null) {
            return;
        }

        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            System.out.print(curr.data + " ");

            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }

    static void leftView(Node root) {
        if (root == null)
            return;

        ArrayList<Node> list = new ArrayList<>();
        getLeftView(root, list, 0);
        for (Node temp : list) {
            System.out.print(temp.data + " ");
        }
    }

    static ArrayList<Node> getLeftView(Node root, ArrayList<Node> list, int level) {
        if (root == null)
            return list;

        if (list.get(level) == null) {
            list.set(level, root);
        }

        getLeftView(root.left, list, level + 1);
        getLeftView(root.right, list, level + 1);
        return list;
    }

    static int maxHeight(Node root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxHeight(root.left), maxHeight(root.right)) + 1;
    }

    static int size(Node root) {
        if (root == null)
            return 0;

        return size(root.left) + size(root.right) + 1;
    }

    static int getMax(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        return Math.max(root.data, Math.max(getMax(root.left), getMax(root.right)));
    }

    static int getMin(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;

        return Math.min(root.data, Math.max(getMin(root.left), getMin(root.right)));
    }

    static void topView(Node root) {
        Queue<Pair<Node, Integer>> q = new LinkedList<>();
        Map<Integer, Integer> m = new HashMap<>();

        if (root == null)
            return;

        q.add(new Pair<>(root, 0));

        while (!q.isEmpty()) {
            int line = q.peek().value;
            Node rN = q.peek().key;

            m.put(line, rN.data);

            Node curr = q.poll().key;

            if (curr.left != null) {
                q.add(new Pair<>(curr.left, line - 1));
            }

            if (curr.right != null) {
                q.add(new Pair<>(curr.right, line + 1));
            }
        }

        while (!m.isEmpty()) {
            System.out.println(m.entrySet());
        }
    }
}

class Tree {
    public static void main(String[] args) {
        Node root = MyTree.createTree();
        MyTree.topView(root);
    }
}