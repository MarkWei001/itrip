package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_hotel_trading_area 对应的实体类
*/
public class ItripHotelTradingArea implements Serializable {
    private     Long    id;
    private     Long    hotelid;
    private     Long    areaid;
    private     Date    creationdate;
    private     Long    createdby;
    private     Date    modifydate;
    private     Long    modifiedby;

    public  ItripHotelTradingArea(){ }

    public void setId (Long  id){
        this.id = id;
    }

    public  Long getId(){
        return this.id;
    }
    public void setHotelid (Long  hotelid){
        this.hotelid = hotelid;
    }

    public  Long getHotelid(){
        return this.hotelid;
    }
    public void setAreaid (Long  areaid){
        this.areaid = areaid;
    }

    public  Long getAreaid(){
        return this.areaid;
    }
    public void setCreationdate (Date  creationdate){
        this.creationdate = creationdate;
    }

    public  Date getCreationdate(){
        return this.creationdate;
    }
    public void setCreatedby (Long  createdby){
        this.createdby = createdby;
    }

    public  Long getCreatedby(){
        return this.createdby;
    }
    public void setModifydate (Date  modifydate){
        this.modifydate = modifydate;
    }

    public  Date getModifydate(){
        return this.modifydate;
    }
    public void setModifiedby (Long  modifiedby){
        this.modifiedby = modifiedby;
    }

    public  Long getModifiedby(){
        return this.modifiedby;
    }

    @Override
    public  String  toString(){
        return "ItripHotelTradingArea[" +
                "id = " + this.id + ", " + 
                "hotelid = " + this.hotelid + ", " + 
                "areaid = " + this.areaid + ", " + 
                "creationdate = " + this.creationdate + ", " + 
                "createdby = " + this.createdby + ", " + 
                "modifydate = " + this.modifydate + ", " + 
                "modifiedby = " + this.modifiedby + 
            "]";
    }
}
