package produce;

import data.zhongtie.ChuJian;
import data.zhongtie.JinJian;
import data.zhongtie.PaiSong;
import data.zhongtie.ShouJian;

import java.lang.annotation.Target;

//工人工作流程逻辑
public class WorkerProcedure {


    //派件流程.此为伪代码,不能运行
    public PaiSong work_PaiJian(){ //返回一个派件类型的电子报表






      return Table;
    }

    //收件流程
    public ShouJian work_ShouJian(){

        if isHimSelf||otherMan
        {
            核实身份;
            return 收件单;
        }
        else
        {
            拒绝收货;
            收回快件;
            return 特殊-收件单;
        }

    }

    //进件流程
    public JinJian work_JinJian(){
        if K
        {;}

        return Table;
    }

    //出件流程
    public ChuJian work_ChuJian(){
        ;;;
        return Table;
    }


}
