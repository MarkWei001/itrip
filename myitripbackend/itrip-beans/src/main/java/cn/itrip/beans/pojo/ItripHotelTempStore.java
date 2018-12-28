package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_hotel_temp_store 对应的实体类
*/
public class ItripHotelTempStore implements Serializable {
    private     Long    id;
    private     Integer    hotelid;
    private     Long    roomid;
    private     Date    recorddate;
    private     Integer    store;
    private     Date    creationdate;
    private     Long    createdby;
    private     Date    modifydate;
    private     Long    modifiedby;

    public  ItripHotelTempStore(){ }

    public void setId (Long  id){
        this.id = id;
    }

    public  Long getId(){
        return this.id;
    }
    public void setHotelid (Integer  hotelid){
        this.hotelid = hotelid;
    }

    public  Integer getHotelid(){
        return this.hotelid;
    }
    public void setRoomid (Long  roomid){
        this.roomid = roomid;
    }

    public  Long getRoomid(){
        return this.roomid;
    }
    public void setRecorddate (Date  recorddate){
        this.recorddate = recorddate;
    }

    public  Date getRecorddate(){
        return this.recorddate;
    }
    public void setStore (Integer  store){
        this.store = store;
    }

    public  Integer getStore(){
        return this.store;
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
        return "ItripHotelTempStore[" +
                "id = " + this.id + ", " + 
                "hotelid = " + this.hotelid + ", " + 
                "roomid = " + this.roomid + ", " + 
                "recorddate = " + this.recorddate + ", " + 
                "store = " + this.store + ", " + 
                "creationdate = " + this.creationdate + ", " + 
                "createdby = " + this.createdby + ", " + 
                "modifydate = " + this.modifydate + ", " + 
                "modifiedby = " + this.modifiedby + 
            "]";
    }
}
