
public class DoubleLinkedList implements LinkedList {
    private Node head;
    private Node tail;

    private java.util.LinkedList<Integer> inlist;

    private class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
    public  DoubleLinkedList() {
        this.head=null;
        this.tail=null;
        this.inlist=new java.util.LinkedList<>();
    }


    @Override
    public int at(int index) {
        if(index<0||index>=inlist.size()){
            return -1;
        }
        simelation(index);
        return inlist.get(index);
    }

    @Override
    public void add(int value) {
       inlist.add(value);
    }

    @Override
    public void remove(int index) {
        if(index<0||index>=inlist.size()){
            return ;
        }
        simelation(index);
        inlist.remove(index);
    }

    @Override
    public int size() {
        return inlist.size();
    }

    private Node next(Node node) {
        System.out.println("Go to next node");
        return null;
    }

    private Node prev(Node node) {
        System.out.println("Go to previous node");
        return null;
    }
    private void simelation(int index){
        int c= inlist.size();
        if (index<=(c-1)/2){
            for(int i = 0; i<index;i++){
                next(null);
            }
        }else{
            for(int i=c-1;i>index;i--){
                prev(null);
            }
        }
    }
}
