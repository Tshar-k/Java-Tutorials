// public class java26 {

//     Node head;
//     private int size;

//     java26(){
//             this.size = 0;
//         }
    
//     class Node{
//         String data;
//         Node next;

//         Node(String data)
//         {
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }


//     // add - frist and last

//     public void athead(String data)
//     {
//         Node temp = new Node(data);
//         if(head == null)
//         {
//             head = temp;
//             return;
//         }
        
//         temp.next = head;
//         head = temp;
//     }

//     public void atlast(String data)
//     {
//         Node temp  = new Node(data);

//         Node currentNode = head;
//         while(currentNode.next != null)
//         {
//             currentNode = currentNode.next;
//         }

//         currentNode.next = temp;
//     }

//     public void printList()
//     {
//         if(head == null)
//         {
//             System.out.println("List is empty");
//             return;
//         }
//         Node currentNode = head;
//         while(currentNode != null)
//         {
//             System.out.print(currentNode.data + " -> ");
//             currentNode = currentNode.next;
//         }

//         System.out.print("NULL");
//     }


//     public void deletefirst()
//     {
//         if(head == null)
//         {
//             System.out.println("there is nothing to delete");
//             return;
//         }
//         size--;
//         head = head.next;

//     }

//     public void deletelast()
//     {
//         if(head == null)
//         {
//             System.out.println("there is nothing to delete");
//             return;
//         }
//         size--;
//         if(head.next == null)
//         {
//             head = null;
//             return;
//         }

//         Node secondlast = head;
//         Node last = head.next;
//         while(last.next != null)
//         {
//             last = last.next;
//             secondlast = secondlast.next;
//         }
        
//         secondlast.next = null;
//     }



//     public int getsize()
//         {
//                 return size;
//         }

//     public static void main(String[] args)
//     {
//         java26 list = new java26();
//         list.athead("this");
//         list.atlast("is");
//         list.atlast("a");
//         list.atlast("List");

//         int si = list.getsize();
//         System.out.println(si);

//         list.printList();
//         System.out.println();
//         list.deletefirst();
//         list.deletelast();

//         list.printList();
//         System.out.println();
//         int s = list.getsize();
//         System.out.println(s);


//     }
// }

import java.util.*;

class LL{
    public static void main(String[] args) {
        LinkedList<String> List = new LinkedList<>();

        List.addFirst("tushar");
        List.addLast("kumar");
        System.out.println(List);
    }
}