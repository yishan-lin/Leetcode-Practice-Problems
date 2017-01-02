public class TreeRecursion {
    
    public static class Node {
        
        int item;
        Node right;
        Node left;
        
        public Node(int x) {
            
            item = x;
            right = null;
            left = null;
            
        }
        
        public Node(int x, Node r, Node l) {
            
            item = x;
            right = r;
            left = l;
            
        }
        
    }
    
    public static Node insert(int x, Node root) {
        
        if (root == null) { //if the root is empty, add new Node instantly
            return new Node(x);
        }
        else if (root.item > x) {
            root.left = insert(x, root.left);   
        }
        else if (root.item < x) {
            root.right = insert(x, root.right);
        }
        return root;
    }
    
    public static Node convertarraytotree(int[] array) {
     
        Node root = null;
        
        for (int x = 0; x < array.length; x++) {
         
            root = insert(array[x], root);
            
        }
        
        return root;
        
    }
    
    public static void main(String[] args) {
        
        Node root1 = null;
        int[] A = {5, 4, 7, 9, 12, 11, 5};
        root1 = convertarraytotree(A);
        
    }
}