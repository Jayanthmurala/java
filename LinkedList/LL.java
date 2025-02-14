public class LL{
    private Node head;
    private Node tail;
    public int size;
    public LL(){
        this.size=0;
    }
    public void first(int val){
        Node node = new Node(val);
        if (tail == null){
            tail = head;
        }
        node.next=head;
        head = node;
        size+=1;
    }
    public void last(int val){
        Node node = new Node(val);
        if (tail == null){
            first(val);
            return;
        }
        tail.next=node;
        tail = node;
        size+=1;
    }
    
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " " + "->" );
            temp = temp.next;
        }
        System.out.print("End");
    }
    
    
    public void insert(int val , int index){
        if(index == 0){
            first(val);
            return;
        }
        if(index == size ){
            last(val);
            return;
        }
        Node temp = head;
        for(int i =1 ; i < index ; i++){
            temp = temp.next;
        }
        Node node =  new Node(val , temp.next);
        temp.next = node;
        size++;
    }
        
    private class Node{
        private int val;
        private Node next;
        private Node(int val){
            this.val = val;
        }
        private Node (int val ,Node next){
            this.val=val;
            this.next=next;
        }
    }
}