public class ImplementOwnLL {
    
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
    
    
    public static void main(String[] args) {
        
        Node head = null;
        
        head = new Node(10);
        head.next = new Node(15);
        
        System.out.println(head.item);
        System.out.println(head.next.item);
        
        
        
    }
    
}