package produce;

import data.zhongtie.ReceiveTable;

public class GongYingLian {

    public ReceiveTable Receive(客户打款信)
    {
        if(成功根据合同完成估值)
        {
            接受用户;
            生成出货单;
        }
        else
        {
            生成空出货单;
        }

        将出货单传送至服务器端进行月积累;
        将出货单传送至客服给用户;
        return 出货单;

    }

    public void readAndRun(ReceiveTable table,boolean KeHuQueRen)
    {
        if(KeHuQueRen)
        {
            根据出货单审核装卸费;
            出货;
            向客户发送回执;
        }
        else
        {
            删除出货单;
        }

    }














}
