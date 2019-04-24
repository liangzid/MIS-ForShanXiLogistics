import data.zhongtie.LiangYouShouZhi;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<LiangYouShouZhi> testObject;
        initiralize(testObject);//伪代码,该函数未编写
        for(LiangYouShouZhi perObject : testObject)
        {
            if(! perObject.isgetCorrectPredecisionMoney())
            {
                System.out.println("错误!该环节黑箱测试未通过");
                break;
            }

        }













        System.out.println("Hello World!");
    }











}
