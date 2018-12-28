package cn.itrip.dao;

import cn.itrip.beans.pojo.ItripHotCity;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface ItripHotCityMapper {

	public ItripHotCity getItripHotCityById(@Param(value = "id") Long id)throws Exception;

	public List<ItripHotCity>	getItripHotCityListByMap(Map<String, Object> param)throws Exception;

    public Integer getItripHotCityCountByMap(Map<String, Object> param)throws Exception;

    public Integer insertItripHotCity(ItripHotCity itripHotCity)throws Exception;

    public Integer updateItripHotCity(ItripHotCity itripHotCity)throws Exception;

    public Integer deleteItripHotCityById(@Param(value = "id") Long id)throws Exception;

}