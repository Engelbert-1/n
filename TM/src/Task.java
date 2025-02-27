public class Task {
    private String date, name, assignee, reviewer;
    private double from, to;
    private int id, typeId;

    public Task() {
    }


    public Task(int id, String name, int typeid, String date, double from, double to, String assignee,
            String reviewer) {
        this.id = id;
        this.name = name;
        this.typeId = typeid;
        this.date = date;
        this.from = from;
        this.to = to;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }


    
    

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTypeId() {
        return typeId;
    }

    public String getDate() {
        return date;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public double getTime() {
        return to - from;
    }


    
    public void setName(String name) {
        this.name = name;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    
    public String getTaskType(){
        String taskType = "";
        switch (this.typeId) {
            case 1:
                taskType = "Code";
                break;
            case 2:
                taskType = "Test";
                break;
            case 3:
                taskType = "Design";
                break;
            case 4:
                taskType = "Review";
                break;
        }
        return taskType;
    }
    

    
    
    @Override
    public String toString(){
        return id +"\t" +name.trim()+"\t\t"+this.getTaskType().trim()+"\t\t"+date.trim()+"\t"+this.getTime()+"\t\t"+assignee.trim()+"\t\t"+reviewer.trim();
    }

    
    
}

