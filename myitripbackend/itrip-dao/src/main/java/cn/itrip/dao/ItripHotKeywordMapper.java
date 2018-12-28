package cn.itrip.dao;

import cn.itrip.beans.pojo.ItripHotKeyword;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ItripHotKeywordMapper {

	public ItripHotKeyword getItripHotKeywordById(@Param(value = "id") Long id)throws Exception;

	public List<ItripHotKeyword>	getItripHotKeywordListByMap(Map<String, Object> param)throws Exception;

    public Integer getItripHotKeywordCountByMap(Map<String, Object> param)throws Exception;

    public Integer insertItripHotKeyword(ItripHotKeyword itripHotKeyword)throws Exception;

    public Integer updateItripHotKeyword(ItripHotKeyword itripHotKeyword)throws Exception;

    public Integer deleteItripHotKeywordById(@Param(value = "id") Long id)throws Exception;

}