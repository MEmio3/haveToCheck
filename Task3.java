public class Task3 
{   
    public void Task3A(Node head)
    {   
        Node cur = head;
        while(cur!=null)
        {
            System.out.println(cur.elem);
            cur = cur.next;
        }
    }
    public void Task3B_recursive(Node head)
    {
        Node cur = head;
        System.out.println(Task3B_Helper(cur).elem + " >");
    }
    public Node Task3B_Helper(Node cur)
    {   
        if (cur.next == null) return null; 
        return Task3B_Helper(cur.next);
    }

    public static void main(String[] args) {
        
    }    
}
