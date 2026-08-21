class MyLinkedList {
    class Node{
         int val;
     Node next;
    Node(int val){
        this.val=val;
        this.next=null;
     }   
    }

    Node head;
    Node tail;
    public MyLinkedList() {
    head=null;
    tail=null;
    }
    
    public int get(int index) {
        Node temp =head;
        int i=0;
        while(temp!=null){
            if(i == index){
                return temp.val;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
     Node newNode=new Node(val);
     if(head==null){
        head=tail=newNode;
        return;
     }   
     newNode.next=head;
     head=newNode;
    }
    
    public void addAtTail(int val) {
         Node newNode=new Node(val);
     if(head==null){
        head=tail=newNode;
        return;
     }   
     tail.next=newNode;
     tail=newNode;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0){
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
       Node temp=head;
       int i=0;
       while(temp!=null && i< index-1){
        temp=temp.next;
        i++;
       } 
       if(temp==null){
            return;
        }
        if (temp == tail) {
            addAtTail(val);
            return;
        }
        
          Node newNode = new Node(val);
       newNode.next=temp.next;
       temp.next=newNode;
    }
    
    public void deleteAtIndex(int index) {
        if(index <0 || head==null){
            return;
        }
        if(index ==0){
            head=head.next;

            if (head == null) {
                tail = null;
            }

            return;
        }
         Node temp=head;
       int i=0;
       while(temp!=null && i< index-1){
        temp=temp.next;
        i++;
       } 
       if (temp == null || temp.next == null) {
            return;
        }

        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;
     
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */