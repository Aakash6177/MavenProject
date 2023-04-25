package practice_1;

public class LinkedList {
    Node_L head;

    public LinkedList(){
        head = null;

    }

    public void insert(int data){
        Node_L newNode = new Node_L(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node_L currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }


    public void delete(int data){
        if(head == null){
            System.out.println("List is epmty");
        }
        if(head.data == data){
            head = head.next;
        }
        else{
            Node_L currentNode = head.next;
            Node_L prev = head;
            while(currentNode != null){

                if(currentNode.data == data){
                    prev.next = currentNode.next;
                }
                prev = currentNode;
                currentNode = currentNode.next;
            }
        }
    }




    public void display(){
        Node_L currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data+" ");
            currentNode = currentNode.next;
        }
    }



    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insert(12);
        l1.insert(23);
        l1.insert(32);
        l1.delete(23);

        l1.display();
    }

}
