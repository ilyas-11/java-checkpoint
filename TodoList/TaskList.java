enum TaskStatus {
    NEW, IN_PROGRESS, COMPLETED
}

class Task {
    private String description;
    private TaskStatus status;

    public Task(String description){
        this.description = description;
        this.status = TaskStatus.NEW;
    };
    public void setDescription(String description){
        this.description = description;
    };
    public String getDescription(){
        return description;
    };
    public TaskStatus getStatus(){
        return status;
    };
    public void setStatus(TaskStatus status){
        this.status = status;
    }
}

class TaskList {
    private Task[] tasks;
    private int capacity;
    private int size = 0;

    public TaskList(int capacity){
        this.capacity = capacity;
        this.tasks = new Task[capacity];
        this.size = 0;
    }

    public void addTask(String description){
        if (size>=capacity){
            return;
        }
        tasks[size] = new Task(description);
        size++;
    }

    public void setStatus(int index, TaskStatus status){
        if (index < 0 || index >= size){
            return;
        }
        tasks[index].setStatus(status);
    }

    public void setDescription(int index, String newDescription){
        if (index<0||index>=size){
            return ;
        }
        tasks[index].setDescription(newDescription);
    }

    public void displayTasks(){
        System.out.println("Tasks:");
        for (int i= 0 ;i<size;i++){
            System.out.println(String.format("%-35s|%s",tasks[i].getDescription(),tasks[i].getStatus()));
        }
    }
}
