package Tree;

import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    Node(int val) {
        data = val;
    }
}

public class BST {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Node root = null;
        for(int i=0;i<9; i++){
            int data = sc.nextInt();
            root = createTree(root, data);
        }
        inorder(root);
        searchTree(root, 999);

        root =  deleteNode(root, 60);

        inorder(root);
    }

    private static Node deleteNode(Node root, int data) {
        if(root == null){
            return root;
        }

        if(data < root.data){
            root.left = deleteNode(root.left, data);
        }

        else if(data > root.data){
            root.right = deleteNode(root.right, data);
        }

        else{
            if(root.left == null){
                return root.right;
            }else if( root.right == null){
                return root.left;
            }

            root.data = getInorderSucc(root);
            root.right = deleteNode(root.right, root.data);
        }

        return root;
    }

    private static int getInorderSucc(Node root) {
        int minv = root.data;
        while(root.left != null){
            minv = root.data;
            root = root.left;
        }
        return minv;
    }

    public static void searchTree(Node root, int key){
        if(root == null){
            System.out.println(" Key Not Found");
            return;
        }
        if(root.data == key){
            System.out.println(" Key Found");
            return;
        }

        if(key < root.data){
            searchTree(root.left, key);
        }

        if(key > root.data){
            searchTree(root.right, key);
        }
    }

    private static void inorder(Node root) {
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(" "+root.data);
        inorder(root.right);
    }

    public static Node createTree(Node root, int data) {
        if(root == null){
            return new Node(data);
        }

        if(data < root.data){
            root.left = createTree(root.left, data);
        }else if(data > root.data){
            root.right = createTree(root.right, data);
        }

        return root;
    }

}
