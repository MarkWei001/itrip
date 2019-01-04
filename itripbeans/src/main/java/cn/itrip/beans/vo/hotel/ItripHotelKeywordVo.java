package cn.itrip.beans.vo.hotel;

import java.io.Serializable;

/**
 * 用于返回热门关键词的VO
 * Created by zezhong.shang on 17-11-3.
 */
public class ItripHotelKeywordVo implements Serializable{

    private String name;

    private Integer sort;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
