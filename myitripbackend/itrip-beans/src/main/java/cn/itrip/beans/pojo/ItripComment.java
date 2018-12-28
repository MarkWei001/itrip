package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_comment 对应的实体类
*/
public class ItripComment implements Serializable {
    private     Long    id;
    private     Long    hotelid;
    private     Long    productid;
    private     Long    orderid;
    private     Integer    producttype;
    private     String    content;
    private     Long    userid;
    private     Integer    ishavingimg;
    private     Integer    positionscore;
    private     Integer    facilitiesscore;
    private     Integer    servicescore;
    private     Integer    hygienescore;
    private     Integer    score;
    private     Long    tripmode;
    private     Integer    isok;
    private     Date    creationdate;
    private     Long    createdby;
    private     Date    modifydate;
    private     Long    modifiedby;

    public  ItripComment(){ }

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
    public void setProductid (Long  productid){
        this.productid = productid;
    }

    public  Long getProductid(){
        return this.productid;
    }
    public void setOrderid (Long  orderid){
        this.orderid = orderid;
    }

    public  Long getOrderid(){
        return this.orderid;
    }
    public void setProducttype (Integer  producttype){
        this.producttype = producttype;
    }

    public  Integer getProducttype(){
        return this.producttype;
    }
    public void setContent (String  content){
        this.content = content;
    }

    public  String getContent(){
        return this.content;
    }
    public void setUserid (Long  userid){
        this.userid = userid;
    }

    public  Long getUserid(){
        return this.userid;
    }
    public void setIshavingimg (Integer  ishavingimg){
        this.ishavingimg = ishavingimg;
    }

    public  Integer getIshavingimg(){
        return this.ishavingimg;
    }
    public void setPositionscore (Integer  positionscore){
        this.positionscore = positionscore;
    }

    public  Integer getPositionscore(){
        return this.positionscore;
    }
    public void setFacilitiesscore (Integer  facilitiesscore){
        this.facilitiesscore = facilitiesscore;
    }

    public  Integer getFacilitiesscore(){
        return this.facilitiesscore;
    }
    public void setServicescore (Integer  servicescore){
        this.servicescore = servicescore;
    }

    public  Integer getServicescore(){
        return this.servicescore;
    }
    public void setHygienescore (Integer  hygienescore){
        this.hygienescore = hygienescore;
    }

    public  Integer getHygienescore(){
        return this.hygienescore;
    }
    public void setScore (Integer  score){
        this.score = score;
    }

    public  Integer getScore(){
        return this.score;
    }
    public void setTripmode (Long  tripmode){
        this.tripmode = tripmode;
    }

    public  Long getTripmode(){
        return this.tripmode;
    }
    public void setIsok (Integer  isok){
        this.isok = isok;
    }

    public  Integer getIsok(){
        return this.isok;
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
        return "ItripComment[" +
                "id = " + this.id + ", " + 
                "hotelid = " + this.hotelid + ", " + 
                "productid = " + this.productid + ", " + 
                "orderid = " + this.orderid + ", " + 
                "producttype = " + this.producttype + ", " + 
                "content = " + this.content + ", " + 
                "userid = " + this.userid + ", " + 
                "ishavingimg = " + this.ishavingimg + ", " + 
                "positionscore = " + this.positionscore + ", " + 
                "facilitiesscore = " + this.facilitiesscore + ", " + 
                "servicescore = " + this.servicescore + ", " + 
                "hygienescore = " + this.hygienescore + ", " + 
                "score = " + this.score + ", " + 
                "tripmode = " + this.tripmode + ", " + 
                "isok = " + this.isok + ", " + 
                "creationdate = " + this.creationdate + ", " + 
                "createdby = " + this.createdby + ", " + 
                "modifydate = " + this.modifydate + ", " + 
                "modifiedby = " + this.modifiedby + 
            "]";
    }
}
