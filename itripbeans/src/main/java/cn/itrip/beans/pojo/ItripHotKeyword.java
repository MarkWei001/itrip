package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
    表 itrip_hot_keyword 对应的实体类
*/
public class ItripHotKeyword implements Serializable {
    private     String    keyword;
    private     Integer    rank;

    public  ItripHotKeyword(){ }

    public void setKeyword (String  keyword){
        this.keyword = keyword;
    }

    public  String getKeyword(){
        return this.keyword;
    }
    public void setRank (Integer  rank){
        this.rank = rank;
    }

    public  Integer getRank(){
        return this.rank;
    }

    @Override
    public  String  toString(){
        return "ItripHotKeyword[" +
                "keyword = " + this.keyword + ", " + 
                "rank = " + this.rank + 
            "]";
    }
}
