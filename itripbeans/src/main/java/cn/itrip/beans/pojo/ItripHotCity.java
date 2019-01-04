package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_hot_city 对应的实体类
*/
public class ItripHotCity implements Serializable {
    private     String    city;
    private     Integer    rank;

    public  ItripHotCity(){ }

    public void setCity (String  city){
        this.city = city;
    }

    public  String getCity(){
        return this.city;
    }
    public void setRank (Integer  rank){
        this.rank = rank;
    }

    public  Integer getRank(){
        return this.rank;
    }

    @Override
    public  String  toString(){
        return "ItripHotCity[" +
                "city = " + this.city + ", " + 
                "rank = " + this.rank + 
            "]";
    }
}
