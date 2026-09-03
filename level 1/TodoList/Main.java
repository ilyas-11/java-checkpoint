public class Main {

    public static void main(String[] args) throws Exception {

        // ===== Equivalent of @BeforeEach =====
        TodoList todoList = new TodoList(3);
        todoList.addTask("Go grocery shopping");
        todoList.addTask("Pay electricity bill");
        Task task = new Task("Test description");

        System.out.println("--------------------------------------------------");

        // ===== testGetDescription =====
        System.out.println("testGetDescription:");
        System.out.println(task.getDescription());
        System.out.println("Expected: Test description");

        System.out.println("--------------------------------------------------");

        // ===== testSetDescription =====
        System.out.println("testSetDescription:");
        task.setDescription("New description");
        System.out.println(task.getDescription());
        System.out.println("Expected: New description");

        System.out.println("--------------------------------------------------");

        // ===== testGetStatus =====
        System.out.println("testGetStatus:");
        System.out.println(task.getStatus());
        System.out.println("Expected: NEW");

        System.out.println("--------------------------------------------------");

        // ===== testSetStatus =====
        System.out.println("testSetStatus:");
        task.setStatus(TaskStatus.COMPLETED);
        System.out.println(task.getStatus());
        System.out.println("Expected: COMPLETED");

        System.out.println("--------------------------------------------------");

        // ===== testTaskAttributesModifiers =====
        System.out.println("testTaskAttributesModifiers:");

        java.lang.reflect.Field descriptionField =
                Task.class.getDeclaredField("description");
        java.lang.reflect.Field statusField =
                Task.class.getDeclaredField("status");

        System.out.println("description is private: " +
                java.lang.reflect.Modifier.isPrivate(descriptionField.getModifiers()));
        System.out.println("status is private: " +
                java.lang.reflect.Modifier.isPrivate(statusField.getModifiers()));

        System.out.println("Expected: true / true");

        System.out.println("--------------------------------------------------");

        // ===== testDisplayTasks =====
        System.out.println("testDisplayTasks:");

        todoList.setStatus(0, TaskStatus.COMPLETED);
        todoList.setDescription(1, "Pay all utility bills");

        todoList.displayTasks();

        System.out.println("Expected:");
        System.out.println("Tasks:");
        System.out.println("Go grocery shopping               | COMPLETED");
        System.out.println("Pay all utility bills             | NEW");

        System.out.println("--------------------------------------------------");

        // ===== testInvalidSetStatus =====
        System.out.println("testInvalidSetStatus:");
        todoList.setStatus(5, TaskStatus.COMPLETED);
        todoList.displayTasks();
        System.out.println("Expected: No change");

        System.out.println("--------------------------------------------------");

        // ===== testInvalidSetDescription =====
        System.out.println("testInvalidSetDescription:");
        todoList.setDescription(5, "Should not change");
        todoList.displayTasks();
        System.out.println("Expected: No change");

        System.out.println("--------------------------------------------------");

        // ===== testTodoListAttributesModifiers =====
        System.out.println("testTodoListAttributesModifiers:");

        java.lang.reflect.Field tasksField =
                TodoList.class.getDeclaredField("tasks");
        java.lang.reflect.Field capacityField =
                TodoList.class.getDeclaredField("capacity");

        System.out.println("tasks is private: " +
                java.lang.reflect.Modifier.isPrivate(tasksField.getModifiers()));
        System.out.println("capacity is private: " +
                java.lang.reflect.Modifier.isPrivate(capacityField.getModifiers()));

        System.out.println("Expected: true / true");

        System.out.println("--------------------------------------------------");

        // ===== testAddingTasksUpToCapacity =====
        System.out.println("testAddingTasksUpToCapacity:");

        TodoList list2 = new TodoList(3);
        list2.addTask("Go grocery shopping");
        list2.addTask("Pay electricity bill");
        list2.addTask("Read a book");

        list2.displayTasks();

        System.out.println("Expected:");
        System.out.println("Tasks:");
        System.out.println("Go grocery shopping               | NEW");
        System.out.println("Pay electricity bill              | NEW");
        System.out.println("Read a book                       | NEW");

        System.out.println("--------------------------------------------------");

        // ===== testAddingTasksBeyondCapacity =====
        System.out.println("testAddingTasksBeyondCapacity:");

        TodoList list3 = new TodoList(3);
        list3.addTask("Go grocery shopping");
        list3.addTask("Pay electricity bill");
        list3.addTask("Read a book");
        list3.addTask("Write a report"); // should not be added

        list3.displayTasks();

        System.out.println("Expected: only 3 tasks (no Write a report)");

        System.out.println("--------------------------------------------------");
    }
}