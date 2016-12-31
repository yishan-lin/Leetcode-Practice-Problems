public class ImplementOwnHash {
    
    public static class Node {
        
        public int item;
        public Node next;
        
        public Node() {
            item = 0;
            next = null;
        }
        
        public Node(int x) {
            item = x;
            next = null;
        }
        
        public Node(int x, Node y) {
            item = x;
            next = y;
        }
    };
    
    Node[] X = new Node[SIZE];
    
    public int hash(int key) {
     
        return key * prime_number % SIZE;
        
    }
    
    public void insert_hash(int key) {
        
        X[hash(key)] = new Node(key, X[hash(key)]);
        
    }
    
    private static int prime_number = 23;
    private static int SIZE = 101;
    
    public static void main(String[] args) {
        
        
    }
    
}