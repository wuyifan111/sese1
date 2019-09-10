package com.zb.mapper;
import com.zb.pojo.Dingdan;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DingdanMapper {

	public Dingdan getDingdanById(@Param(value = "id") Long id)throws Exception;

	public List<Dingdan>	getDingdanListByMap(Map<String,Object> param)throws Exception;

	public Integer getDingdanCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertDingdan(Dingdan dingdan)throws Exception;

	public Integer updateDingdan(Dingdan dingdan)throws Exception;


}
