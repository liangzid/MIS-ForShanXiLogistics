package data.zhongtie;

//系统总报表明细表
public class MingXi {
    private String number;           //报表序号
    private String nameOfTable;      //报表名称
    private Integer timePerTable;    //报表周期
    private String personForIt;      //报送负责人
    private String personForReporter;//报送人
    private String otherThingsToSay; //备注

    //方法:设置和读取以上两种属性
    public void setNameOfTable(String nameOfTable) {
        this.nameOfTable = nameOfTable;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setOtherThingsToSay(String otherThingsToSay) {
        this.otherThingsToSay = otherThingsToSay;
    }

    public void setPersonForIt(String personForIt) {
        this.personForIt = personForIt;
    }

    public void setPersonForReporter(String personForReporter) {
        this.personForReporter = personForReporter;
    }

    public void setTimePerTable(Integer timePerTable) {
        this.timePerTable = timePerTable;
    }

    public Integer getTimePerTable() {
        return timePerTable;
    }

    public String getNameOfTable() {
        return nameOfTable;
    }

    public String getNumber() {
        return number;
    }

    public String getOtherThingsToSay() {
        return otherThingsToSay;
    }

    public String getPersonForIt() {
        return personForIt;
    }

    public String getPersonForReporter() {
        return personForReporter;
    }

}
