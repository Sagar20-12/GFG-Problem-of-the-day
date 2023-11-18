class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class ReverseDLL {
    public static void swap(Node node) {
    Node tmp = node.prev;
    node.prev = node.next;
    node.next = tmp;
}
public static Node reverseDLL(Node  head) {
    Node curr = head, tmp = head.next;
    while(tmp!=null) {
        swap(curr);
        curr = tmp;
        tmp = tmp.next;
    }
    
    swap(curr);
    
    return curr;
}
}
