
public class ExerciseRunner {

    public static void main(String[] args) {

        // =========================
        // Task tests
        // =========================

        Task task = new Task("Test description");

        // testGetDescription
        System.out.println(
            "Get Description: expected = Test description, actual = "
            + task.getDescription()
        );

        // testSetDescription
        task.setDescription("New description");

        System.out.println(
            "Set Description: expected = New description, actual = "
            + task.getDescription()
        );

        // testGetStatus
        Task task2 = new Task("Test description");

        System.out.println(
            "Get Status: expected = NEW, actual = "
            + task2.getStatus()
        );

        // testSetStatus
        task2.setStatus(TaskStatus.COMPLETED);

        System.out.println(
            "Set Status: expected = COMPLETED, actual = "
            + task2.getStatus()
        );


        // =========================
        // TaskList tests
        // =========================

        TaskList taskList = new TaskList(3);

        taskList.addTask("Go grocery shopping");
        taskList.addTask("Pay electricity bill");


        // testDisplayTasks
        taskList.setStatus(0, TaskStatus.COMPLETED);
        taskList.setDescription(1, "Pay all utility bills");

        System.out.println("\nDisplay Tasks:");
        taskList.displayTasks();


        // testInvalidSetStatus
        TaskList invalidStatusList = new TaskList(3);

        invalidStatusList.addTask("Go grocery shopping");
        invalidStatusList.addTask("Pay electricity bill");

        invalidStatusList.setStatus(5, TaskStatus.COMPLETED);

        System.out.println("\nInvalid Set Status:");
        invalidStatusList.displayTasks();


        // testInvalidSetDescription
        TaskList invalidDescriptionList = new TaskList(3);

        invalidDescriptionList.addTask("Go grocery shopping");
        invalidDescriptionList.addTask("Pay electricity bill");

        invalidDescriptionList.setDescription(
            5,
            "Pay all utility bills"
        );

        System.out.println("\nInvalid Set Description:");
        invalidDescriptionList.displayTasks();


        // testAddingTasksUpToCapacity
        TaskList capacityList = new TaskList(3);

        capacityList.addTask("Go grocery shopping");
        capacityList.addTask("Pay electricity bill");
        capacityList.addTask("Read a book");

        System.out.println("\nAdding Tasks Up To Capacity:");
        capacityList.displayTasks();


        // testAddingTasksBeyondCapacity
        TaskList beyondCapacityList = new TaskList(3);

        beyondCapacityList.addTask("Go grocery shopping");
        beyondCapacityList.addTask("Pay electricity bill");
        beyondCapacityList.addTask("Read a book");
        beyondCapacityList.addTask("Write a report");

        System.out.println("\nAdding Tasks Beyond Capacity:");
        beyondCapacityList.displayTasks();


        // =========================
        // Attribute modifiers
        // =========================

        try {

            java.lang.reflect.Field descriptionField =
                Task.class.getDeclaredField("description");

            java.lang.reflect.Field statusField =
                Task.class.getDeclaredField("status");

            System.out.println(
                "\nTask.description private = "
                + java.lang.reflect.Modifier.isPrivate(
                    descriptionField.getModifiers()
                )
            );

            System.out.println(
                "Task.status private = "
                + java.lang.reflect.Modifier.isPrivate(
                    statusField.getModifiers()
                )
            );


            java.lang.reflect.Field tasksField =
                TaskList.class.getDeclaredField("tasks");

            java.lang.reflect.Field capacityField =
                TaskList.class.getDeclaredField("capacity");

            System.out.println(
                "TaskList.tasks private = "
                + java.lang.reflect.Modifier.isPrivate(
                    tasksField.getModifiers()
                )
            );

            System.out.println(
                "TaskList.capacity private = "
                + java.lang.reflect.Modifier.isPrivate(
                    capacityField.getModifiers()
                )
            );

        } catch (NoSuchFieldException e) {

            System.out.println("Field not found: " + e.getMessage());
        }
    }
}