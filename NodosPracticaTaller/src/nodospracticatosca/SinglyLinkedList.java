package nodospracticatosca;

public class SinglyLinkedList {

    class Node {

        int cedula;
        String nombre;
        String apell;
        double nota;
        Node next;

        public Node(int cedula, String nombre, String apell, double nota) {
            this.cedula = cedula;
            this.nombre = nombre;
            this.apell = apell;
            this.nota = nota;
            this.next = null;
        }

    }

    Node head;

    public void promediar(SinglyLinkedList list) {
        Node currNode = list.head;
        double sumatoria = 0;
        int contador = 0;
        while (currNode != null) {
            sumatoria += currNode.nota;
            currNode = currNode.next;
            contador++;
        }
        double promedio = sumatoria / contador;
        System.out.println("El promedio es: " + promedio);
    }

    public SinglyLinkedList insert(SinglyLinkedList list, int ced, String nombre, String apell, double nota) {

        Node new_node = new Node(ced, nombre, apell, nota);
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public void print(SinglyLinkedList list) {
        Node currNode = list.head;
        System.out.print("\nLinkedList: ");
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.cedula + " " + currNode.nombre + " " + currNode.apell + " " + currNode.nota + " \n");

            // Go to next node
            currNode = currNode.next;
        }
        System.out.println("\n");
    }

    public SinglyLinkedList delete(SinglyLinkedList list, int key) {
        Node currNode = list.head, prev = null;
        if (currNode != null && currNode.cedula == key) {
            list.head = currNode.next;

            System.out.println(key + " found and deleted");

            return list;
        }

        while (currNode != null && currNode.cedula != key) {
            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode != null) {

            prev.next = currNode.next;

            System.out.println(key + " found and deleted");
        }

        if (currNode == null) {
            System.out.println(key + " not found");
        }

        return list;
    }

}
