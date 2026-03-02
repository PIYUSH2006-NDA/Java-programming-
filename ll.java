class ll{
     Node head;
     class Node{
          int data;
          Node next;
          Node(int data){
               this.data=data;
               this.next=null;
          }
     }
     //AT FIRST POSOTION
          public void addfir(int data){
          Node newnode=new Node(data);
          if (head==null){
               head=newnode;
               return;
          }
          newnode.next=head;
          head=newnode;
     }
     // IN LAST POSOTION
     public void addlast(int data){
          Node newNode=new Node(data);
          if (head==null){
               head=newNode;
               return;
          }
          Node currNode= head;
          while(currNode.next!=null){
               currNode=currNode.next;
          }
          currNode.next=newNode;
     }
     public void display(){
          if (head==null){
               System.out.print("khali hai ");
               return;
          }
          while(head!=null){
               System.out.print(head.data+" ");
               head=head.next;
          }
     }
     public static void main(String[] args) {
          ll list=new ll();
          list.addfir(10);
          list.addfir(20);
          list.addfir(30);
          list.addlast(40);
          list.display();
     }
}