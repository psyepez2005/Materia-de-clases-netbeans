package tallergrupalpilasycolas1;
public class Cola_SRI {
    class Node {
        int data;
        Node next;
 

        Node(int d)
        {
            data = d;
            next = null;
        }
    
    
    }

    Node head;
    public Cola_SRI insert(Cola_SRI cola, int data)
    {

        Node new_node = new Node(data);

        if (cola.head == null) {
            cola.head = new_node;
        }
        else {

            Node last = cola.head;
            while (last.next != null) {
                last = last.next;
            }
 

            last.next = new_node;
        }
 
        return cola;
    }
    

    public void print(Cola_SRI cola)
    {
         Node currNode = cola.head;
         System.out.print("\n=========================\n ");
         while (currNode != null) {

            System.out.print(currNode.data + " ");

            currNode = currNode.next;
        }
        System.out.println("\n=========================\n");
    }
    


    public  Cola_SRI delete(Cola_SRI cola,int key)
    {

        Node currNode = cola.head, prev = null;

        if (currNode != null && currNode.data == key) {
            cola.head = currNode.next; 

            System.out.println(key + " Salio");

            return cola;
        }

        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode != null) {

            prev.next = currNode.next;

            System.out.println(key + " Salio");
        }

        if (currNode == null) {
            System.out.println(key + " No esta aqui");
        }

        return cola;
    }
    public Cola_SRI atender(Cola_SRI cola){
        Node currNode = cola.head, prev = null;
        if(currNode==null){
            System.out.println("LA COLA ESTA VACIA");
            return cola;
        }
        if(currNode!=null){
            cola.head=cola.head.next;
            return cola;
        }
        
    return cola;
    }
       
}