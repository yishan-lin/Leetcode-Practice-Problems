public class TreeRecursion {
    
    public static class Node {
        
        int item;
        Node left;
        Node right;
        
        public Node(int x) {
            
            item = x;
            left = null;
            right = null;
            
        }
        
        public Node(int x, Node l, Node r) {
            
            item = x;
            left = l;
            right = r;
            
        }
    }
    
    public static Node insert(int x, Node root) {
     
        if (root == null) {
            return new Node(x);
        }
        
        else if (root.item > x) {
            return insert(x, root.left);
        }
        
        else if (root.item < x) {
            return insert(x, root.right);
        }
        
        else {
            return root;
        }
        
    }
    
    public static void main(String[] args) {
        
        
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /* public static class Node {
         * 
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
         
         public static void preordertraversal(Node root) {
         
         if (root == null) {
         System.out.print("");
         }  
         else {
         System.out.print(root.item + ", ");
         preordertraversal(root.left);
         preordertraversal(root.right);
         }
         
         }
         
         public static int printleftleavessum(Node root) {
         
         if (root == null) {
         return 0;
         }
         
         else if (root.left.left == null && root.left.right == null && root.left !=null) {
         return (1 + printleftleavessum(root.right) + printleftleavessum(root.left));
         }
         
         else {
         return printleftleavessum(root.right) + printleftleavessum(root.left);
         }
         
         }
         
         public static void main(String[] args) {
         
         Node root1 = null;
         int[] A = {3, 9, 20, 15, 7};
         root1 = convertarraytotree(A);
         
         preordertraversal(root1);
         
         }
         }*/