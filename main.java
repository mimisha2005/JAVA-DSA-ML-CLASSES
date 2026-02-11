class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next= null;
    }
   } 
   class LinkedList{
    Node head,tail;

    // add at beginning
    public  void addAtBeginning(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    // Traverse and print the linked list

    public void traverse(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
            System.out.println();
    }
   }
   // Search 

   public boolean search(int key){
       Node temp= head;
       while(temp!=null){
        System.out.print(temp.data+ " ");
        if(temp.data == key)
       {
          System.out.print("TRUE");
          return true;
       }
       
        temp=temp.next;
       }
       return false;

       // insertion
       public void insertAtLast(){
        Node newNode = newNode(data);
        if(head == null) {
            Node newNode= new Node(data);
            return;
        }
       }

       public void insert_by_pos(int val, int pos){
          Node newNode = Node(val);

          temp = head;
          int counter = 1;
          while(count!= pos-1){
            temp = temp.next;
            counter++;
          }
          newNode.next = temp.next;
          temp.node = newNode;

       }

       // delete atlast node
       public void deleteAtLast(){
        if(head == null){
           return; 
        }
        if(head.next == null){
            head = null;
            return;
        }
        temp = head;
        while(temp.next == null)
        {
            temp = temp.next;
        }
        temp.next = null;       }
   }
    public class main{
     public static void main(String[] args) {
          LinkedList list= new LinkedList();
          list.addAtBeginning(10);
          list.addAtBeginning(20);
          list.addAtBeginning(30);
    
          System.out.println("Linked List after adding at the beginning:");
          list.traverse();
     }
    }