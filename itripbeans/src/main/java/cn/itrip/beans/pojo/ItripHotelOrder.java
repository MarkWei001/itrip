package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_hotel_order 对应的实体类
*/
public class ItripHotelOrder implements Serializable {
    private     Long    id;
    private     Long    userid;
    private     Integer    ordertype;
    private     String    orderno;
    private     String    tradeno;
    private     Long    hotelid;
    private     String    hotelname;
    private     Long    roomid;
    private     Integer    count;
    private     Integer    bookingdays;
    private     Date    checkindate;
    private     Date    checkoutdate;
    private     Integer    orderstatus;
    private     Double    payamount;
    private     Integer    paytype;
    private     String    noticephone;
    private     String    noticeemail;
    private     String    specialrequirement;
    private     Integer    isneedinvoice;
    private     Integer    invoicetype;
    private     String    invoicehead;
    private     String    linkusername;
    private     Integer    booktype;
    private     Date    creationdate;
    private     Long    createdby;
    private     Date    modifydate;
    private     Long    modifiedby;

    public  ItripHotelOrder(){ }

    public void setId (Long  id){
        this.id = id;
    }

    public  Long getId(){
        return this.id;
    }
    public void setUserid (Long  userid){
        this.userid = userid;
    }

    public  Long getUserid(){
        return this.userid;
    }
    public void setOrdertype (Integer  ordertype){
        this.ordertype = ordertype;
    }

    public  Integer getOrdertype(){
        return this.ordertype;
    }
    public void setOrderno (String  orderno){
        this.orderno = orderno;
    }

    public  String getOrderno(){
        return this.orderno;
    }
    public void setTradeno (String  tradeno){
        this.tradeno = tradeno;
    }

    public  String getTradeno(){
        return this.tradeno;
    }
    public void setHotelid (Long  hotelid){
        this.hotelid = hotelid;
    }

    public  Long getHotelid(){
        return this.hotelid;
    }
    public void setHotelname (String  hotelname){
        this.hotelname = hotelname;
    }

    public  String getHotelname(){
        return this.hotelname;
    }
    public void setRoomid (Long  roomid){
        this.roomid = roomid;
    }

    public  Long getRoomid(){
        return this.roomid;
    }
    public void setCount (Integer  count){
        this.count = count;
    }

    public  Integer getCount(){
        return this.count;
    }
    public void setBookingdays (Integer  bookingdays){
        this.bookingdays = bookingdays;
    }

    public  Integer getBookingdays(){
        return this.bookingdays;
    }
    public void setCheckindate (Date  checkindate){
        this.checkindate = checkindate;
    }

    public  Date getCheckindate(){
        return this.checkindate;
    }
    public void setCheckoutdate (Date  checkoutdate){
        this.checkoutdate = checkoutdate;
    }

    public  Date getCheckoutdate(){
        return this.checkoutdate;
    }
    public void setOrderstatus (Integer  orderstatus){
        this.orderstatus = orderstatus;
    }

    public  Integer getOrderstatus(){
        return this.orderstatus;
    }
    public void setPayamount (Double  payamount){
        this.payamount = payamount;
    }

    public  Double getPayamount(){
        return this.payamount;
    }
    public void setPaytype (Integer  paytype){
        this.paytype = paytype;
    }

    public  Integer getPaytype(){
        return this.paytype;
    }
    public void setNoticephone (String  noticephone){
        this.noticephone = noticephone;
    }

    public  String getNoticephone(){
        return this.noticephone;
    }
    public void setNoticeemail (String  noticeemail){
        this.noticeemail = noticeemail;
    }

    public  String getNoticeemail(){
        return this.noticeemail;
    }
    public void setSpecialrequirement (String  specialrequirement){
        this.specialrequirement = specialrequirement;
    }

    public  String getSpecialrequirement(){
        return this.specialrequirement;
    }
    public void setIsneedinvoice (Integer  isneedinvoice){
        this.isneedinvoice = isneedinvoice;
    }

    public  Integer getIsneedinvoice(){
        return this.isneedinvoice;
    }
    public void setInvoicetype (Integer  invoicetype){
        this.invoicetype = invoicetype;
    }

    public  Integer getInvoicetype(){
        return this.invoicetype;
    }
    public void setInvoicehead (String  invoicehead){
        this.invoicehead = invoicehead;
    }

    public  String getInvoicehead(){
        return this.invoicehead;
    }
    public void setLinkusername (String  linkusername){
        this.linkusername = linkusername;
    }

    public  String getLinkusername(){
        return this.linkusername;
    }
    public void setBooktype (Integer  booktype){
        this.booktype = booktype;
    }

    public  Integer getBooktype(){
        return this.booktype;
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
        return "ItripHotelOrder[" +
                "id = " + this.id + ", " + 
                "userid = " + this.userid + ", " + 
                "ordertype = " + this.ordertype + ", " + 
                "orderno = " + this.orderno + ", " + 
                "tradeno = " + this.tradeno + ", " + 
                "hotelid = " + this.hotelid + ", " + 
                "hotelname = " + this.hotelname + ", " + 
                "roomid = " + this.roomid + ", " + 
                "count = " + this.count + ", " + 
                "bookingdays = " + this.bookingdays + ", " + 
                "checkindate = " + this.checkindate + ", " + 
                "checkoutdate = " + this.checkoutdate + ", " + 
                "orderstatus = " + this.orderstatus + ", " + 
                "payamount = " + this.payamount + ", " + 
                "paytype = " + this.paytype + ", " + 
                "noticephone = " + this.noticephone + ", " + 
                "noticeemail = " + this.noticeemail + ", " + 
                "specialrequirement = " + this.specialrequirement + ", " + 
                "isneedinvoice = " + this.isneedinvoice + ", " + 
                "invoicetype = " + this.invoicetype + ", " + 
                "invoicehead = " + this.invoicehead + ", " + 
                "linkusername = " + this.linkusername + ", " + 
                "booktype = " + this.booktype + ", " + 
                "creationdate = " + this.creationdate + ", " + 
                "createdby = " + this.createdby + ", " + 
                "modifydate = " + this.modifydate + ", " + 
                "modifiedby = " + this.modifiedby + 
            "]";
    }
}
