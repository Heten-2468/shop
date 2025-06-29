public class Youtube {

    private int subs;
    private int avgViews;
    private String name;
    private String type;
    private double avgTime;

    public Youtube(){
        this(10000, 100000, "Defname", "entertainment", 20.67);
    }

    public Youtube(int subs, int avgViews, String name, String type, double avgTime){
        this.subs = subs;
        this.avgViews = avgViews;
        this.name = name;
        this.type = type;
        this.avgTime = avgTime;
    }

    public Youtube(int subs, int avgViews){
        this(subs, avgViews, "Defname", "Entertainment", 20.56);
    }

    public double getAvgTime() {
        return avgTime;
    }

    public void setAvgTime(double avgTime) {
        this.avgTime = avgTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvgViews() {
        return avgViews;
    }

    public int getSubs() {
        return subs;
    }

    public void setSubs(int subs) {
        this.subs = subs;
    }

    public void setAvgViews(int AvgViews){
        avgViews = AvgViews;
    }

}