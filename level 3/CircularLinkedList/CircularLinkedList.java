public class CircularLinkedList implements LinkedList {
    private Node head;
    private java.util.LinkedList<Integer> inlist;


    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public CircularLinkedList(){
        this.head=null;
        this.inlist=new java.util.LinkedList<>();

    }

    @Override
    public int at(int index) {
        if(index<0||inlist.isEmpty()){
            return -1;
        }

        for(int i =0;i<index;i++){
            next(null);
        }
        return inlist.get(index %inlist.size());
    }

    @Override
    public void add(int value) {
        int c=inlist.size();
        if (c>1){
            for (int i=0;i<c;i++){
                next(null);
            }

        }
        inlist.add(value);
    }

    @Override
    public void remove(int index) {
        if(index<0||inlist.isEmpty()){
            return ;
        }

        for(int i =0;i<index;i++){
            next(null);
        }
         inlist.remove(index %inlist.size());
    }

    @Override
    public int size() {
        return inlist.size();
    }

    private Node next(Node node) {
        System.out.println("Go to next node");
        return null;
    }
}
