public class java27 {

    node head;

    class node{
        int data;
        node next;

        node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void athead(int data)
        {
            node temp = new node(data);
            if(head == null)
            {
                head = temp;
                return;
            }
            
            temp.next = head;
            head = temp;
        }

        public void atlast(int data)
            {
                node temp  = new node(data);
        
                node currentNode = head;
                while(currentNode.next != null)
                {
                    currentNode = currentNode.next;
                }
        
                currentNode.next = temp;
            } 

            public void printList()
                {
                    if(head == null)
                    {
                        System.out.println("List is empty");
                        return;
                    }
                    node currentNode = head;
                    while(currentNode != null)
                    {
                        System.out.print(currentNode.data + " -> ");
                        currentNode = currentNode.next;
                    }
            
                    System.out.println("NULL");
                }


    public void reverse()
    {
        if(head == null || head.next == null)
        {
            return;
        }

        node currnode = head;
        node prevnode = null;

        while(currnode != null)
        {
            node nextnode = currnode.next;
            currnode.next = prevnode;

            // update
            prevnode = currnode;
            currnode = nextnode;
        }

        head.next = null;
        head = prevnode;
    }

    public static void main(String[] args) {
        java27 list = new java27();
        list.athead(2);
        list.atlast(4);
        list.atlast(6);
        list.atlast(8);

        list.printList();
        list.reverse();
        list.printList();
    }
}
