public class Clothecollection {
    //* a private link for head of the node and intialized to null//
    private Node head=null;
    int size=0;
    //Public method of add that takes 4 parameters and  returns nothing
    public void add(String color, String material,String ClothesType,String SleeveLength){
        Node newNode=new Node(new clothe(color,material,ClothesType,SleeveLength));
        if (head==null){
            head=newNode;
        }
        else{
            //* Add new node to the end of the linked list//
            Node curNode=head;
            while(curNode.next !=null){
                curNode=curNode.next;
            }
            curNode.next=newNode;
        }
        ++size;
    }
    //* show all method that prints out all the blueRays in the collection using toString method.//
    public void show_all(){
        if (head==null){
            System.out.println(" ");
        }
        else{
            Node curNode=head;
            while(curNode!=null){
                System.out.println(curNode.disk.toString());
                curNode=curNode.next;
            }
        }
    }
    //Search method that will look thru the linked list following the title to be matched//
    public String search(String title) {
        Node curr = head;
        while (curr != null) {
            if (curr.disk.color.toLowerCase().equals(title.toLowerCase())) {
                return curr.disk.toString();
            }
            curr=curr.next;
        }            return "Not found ";

    }
    //* Remove method that takes in remove title and indicates its success or failure//
    public boolean remove(String title){
        if (head==null){
            return false;
        }
        else if (head.disk.color.toLowerCase().equals(title.toLowerCase())){
            head=head.next;
            return true;
        }
        Node curr=head;
        Node tmp=head.next;
        while(tmp !=null){
            if (tmp.disk.color.toLowerCase().equals(title.toLowerCase())){
                curr.next=tmp.next;
                return true;
            }
            curr=tmp;
            tmp=tmp.next;
        }
        return false;
    }

}