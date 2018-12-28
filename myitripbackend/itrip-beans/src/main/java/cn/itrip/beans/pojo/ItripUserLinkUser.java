package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_user_link_user 对应的实体类
*/
public class ItripUserLinkUser implements Serializable {
    private     Long    id;
    private     String    linkusername;
    private     String    linkidcard;
    private     String    linkphone;
    private     Integer    userid;
    private     Date    creationdate;
    private     Long    createdby;
    private     Date    modifydate;
    private     Long    modifiedby;
    private     Integer    linkidcardtype;

    public  ItripUserLinkUser(){ }

    public void setId (Long  id){
        this.id = id;
    }

    public  Long getId(){
        return this.id;
    }
    public void setLinkusername (String  linkusername){
        this.linkusername = linkusername;
    }

    public  String getLinkusername(){
        return this.linkusername;
    }
    public void setLinkidcard (String  linkidcard){
        this.linkidcard = linkidcard;
    }

    public  String getLinkidcard(){
        return this.linkidcard;
    }
    public void setLinkphone (String  linkphone){
        this.linkphone = linkphone;
    }

    public  String getLinkphone(){
        return this.linkphone;
    }
    public void setUserid (Integer  userid){
        this.userid = userid;
    }

    public  Integer getUserid(){
        return this.userid;
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
    public void setLinkidcardtype (Integer  linkidcardtype){
        this.linkidcardtype = linkidcardtype;
    }

    public  Integer getLinkidcardtype(){
        return this.linkidcardtype;
    }

    @Override
    public  String  toString(){
        return "ItripUserLinkUser[" +
                "id = " + this.id + ", " + 
                "linkusername = " + this.linkusername + ", " + 
                "linkidcard = " + this.linkidcard + ", " + 
                "linkphone = " + this.linkphone + ", " + 
                "userid = " + this.userid + ", " + 
                "creationdate = " + this.creationdate + ", " + 
                "createdby = " + this.createdby + ", " + 
                "modifydate = " + this.modifydate + ", " + 
                "modifiedby = " + this.modifiedby + ", " + 
                "linkidcardtype = " + this.linkidcardtype + 
            "]";
    }
}
