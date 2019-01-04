package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_user 对应的实体类
*/
public class ItripUser implements Serializable {
    private     Long    id;
    private     String    usercode;
    private     String    userpassword;
    private     Integer    usertype;
    private     Long    flatid;
    private     String    username;
    private     String    wechat;
    private     String    qq;
    private     String    weibo;
    private     String    baidu;
    private     Date    creationdate;
    private     Long    createdby;
    private     Date    modifydate;
    private     Long    modifiedby;
    private     Integer    activated;

    public  ItripUser(){ }

    public void setId (Long  id){
        this.id = id;
    }

    public  Long getId(){
        return this.id;
    }
    public void setUsercode (String  usercode){
        this.usercode = usercode;
    }

    public  String getUsercode(){
        return this.usercode;
    }
    public void setUserpassword (String  userpassword){
        this.userpassword = userpassword;
    }

    public  String getUserpassword(){
        return this.userpassword;
    }
    public void setUsertype (Integer  usertype){
        this.usertype = usertype;
    }

    public  Integer getUsertype(){
        return this.usertype;
    }
    public void setFlatid (Long  flatid){
        this.flatid = flatid;
    }

    public  Long getFlatid(){
        return this.flatid;
    }
    public void setUsername (String  username){
        this.username = username;
    }

    public  String getUsername(){
        return this.username;
    }
    public void setWechat (String  wechat){
        this.wechat = wechat;
    }

    public  String getWechat(){
        return this.wechat;
    }
    public void setQq (String  qq){
        this.qq = qq;
    }

    public  String getQq(){
        return this.qq;
    }
    public void setWeibo (String  weibo){
        this.weibo = weibo;
    }

    public  String getWeibo(){
        return this.weibo;
    }
    public void setBaidu (String  baidu){
        this.baidu = baidu;
    }

    public  String getBaidu(){
        return this.baidu;
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
    public void setActivated (Integer  activated){
        this.activated = activated;
    }

    public  Integer getActivated(){
        return this.activated;
    }

    @Override
    public  String  toString(){
        return "ItripUser[" +
                "id = " + this.id + ", " + 
                "usercode = " + this.usercode + ", " + 
                "userpassword = " + this.userpassword + ", " + 
                "usertype = " + this.usertype + ", " + 
                "flatid = " + this.flatid + ", " + 
                "username = " + this.username + ", " + 
                "wechat = " + this.wechat + ", " + 
                "qq = " + this.qq + ", " + 
                "weibo = " + this.weibo + ", " + 
                "baidu = " + this.baidu + ", " + 
                "creationdate = " + this.creationdate + ", " + 
                "createdby = " + this.createdby + ", " + 
                "modifydate = " + this.modifydate + ", " + 
                "modifiedby = " + this.modifiedby + ", " + 
                "activated = " + this.activated + 
            "]";
    }
}
