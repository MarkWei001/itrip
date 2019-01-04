package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_image 对应的实体类
*/
public class ItripImage implements Serializable {
    private     Long    id;
    private     String    type;
    private     Long    targetid;
    private     Integer    position;
    private     String    imgurl;
    private     Date    creationdate;
    private     Long    createdby;
    private     Date    modifydate;
    private     Long    modifiedby;

    public  ItripImage(){ }

    public void setId (Long  id){
        this.id = id;
    }

    public  Long getId(){
        return this.id;
    }
    public void setType (String  type){
        this.type = type;
    }

    public  String getType(){
        return this.type;
    }
    public void setTargetid (Long  targetid){
        this.targetid = targetid;
    }

    public  Long getTargetid(){
        return this.targetid;
    }
    public void setPosition (Integer  position){
        this.position = position;
    }

    public  Integer getPosition(){
        return this.position;
    }
    public void setImgurl (String  imgurl){
        this.imgurl = imgurl;
    }

    public  String getImgurl(){
        return this.imgurl;
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
        return "ItripImage[" +
                "id = " + this.id + ", " + 
                "type = " + this.type + ", " + 
                "targetid = " + this.targetid + ", " + 
                "position = " + this.position + ", " + 
                "imgurl = " + this.imgurl + ", " + 
                "creationdate = " + this.creationdate + ", " + 
                "createdby = " + this.createdby + ", " + 
                "modifydate = " + this.modifydate + ", " + 
                "modifiedby = " + this.modifiedby + 
            "]";
    }
}
