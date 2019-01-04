package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_hotel_room 对应的实体类
*/
public class ItripHotelRoom implements Serializable {
    private     Long    id;
    private     Long    hotelid;
    private     String    roomtitle;
    private     Double    roomprice;
    private     Long    roombedtypeid;
    private     Integer    ishavingbreakfast;
    private     Integer    paytype;
    private     Double    satisfaction;
    private     Integer    isbook;
    private     Integer    iscancel;
    private     Integer    istimelyresponse;
    private     Date    creationdate;
    private     Long    createdby;
    private     Date    modifydate;
    private     Long    modifiedby;

    public  ItripHotelRoom(){ }

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
    public void setRoomtitle (String  roomtitle){
        this.roomtitle = roomtitle;
    }

    public  String getRoomtitle(){
        return this.roomtitle;
    }
    public void setRoomprice (Double  roomprice){
        this.roomprice = roomprice;
    }

    public  Double getRoomprice(){
        return this.roomprice;
    }
    public void setRoombedtypeid (Long  roombedtypeid){
        this.roombedtypeid = roombedtypeid;
    }

    public  Long getRoombedtypeid(){
        return this.roombedtypeid;
    }
    public void setIshavingbreakfast (Integer  ishavingbreakfast){
        this.ishavingbreakfast = ishavingbreakfast;
    }

    public  Integer getIshavingbreakfast(){
        return this.ishavingbreakfast;
    }
    public void setPaytype (Integer  paytype){
        this.paytype = paytype;
    }

    public  Integer getPaytype(){
        return this.paytype;
    }
    public void setSatisfaction (Double  satisfaction){
        this.satisfaction = satisfaction;
    }

    public  Double getSatisfaction(){
        return this.satisfaction;
    }
    public void setIsbook (Integer  isbook){
        this.isbook = isbook;
    }

    public  Integer getIsbook(){
        return this.isbook;
    }
    public void setIscancel (Integer  iscancel){
        this.iscancel = iscancel;
    }

    public  Integer getIscancel(){
        return this.iscancel;
    }
    public void setIstimelyresponse (Integer  istimelyresponse){
        this.istimelyresponse = istimelyresponse;
    }

    public  Integer getIstimelyresponse(){
        return this.istimelyresponse;
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
        return "ItripHotelRoom[" +
                "id = " + this.id + ", " + 
                "hotelid = " + this.hotelid + ", " + 
                "roomtitle = " + this.roomtitle + ", " + 
                "roomprice = " + this.roomprice + ", " + 
                "roombedtypeid = " + this.roombedtypeid + ", " + 
                "ishavingbreakfast = " + this.ishavingbreakfast + ", " + 
                "paytype = " + this.paytype + ", " + 
                "satisfaction = " + this.satisfaction + ", " + 
                "isbook = " + this.isbook + ", " + 
                "iscancel = " + this.iscancel + ", " + 
                "istimelyresponse = " + this.istimelyresponse + ", " + 
                "creationdate = " + this.creationdate + ", " + 
                "createdby = " + this.createdby + ", " + 
                "modifydate = " + this.modifydate + ", " + 
                "modifiedby = " + this.modifiedby + 
            "]";
    }
}
