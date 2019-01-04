package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_product_store 对应的实体类
*/
public class ItripProductStore implements Serializable {
    private     Long    id;
    private     Integer    producttype;
    private     Long    productid;
    private     Integer    store;
    private     Date    creationdate;
    private     Long    createdby;
    private     Date    modifydate;
    private     Long    modifiedby;

    public  ItripProductStore(){ }

    public void setId (Long  id){
        this.id = id;
    }

    public  Long getId(){
        return this.id;
    }
    public void setProducttype (Integer  producttype){
        this.producttype = producttype;
    }

    public  Integer getProducttype(){
        return this.producttype;
    }
    public void setProductid (Long  productid){
        this.productid = productid;
    }

    public  Long getProductid(){
        return this.productid;
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
        return "ItripProductStore[" +
                "id = " + this.id + ", " + 
                "producttype = " + this.producttype + ", " + 
                "productid = " + this.productid + ", " + 
                "store = " + this.store + ", " + 
                "creationdate = " + this.creationdate + ", " + 
                "createdby = " + this.createdby + ", " + 
                "modifydate = " + this.modifydate + ", " + 
                "modifiedby = " + this.modifiedby + 
            "]";
    }
}
