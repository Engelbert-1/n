/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Validation {
    public int inputInt(String msg, String wrongMsg, int MIN, int MAX){
        Scanner scan=new Scanner(System.in);        
        while(true){
            System.out.print(msg);
            try{
                int temp=Integer.parseInt(scan.nextLine().trim());
                if(temp<MIN || temp>MAX){
                    throw new NumberFormatException();
                }
                return temp;
            }catch(NumberFormatException e){
                System.err.print(wrongMsg);
            }
        }
    }
 
    public String inputString(String str) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(str);
                String input = scanner.nextLine();
                if (input == null || input.trim().isEmpty()) {
                    throw new Exception("String can't be empty!!!");
                }
                return input;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
 
  

    public String inputDate(String str) {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat dateParse = new SimpleDateFormat("dd-MMM-yyyy");
        dateFormat.setLenient(false);
        while (true) {
            System.out.print(str);
            try {
                Date date = dateFormat.parse(scan.nextLine());
                Date now=new Date();
                if(date.after(now)){
                    throw new Error();
                }
                return dateParse.format(date);
            } catch (ParseException e) {
                System.err.print("Enter with date format dd-MMM-yyyy!!!");
            }catch(Error e){
                System.err.println("Error");
            }
        }
    }
    
    public double inputDouble(String msg, String err, double MIN, double MAX){
        Scanner scan=new Scanner(System.in);        
        while(true){
            System.out.print(msg);
            try{
                double temp=Double.parseDouble(scan.nextLine().trim());
                if(temp<MIN || temp>MAX){
                    throw new NumberFormatException();
                }
                return temp;
            }catch(NumberFormatException e){
                System.err.print(err);
            }
        }
    }
    
    public int inputId(List<Expense> exp){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter ID: ");
        int id=Integer.parseInt(scan.nextLine());
        if(id<=0 || id>exp.size()){
            System.err.println("Delete an expense fail");
            return -1;
        }else{
            return id;
        }
    }
 
}
