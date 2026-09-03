
 public class TodoList {
    private Task[] tasks;
    private int capacity;
    private int size;

    public TodoList(int capacity){
        this.capacity=capacity;
        this.tasks=new Task[capacity];
        this.size=0;
    }

    public void addTask(String description){
        if (size>=capacity){
            return;
        }
        tasks[size]=new Task(description);
        size++;
    }

    public void setStatus(int index, TaskStatus status){
        if(index<0||index>=size){
            return;
        }
        tasks[index].setStatus(status);
    }

    public void setDescription(int index, String newDescription){
        if(index<0||index>=size){
            return;
        }
        tasks[index].setDescription(newDescription);
    }


       
    public void displayTasks(){
        System.out.println("Tasks:");
        for (int i=0 ;i<size;i++){
            System.out.println(String.format("%-33s | %1s",tasks[i].getDescription(),tasks[i].getStatus()));
        }
    }
}
