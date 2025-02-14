public class Main {
    public static void main(String[] args) {
        LL node = new LL();
        node.first(10);
        node.first(20);
        node.first(30);
        node.first(40);
        node.last(80);
        node.insert(67,2);
        node.display();
        System.out.println();
        System.out.println(node.size);
        
        
    }
}