package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_order_link_user 对应的实体类
*/
public class ItripOrderLinkUser implements Serializable {
    private     Long    id;
    private     Long    orderid;
    private     Long    linkuserid;
    private     String    linkusername;
    private     Date    creationdate;
    private     Long    createdby;
    private     Date    modifydate;
    private     Long    modifiedby;

    public  ItripOrderLinkUser(){ }

    public void setId (Long  id){
        this.id = id;
    }

    public  Long getId(){
        return this.id;
    }
    public void setOrderid (Long  orderid){
        this.orderid = orderid;
    }

    public  Long getOrderid(){
        return this.orderid;
    }
    public void setLinkuserid (Long  linkuserid){
        this.linkuserid = linkuserid;
    }

    public  Long getLinkuserid(){
        return this.linkuserid;
    }
    public void setLinkusername (String  linkusername){
        this.linkusername = linkusername;
    }

    public  String getLinkusername(){
        return this.linkusername;
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
        return "ItripOrderLinkUser[" +
                "id = " + this.id + ", " + 
                "orderid = " + this.orderid + ", " + 
                "linkuserid = " + this.linkuserid + ", " + 
                "linkusername = " + this.linkusername + ", " + 
                "creationdate = " + this.creationdate + ", " + 
                "createdby = " + this.createdby + ", " + 
                "modifydate = " + this.modifydate + ", " + 
                "modifiedby = " + this.modifiedby + 
            "]";
    }
}
