//public class Expense {
//    private int id;
//    private String date, content;
//    private double number;
//
//    public Expense() {
//    }
//
//    public Expense(int id, String date, String content, double number) {
//        this.id = id;
//        this.date = date;
//        this.content = content;
//        this.number = number;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public double getNumber() {
//        return number;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public void setNumber(double number) {
//        this.number = number;
//    }

//    @Override
//    public String toString() {
//        return id + "\t" + date + "\t" + (int) number + "\t\t" + content;
//    }
//}

public class Expense{
    private int id;
    private String date, content;
    private double number;
    
    public Expense(){
        
    }

    public Expense(int id, String date, String content, double number) {
        this.id = id;
        this.date = date;
        this.content = content;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public double getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return  id + "\t" + date + "\t"+ (int)number+"\t\t"+content;
    }

    
    
    
}