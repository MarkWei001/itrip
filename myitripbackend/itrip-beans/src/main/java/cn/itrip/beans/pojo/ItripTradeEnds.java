package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_trade_ends 对应的实体类
*/
public class ItripTradeEnds implements Serializable {
    private     Long    id;
    private     String    orderno;
    private     Byte    flag;

    public  ItripTradeEnds(){ }

    public void setId (Long  id){
        this.id = id;
    }

    public  Long getId(){
        return this.id;
    }
    public void setOrderno (String  orderno){
        this.orderno = orderno;
    }

    public  String getOrderno(){
        return this.orderno;
    }
    public void setFlag (Byte  flag){
        this.flag = flag;
    }

    public  Byte getFlag(){
        return this.flag;
    }

    @Override
    public  String  toString(){
        return "ItripTradeEnds[" +
                "id = " + this.id + ", " + 
                "orderno = " + this.orderno + ", " + 
                "flag = " + this.flag + 
            "]";
    }
}
