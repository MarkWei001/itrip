package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_hotel 对应的实体类
*/
public class ItripHotel implements Serializable {
    private     Long    id;
    private     String    hotelname;
    private     Long    countryid;
    private     Long    provinceid;
    private     Long    cityid;
    private     String    address;
    private     String    details;
    private     String    facilities;
    private     String    hotelpolicy;
    private     Integer    hoteltype;
    private     Integer    hotellevel;
    private     Integer    isgrouppurchase;
    private     String    redundantcityname;
    private     String    redundantprovincename;
    private     String    redundantcountryname;
    private     Integer    redundanthotelstore;
    private     Date    creationdate;
    private     Long    createdby;
    private     Date    modifydate;
    private     Long    modifiedby;

    public  ItripHotel(){ }

    public void setId (Long  id){
        this.id = id;
    }

    public  Long getId(){
        return this.id;
    }
    public void setHotelname (String  hotelname){
        this.hotelname = hotelname;
    }

    public  String getHotelname(){
        return this.hotelname;
    }
    public void setCountryid (Long  countryid){
        this.countryid = countryid;
    }

    public  Long getCountryid(){
        return this.countryid;
    }
    public void setProvinceid (Long  provinceid){
        this.provinceid = provinceid;
    }

    public  Long getProvinceid(){
        return this.provinceid;
    }
    public void setCityid (Long  cityid){
        this.cityid = cityid;
    }

    public  Long getCityid(){
        return this.cityid;
    }
    public void setAddress (String  address){
        this.address = address;
    }

    public  String getAddress(){
        return this.address;
    }
    public void setDetails (String  details){
        this.details = details;
    }

    public  String getDetails(){
        return this.details;
    }
    public void setFacilities (String  facilities){
        this.facilities = facilities;
    }

    public  String getFacilities(){
        return this.facilities;
    }
    public void setHotelpolicy (String  hotelpolicy){
        this.hotelpolicy = hotelpolicy;
    }

    public  String getHotelpolicy(){
        return this.hotelpolicy;
    }
    public void setHoteltype (Integer  hoteltype){
        this.hoteltype = hoteltype;
    }

    public  Integer getHoteltype(){
        return this.hoteltype;
    }
    public void setHotellevel (Integer  hotellevel){
        this.hotellevel = hotellevel;
    }

    public  Integer getHotellevel(){
        return this.hotellevel;
    }
    public void setIsgrouppurchase (Integer  isgrouppurchase){
        this.isgrouppurchase = isgrouppurchase;
    }

    public  Integer getIsgrouppurchase(){
        return this.isgrouppurchase;
    }
    public void setRedundantcityname (String  redundantcityname){
        this.redundantcityname = redundantcityname;
    }

    public  String getRedundantcityname(){
        return this.redundantcityname;
    }
    public void setRedundantprovincename (String  redundantprovincename){
        this.redundantprovincename = redundantprovincename;
    }

    public  String getRedundantprovincename(){
        return this.redundantprovincename;
    }
    public void setRedundantcountryname (String  redundantcountryname){
        this.redundantcountryname = redundantcountryname;
    }

    public  String getRedundantcountryname(){
        return this.redundantcountryname;
    }
    public void setRedundanthotelstore (Integer  redundanthotelstore){
        this.redundanthotelstore = redundanthotelstore;
    }

    public  Integer getRedundanthotelstore(){
        return this.redundanthotelstore;
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
        return "ItripHotel[" +
                "id = " + this.id + ", " + 
                "hotelname = " + this.hotelname + ", " + 
                "countryid = " + this.countryid + ", " + 
                "provinceid = " + this.provinceid + ", " + 
                "cityid = " + this.cityid + ", " + 
                "address = " + this.address + ", " + 
                "details = " + this.details + ", " + 
                "facilities = " + this.facilities + ", " + 
                "hotelpolicy = " + this.hotelpolicy + ", " + 
                "hoteltype = " + this.hoteltype + ", " + 
                "hotellevel = " + this.hotellevel + ", " + 
                "isgrouppurchase = " + this.isgrouppurchase + ", " + 
                "redundantcityname = " + this.redundantcityname + ", " + 
                "redundantprovincename = " + this.redundantprovincename + ", " + 
                "redundantcountryname = " + this.redundantcountryname + ", " + 
                "redundanthotelstore = " + this.redundanthotelstore + ", " + 
                "creationdate = " + this.creationdate + ", " + 
                "createdby = " + this.createdby + ", " + 
                "modifydate = " + this.modifydate + ", " + 
                "modifiedby = " + this.modifiedby + 
            "]";
    }
}
