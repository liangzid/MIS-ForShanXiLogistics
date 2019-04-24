package data.zhongtie;


//派送统计日报表
public class PaiSong {
    private String date;     //日期
    private String carID;     //车牌号
    private Integer numOfPiao;   //车票费
    private double cost;     //派送费
    private String name;         //司机姓名

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public Integer getNumOfPiao() {
        return numOfPiao;
    }

    public String getCarID() {
        return carID;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
