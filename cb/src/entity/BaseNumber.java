package entity;
import utils.Validator;
public class BaseNumber{
    private Base base;
    private String number;

    public BaseNumber(Base base, String number) {
        this.base = base;
        this.number = number;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    private BaseNumber convertToDec(){
        int decNum=0;
        int base=this.base.value();
        int power=1;
        for(int i=number.length()-1;i>=0;i--){
            char digit=number.charAt(i);
            int digitValue=Character.getNumericValue(digit);
            decNum+=digitValue*power;
            power*=base;
        }
        return new BaseNumber(Base.DEC, Integer.toString(decNum));
    }
    
    private BaseNumber convertDecToOut(Base outBase){
        int decNum=Integer.parseInt(convertToDec().number);
        StringBuilder reverseResult=new StringBuilder();
        char[]baseDigits="0123456789ABCDEF".toCharArray();
        while(decNum!=0){
            int remainNum=decNum % outBase.value();
            decNum/=outBase.value();
            reverseResult.insert(0, baseDigits[remainNum]);
        }
        if(reverseResult.toString().trim().isEmpty()){
            reverseResult.insert(0, "0");
        }
        BaseNumber result=new BaseNumber(outBase, reverseResult.toString());
        return result;
    }
    
    public BaseNumber getOutputByBase(Base outBase){
        return new BaseNumber(outBase, convertDecToOut(outBase).number);
    }
    
    public static BaseNumber input(){
        Base base =null;
        String number=null;
        int choice=Validator.getInt("Enter 1 for binary, 2 for decimal, 3 for hexadecimal", 
                "Just 1->3", "Invalid!", 1, 3);
        switch(choice){
            case 1:
                base =Base.BIN;
                number=Validator.getString("Enter a number", "Not a valid number", "[01]+");
                break;
            case 2:
                base =Base.DEC;
                number=Validator.getString("Enter a number", "Not a valid number", "[0-9]+");
                break;
            case 3:
                base =Base.HEX;
                number=Validator.getString("Enter a number", "Not a valid number", "[0-9A-F]+");
                break;
        }
        return new BaseNumber(base, number);
    }
}