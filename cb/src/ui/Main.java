package ui;
import entity.Base;
import entity.BaseNumber;
import utils.Validator;
public class Main{
    public static void main(String[] args) {
        try{
            BaseNumber number=BaseNumber.input();
            int choice=Validator.getInt("Enter 1 for binary, 2 for decimal, 3 for hexadecimal", 
                "Just 1->3", "Invalid!", 1, 3);
            BaseNumber result=null;
            switch(choice){
                case 1:
                    result=number.getOutputByBase(Base.BIN);
                    break;
                case 2:
                    result=number.getOutputByBase(Base.DEC);
                    break;
                case 3:
                    result=number.getOutputByBase(Base.HEX);
                    break;
            }
                System.out.println("Number after convert"+result.getNumber());
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}