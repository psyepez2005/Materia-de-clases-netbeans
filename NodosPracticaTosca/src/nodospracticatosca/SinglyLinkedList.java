package nodospracticatosca;
public class SinglyLinkedList {
    
    class Node {
        int data;
        Node next;
 
        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    
    
    }
    
    Node head;
    
    
        // **************INSERTAR AL FINAL*************
 
    // Insertar un nuevo nodo
    public SinglyLinkedList insert(SinglyLinkedList list, int data)
    {
        // Crear un nuevo nodo
        Node new_node = new Node(data);
       //new_node.next = null;
 
       // Para el caso que la lista esté vacia
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Para ir al final de la lista
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
 
            // Insertar al final de la lista
            last.next = new_node;
        }
 
        return list;
    }
    
    
    
 // **************IMPRIMIR**************
 

    public void print(SinglyLinkedList list)
    {
         Node currNode = list.head;
         System.out.print("\nLinkedList: ");
         while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");
             // Go to next node
            currNode = currNode.next;
        }
        System.out.println("\n");
    }
    
    
    
    // **************ELIMINAR POR CLAVE**************
 

    public  SinglyLinkedList delete(SinglyLinkedList list,int key)
    {
        // Guardar la cabeza
        Node currNode = list.head, prev = null;
 
        // CASO 1:
        // Cuando el dato esta en la cabeza
 
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next; 

            System.out.println(key + " found and deleted");

            return list;
        }
 
        // CASO 2:
        // Cuando el dato está en otro lugar diferente a la cabeza
        // Buscar y borrar
        // Mantener el nodo previo

        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }
 
        // Si el dato fue encontrado, este debe estar en currNode
        // por tanto el currNode no debe ser nulo
        if (currNode != null) {

            // Desligar el currNode de la list
            prev.next = currNode.next;

            System.out.println(key + " found and deleted");
        }
 
        //
        // CASO 3: El dato no existe en la lista
        // currNode debería ser null
        if (currNode == null) {
            System.out.println(key + " not found");
        }

        return list;
    }
 
    
    
        
         
}


    