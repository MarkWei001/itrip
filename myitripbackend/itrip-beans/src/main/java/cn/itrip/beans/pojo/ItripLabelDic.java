package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_label_dic 对应的实体类
*/
public class ItripLabelDic implements Serializable {
    private     Long    id;
    private     String    name;
    private     String    value;
    private     String    description;
    private     Long    parentid;
    private     String    pic;
    private     Date    creationdate;
    private     Long    createdby;
    private     Date    modifydate;
    private     Long    modifiedby;

    public  ItripLabelDic(){ }

    public void setId (Long  id){
        this.id = id;
    }

    public  Long getId(){
        return this.id;
    }
    public void setName (String  name){
        this.name = name;
    }

    public  String getName(){
        return this.name;
    }
    public void setValue (String  value){
        this.value = value;
    }

    public  String getValue(){
        return this.value;
    }
    public void setDescription (String  description){
        this.description = description;
    }

    public  String getDescription(){
        return this.description;
    }
    public void setParentid (Long  parentid){
        this.parentid = parentid;
    }

    public  Long getParentid(){
        return this.parentid;
    }
    public void setPic (String  pic){
        this.pic = pic;
    }

    public  String getPic(){
        return this.pic;
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
        return "ItripLabelDic[" +
                "id = " + this.id + ", " + 
                "name = " + this.name + ", " + 
                "value = " + this.value + ", " + 
                "description = " + this.description + ", " + 
                "parentid = " + this.parentid + ", " + 
                "pic = " + this.pic + ", " + 
                "creationdate = " + this.creationdate + ", " + 
                "createdby = " + this.createdby + ", " + 
                "modifydate = " + this.modifydate + ", " + 
                "modifiedby = " + this.modifiedby + 
            "]";
    }
}
