import java.util.*;

public class Function {

    public void displayMenu() {
        System.out.printf(
                "========== Task program ==========\n"
                + "1.Add Task\n"
                + "2.Delete Task\n"
                + "3.Display Task\n"
                + "4.Exit\n");
    }


    public void addTask(List<Task> task) {
        Validation Valid = new Validation();
        
        int id = 1;
        if (!task.isEmpty()) {
            id = task.get(task.size() - 1).getId() + 1;
        }

        String name = Valid.inputString("Requirement Name: ");

        int idTask = Valid.inputInt("Task Type: ", "From 1 to 4: ", 1, 4);

        String date = Valid.inputDate("Date: ");

        double from = Valid.inputFrom();

        double to = Valid.inputTo(from);

        String assign = Valid.inputString("Assignee: ");

        String review = Valid.inputString("Reviewer: ");

        while (Valid.duplicate(name, date, from, to, task)) {
            System.err.println("Have dulicate task!!! Enter time again");
            date = Valid.inputDate("Date: ");
            from = Valid.inputFrom();
            to = Valid.inputTo(from);
        }
        Task temp = new Task(id, name,idTask, date, from, to, assign, review);
        task.add(temp);
    }

  
    public void delTask(List<Task> task) {
        Validation Valid = new Validation();
        
        System.out.println("---------Del Task------");
        
        int id = Valid.inputInt("ID: ", "ID not exist: ", 1, task.size());
        
//        for (int i=task.size()-1; i>=id; i--){
//            Task temp = task.get(i);
//            temp.setId(task.get(i).getId()-1);
//            task.set(i, temp);
//        }
//        task.remove(id-1);
        for(int i=task.size()-1;i>=id;i--){
            Task temp=task.get(i);
            temp.setId(task.get(i).getId()-1);
            task.set(i, temp);
        }
        task.remove(id-1);
        System.out.println("Delete task successful");
        
    }

    
    public void displayTask(List<Task> task) {
        System.out.println("----------------------------------------- Task ---------------------------------------\n"
                + "ID 	Name Task Type	Date		Time		Assignee	Reviewer");
        for (Task temp : task){
            System.out.println(temp.toString());
        }
    }
    
    
}



