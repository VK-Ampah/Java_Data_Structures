package ToDoList;

public class Main {
    public static void main(String[] args) {
        // Create an array of users
        User[] users = new User[3];
        users[0] = new User("vALARIE");
        users[1] = new User("mICKAYLA");
        users[2] = new User("cJourna");

        // Add tasks to users' to-do lists
        users[0].addTask("Buy groceries");
        users[0].addTask("Call mom");
        users[0].addTask("Send email to John");
        users[0].addTask("Pay bills");
        users[1].addTask("Pick up dry cleaning");
        users[1].addTask("Go to the gym");
        users[1].addTask("Buy a present for John");
        users[1].addTask("Finish project report");
        users[1].addTask("Clean the house");
        users[2].addTask("Prepare for exam");
        users[2].addTask("Read a book");
        users[2].addTask("Go for a walk");


        // Mark tasks as completed
        users[0].markTaskAsCompleted("Buy groceries");
        users[0].markTaskAsCompleted("Call mom");
        users[1].markTaskAsCompleted("Pick up dry cleaning");
        users[1].markTaskAsCompleted("Finish project report");
        users[2].markTaskAsCompleted("Prepare for exam");
        users[2].markTaskAsCompleted("Read a book");


        // Print all tasks for each user
        for (User user : users) {
            user.printAllTasks();
            System.out.println();
        }
    }
}

