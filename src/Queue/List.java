package Queue;
public class List<T> {
    //private Node arr[];
    private Node Head;
    /*public List(int length) {
        arr = new Node[length];
    }*/
    public List()
    {
        Head = null;
    }
    public static class Node <T>{
        T Data;
        Node next;
        Node(T data)
        {
            this.Data = data;
        }
    }
    public Node<T> GetHead()
    {
        return Head;
    }

    public List Insert(List list, T data)
    {
        Node new_node = new Node(data);
        new_node.next = null;
        if(list.Head == null)
        {
            list.Head = new_node;
        }
        else
        {
            Node last = list.Head;
            while(last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void printList(List list)
    {
        Node currNode = list.Head;
        System.out.println("Linked List : ");
        while(currNode != null)
        {
            System.out.println(currNode.Data + "");
            currNode = currNode.next;
        }
    }
    public Node<T> DeleteAndReturnHead()
    {
        Node<T> currNode = this.Head, prev = null;
        // CASE 1:
        // If head node itself holds the key to be deleted
        if(currNode != null)
        {
            prev = this.Head;
            this.Head = currNode.next;// Changed head
            // Display the message
            System.out.println("Head was deleted !");
            // Return the deleted node
            return prev;
            //
            // CASE 2:
            // If the key is somewhere other than at head
            //

            // Search for the key to be deleted,
            // keep track of the previous node
            // as it is needed to change currNode.next

        }
        return Head;
    }
}
