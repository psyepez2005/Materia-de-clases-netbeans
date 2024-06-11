package nodospracticatosca;
public class MainSinglyLikedList {
    public static void main(String[] args) {
     
        SinglyLinkedList list = new SinglyLinkedList();
        
        list= list.insert(list, 4);
        list= list.insert(list, 8);
        list= list.insert(list, 1);
        list.print(list);
        
        
        list.delete(list, 4);
        list.delete(list, 5);
        list.print(list);
  
        
 
        
    }
    
}
