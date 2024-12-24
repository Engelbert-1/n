package utils;
import java.util.Scanner;
public class Validator{
    private static final Scanner SCANNER=new Scanner(System.in);
    private Validator(){
        
    }
    public static int getInt(String messageInfo, String messageErrorOutOfRange,
            String messageErrorNumber, int min, int max){
        do{
            try{
                System.out.print(messageInfo);
                int number=Integer.parseInt(SCANNER.nextLine());
                if(number>=min && number<=max){
                    return number;
                }else{
                    System.out.println(messageErrorOutOfRange);
                }
            }catch(NumberFormatException e){
                System.out.println(messageErrorNumber);
            }
        }
        while(true);
    }
    
    public static String getString(String messageInfo, String messageError, final String REGEX){
        do{
            System.out.print(messageInfo);
            String str=SCANNER.nextLine();
            if(str.matches(REGEX)){
                return str;
            }
            System.out.println(messageError);
        }
        while(true);
    }
}