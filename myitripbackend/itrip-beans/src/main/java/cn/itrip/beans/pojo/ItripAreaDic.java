package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_area_dic 对应的实体类
*/
public class ItripAreaDic implements Serializable {
    private     Long    id;
    private     String    name;
    private     String    areano;
    private     Long    parent;
    private     Integer    isactivated;
    private     Integer    istradingarea;
    private     Integer    ishot;
    private     Integer    level;
    private     Integer    ischina;
    private     String    pinyin;
    private     Date    creationdate;
    private     Long    createdby;
    private     Date    modifydate;
    private     Long    modifiedby;

    public  ItripAreaDic(){ }

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
    public void setAreano (String  areano){
        this.areano = areano;
    }

    public  String getAreano(){
        return this.areano;
    }
    public void setParent (Long  parent){
        this.parent = parent;
    }

    public  Long getParent(){
        return this.parent;
    }
    public void setIsactivated (Integer  isactivated){
        this.isactivated = isactivated;
    }

    public  Integer getIsactivated(){
        return this.isactivated;
    }
    public void setIstradingarea (Integer  istradingarea){
        this.istradingarea = istradingarea;
    }

    public  Integer getIstradingarea(){
        return this.istradingarea;
    }
    public void setIshot (Integer  ishot){
        this.ishot = ishot;
    }

    public  Integer getIshot(){
        return this.ishot;
    }
    public void setLevel (Integer  level){
        this.level = level;
    }

    public  Integer getLevel(){
        return this.level;
    }
    public void setIschina (Integer  ischina){
        this.ischina = ischina;
    }

    public  Integer getIschina(){
        return this.ischina;
    }
    public void setPinyin (String  pinyin){
        this.pinyin = pinyin;
    }

    public  String getPinyin(){
        return this.pinyin;
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
        return "ItripAreaDic[" +
                "id = " + this.id + ", " + 
                "name = " + this.name + ", " + 
                "areano = " + this.areano + ", " + 
                "parent = " + this.parent + ", " + 
                "isactivated = " + this.isactivated + ", " + 
                "istradingarea = " + this.istradingarea + ", " + 
                "ishot = " + this.ishot + ", " + 
                "level = " + this.level + ", " + 
                "ischina = " + this.ischina + ", " + 
                "pinyin = " + this.pinyin + ", " + 
                "creationdate = " + this.creationdate + ", " + 
                "createdby = " + this.createdby + ", " + 
                "modifydate = " + this.modifydate + ", " + 
                "modifiedby = " + this.modifiedby + 
            "]";
    }
}
