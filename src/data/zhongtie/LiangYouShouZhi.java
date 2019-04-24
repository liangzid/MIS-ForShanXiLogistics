package data.zhongtie;

//粮油收支报表
public class LiangYouShouZhi {
    private double timeOfSendFood;  //发货时间
    private String infoOfMessagerman;//配送联系人信息
    private String addressWhere;     //配送交货地址
    private Integer numOfSend;      //发货数量
    private double weightOfSend;     //发货重量
    private double price;           //单价
    private double moneyForTrans;    //运费
    private double assit;           //补助
    private double moneyAll;         //总花费
    private double costForTrans;       //运费支出
    private double costForXie;          //卸货支出
    private double moneyGetPre;         //预估利润
    private String situation;        //回单情况




    public void setAddressWhere(String addressWhere) {
        this.addressWhere = addressWhere;
    }

    public void setInfoOfMessagerman(String infoOfMessagerman) {
        this.infoOfMessagerman = infoOfMessagerman;
    }

    public void setAssit(double assit) {
        this.assit = assit;
    }

    public void setCostForTrans(double costForTrans) {
        this.costForTrans = costForTrans;
    }
    public void setCostForXie(double costForXie) {
        this.costForXie = costForXie;
    }

    public void setMoneyAll(double moneyAll) {
        this.moneyAll = moneyAll;
    }

    public void setMoneyForTrans(double moneyForTrans) {
        this.moneyForTrans = moneyForTrans;
    }

    public void setNumOfSend(Integer numOfSend) {
        this.numOfSend = numOfSend;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTimeOfSendFood(double timeOfSendFood) {
        this.timeOfSendFood = timeOfSendFood;
    }

    public void setMoneyGetPre(double moneyGetPre) {
        this.moneyGetPre = moneyGetPre;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public void setWeightOfSend(double weightOfSend) {
        this.weightOfSend = weightOfSend;
    }

    public double getTimeOfSendFood() {
        return timeOfSendFood;
    }

    public double getWeightOfSend() {
        return weightOfSend;
    }

    public Integer getNumOfSend() {
        return numOfSend;
    }

    public double getPrice() {
        return price;
    }

    public double getAssit() {
        return assit;
    }

    public double getMoneyAll() {
        return moneyAll;
    }

    public double getCostForTrans() {
        return costForTrans;
    }

    public double getCostForXie() {
        return costForXie;
    }

    public double getMoneyForTrans() {
        return moneyForTrans;
    }

    public String getAddressWhere() {
        return addressWhere;
    }

    public double getMoneyGetPre() {
        return moneyGetPre;
    }

    public String getInfoOfMessagerman() {
        return infoOfMessagerman;
    }

    public String getSituation() {
        return situation;
    }

    //计算预估利润并与真实利润进行检验的函数
    public boolean isgetCorrectPredecisionMoney()
    {
        double moneyCal= this.weightOfSend*this.price+this.moneyForTrans-this.assit
                -this.costForTrans-costForXie;

        if(moneyCal==moneyGetPre)
        {
            return true;
        }
        else{
            return false;
        }
    }



}
