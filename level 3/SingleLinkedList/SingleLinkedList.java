public class SingleLinkedList implements LinkedList {
    private Node head;
    private int size;

    private java.util.List<Integer> inlist;


    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public SingleLinkedList(){
        this.head=null;
        this.inlist=new java.util.ArrayList<>();
    }

    @Override
    public int at(int index) {
        if(index<0||index>=inlist.size()){
            return -1;

        }
        for(int i =0 ;i<index;i++){
            next(null);

        }
        return inlist.get(index);
    }

    @Override
    public void add(int value) {
        int c=inlist.size();
        if(c>0){
            for(int i=0;i<c-1;i++){
                 next(null);
             }

        }
        inlist.add(value);
    }

    @Override
    public void remove(int index) {
        if(index<0||index>=inlist.size()){
            return ;

        }
        for(int i =0 ;i<index;i++){
            next(null);

        }
         inlist.remove(index);
    }

    @Override
    public int size() {
        return inlist.size();
    }

    private Node next(Node node) {
       System.out.print("Go to next node\n");
        return null;
    }
}
