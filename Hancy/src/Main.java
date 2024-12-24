//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Function Funct = new Function();
//        Validation Valid = new Validation();
//
//        List<Expense> exp = new ArrayList<>();
//
//        while(true){
//            Funct.displayMenu();
//            int choice = Valid.inputInt("Your Choice: ", "Error Choice!!!", 1, 4);
//
//            switch (choice) {
//                case 1:
//                    Funct.addExp(exp);
//                    break;
//                case 2:
//                    Funct.displayExp(exp);
//                    break;
//                case 3:
//                    Funct.delExp(exp);
//                    break;
//                case 4:
//                    System.exit(0);
//                    break;
//            }
//        }
//    }
//}

import java.util.*;
public class Main {
    public static void main(String[] args){
        Validation Valid = new Validation();
        Function Funct = new Function();
        List<Expense> exp = new ArrayList<>() ;
        
        while(true){           
            Funct.displayMenu();
            int chosen = Valid.inputInt("Chose option: ", "EROR CHOSEN!!! Chose Again: ", 1, 4);
            switch (chosen) {
                case 1:
                    Funct.addExp(exp);
                    break;
                case 2:
                    Funct.displayExp(exp);
                    break;                   
                case 3:
                    Funct.delExp(exp);
                    break;
                case 4:
                    System.exit(0);
                    break;                    
            }
        
        }      
    }
}

         
