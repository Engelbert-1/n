//// Function.java
//import java.util.*;
//public class Function {
//    Validation Valid = new Validation();
//
//    public void displayMenu() {
//        System.out.printf(
//            "========== Handy Expense Program ==========\n" +
//            "1.Add An Expense\n" +
//            "2.Display All Expenses\n" +
//            "3.Delete An Expense\n" +
//            "4.Quit\n");
//    }
//
//    public void addExp(List<Expense> exp){
//        System.out.println("-------Add an expense------------");
//        int id = 1;
//        if (!exp.isEmpty()){
//            id = exp.get(exp.size()-1).getId() + 1;
//        }
//
//        String date = Valid.inputDate("Enter Date: ");
//
//        double amount = Valid.inputDouble("Enter Amount: ", "ERROR Amount!!!", 1, Double.MAX_VALUE);
//
//        String content = Valid.inputString("Enter Content: ");
//
//        Expense temp = new Expense(id, date, content.toLowerCase(), amount);
//        exp.add(temp);
//    }
//
//    
//    
//    public void displayExp(List<Expense> exp){
//        System.out.println("-------------Display all expenses-------------\n" + 
//            "ID      Date            Amount          Content");
//        
//        double sum = 0;
//        for (Expense temp : exp){
//            System.out.println(temp.toString());
//            sum += temp.getNumber();
//        }
//        System.out.println("Total: " + (int)sum);
//    }
//
//  
//    
//    public void delExp(List<Expense> exp){
//        System.out.println("-------Delete an expense------------");
//        int id = Valid.inputId(exp);
//        
//        if (id != -1){
//            for (int i = exp.size()-1; i>=id; i--){
//                Expense temp = exp.get(i);
//                int tempID = temp.getId();
//                temp.setId(tempID-1);
//                exp.set(i, temp);
//            }
//            
//            exp.remove(id-1);
//            System.out.println("Delete an expense successful");
//        }
//    }
//    
//}

import java.util.*;
public class Function{
    Validation Valid=new Validation();
    public void displayMenu(){
        System.out.printf("==========Handy Expense Program====\n"
            +"1.Add an expense\n"
            +"2.Display all expenses\n"
            +"3.Delete an expense\n"
            +"4.Quit\n");
    }
    
    public void addExp(List<Expense> exp){
        System.out.println("------Add an expense--------");
        int id=1;
        if(!exp.isEmpty()){
            id=exp.get(exp.size()-1).getId()+1;
        }
        String date=Valid.inputDate("Enter Date: ");
        double amount=Valid.inputDouble("Enter amount: ", "Error amount!!!", 1, Double.MAX_VALUE);
        String content=Valid.inputString("Enter content: ");
        
        Expense temp=new Expense(id, date, content.toLowerCase(), amount);
        exp.add(temp);
    }
    
    public void displayExp(List<Expense> exp){
        System.out.println("--------Display all expense----------\n"
            +"ID      Date        Amount          Content");
        double sum=0;
        for(Expense temp : exp){
            System.out.println(temp.toString());
            sum+=temp.getNumber();
        }
        System.out.println("        Total: "+(int)sum);      
    }
    
    public void delExp(List<Expense> exp){
        System.out.println("-------Delete an expense-------");
        int id=Valid.inputId(exp);
//        if(id!=-1){
//            for(int i=exp.size()-1;i>=id;i--){
//                Expense temp=exp.get(i);
//                int tempID=temp.getId();
//                temp.setId(tempID-1);
//                exp.set(i, temp);
//            }
//            exp.remove(id-1);
//            System.out.println("Delete an expense successful");
//        }
        
        if(id!=-1){
            for(int i=exp.size()-1;i>=id;i--){
                Expense temp=exp.get(i);
                int tempID=temp.getId();
                temp.setId(tempID-1);
                exp.set(i, temp);
            }
            exp.remove(id-1);
            System.out.println("Delete an expense successful");
        }
    }
}