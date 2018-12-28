package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_hotel_extend_property 对应的实体类
*/
public class ItripHotelExtendProperty implements Serializable {
    private     Long    id;
    private     Long    hotelid;
    private     Long    extendpropertyid;
    private     Date    creationdate;
    private     Long    createdby;
    private     Date    modifydate;
    private     Long    modifiedby;

    public  ItripHotelExtendProperty(){ }

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
    public void setExtendpropertyid (Long  extendpropertyid){
        this.extendpropertyid = extendpropertyid;
    }

    public  Long getExtendpropertyid(){
        return this.extendpropertyid;
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
        return "ItripHotelExtendProperty[" +
                "id = " + this.id + ", " + 
                "hotelid = " + this.hotelid + ", " + 
                "extendpropertyid = " + this.extendpropertyid + ", " + 
                "creationdate = " + this.creationdate + ", " + 
                "createdby = " + this.createdby + ", " + 
                "modifydate = " + this.modifydate + ", " + 
                "modifiedby = " + this.modifiedby + 
            "]";
    }
}
