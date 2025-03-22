package LinkedList;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
public class LinkedList {

    public static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }
    public static Node convert2LL(int[] arr){
        if(arr.length==0) return null;
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        return head;
    }
    public static int findLengthofLL(Node head){
        Node temp = head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public static Node insertAtFirstofLL(Node head,int ele){
        Node temp = new Node(ele);
        if(head==null) return temp;

        temp.next = head;
        head = temp;
        return head;
    }
    public static Node insertAtLastofLL(Node head,int ele){
        Node temp = new Node(ele);
        if(head==null) return temp;

        Node mover = head;
        while(mover.next!=null){
            mover = mover.next;
        }
        mover.next = temp;
        return head;
    }
    public static Node insertAtGivenPosofLL(Node head,int ele, int pos){
        if(pos==1) return insertAtFirstofLL(head,ele);

        int cnt=0;
        Node temp = head;
        while(temp!=null){
            cnt+=1;
            if(cnt==pos-1){
                Node t = new Node(ele);
                t.next = temp.next;
                temp.next = t;
                break;
            }
            temp=temp.next;
        }

        return head;
    }
    public static void deleteNode(Node node){
        while(node.next.next!=null){
            node.data = node.next.data;
            node = node.next;
        }
        node.data = node.next.data;
        node.next = null;
    }
    static Node revIterative(Node head){
        if(head == null || head.next == null) return head;

        Node prev = null;
        Node curr = head;
        head = head.next;

        while(head != null){
            curr.next = prev;
            prev = curr;
            curr = head;
            head = head.next;
        }
        // head == null, curr = head -1 amd prev = curr -1

        curr.next = prev;

        return curr;
    }
    static Node revRecursion(Node head){
        if(head==null || head.next==null) return head;

        Node newHead = revRecursion(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,4,-1,5};
        Node head = convert2LL(arr);
        System.out.println("Length of LL: "+findLengthofLL(head));
       // head = insertAtFirstofLL(head,100);
      //  printLL(head);
       // head = insertAtLastofLL(head,-100);
       // printLL(head);
       // head = insertAtGivenPosofLL(head,20,6);
        printLL(head);
//        deleteNode();
        //printLL(revIterative(head));
        printLL(revRecursion(head));
    }
}
