package com.zb.mapper;
import com.zb.pojo.Gticket;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GticketMapper {

	public Gticket getGticketById(@Param(value = "id") Long id)throws Exception;

	public List<Gticket>	getGticketListByMap(Map<String,Object> param)throws Exception;

	public Integer getGticketCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertGticket(Gticket gticket)throws Exception;

	public Integer updateGticket(Gticket gticket)throws Exception;


}
