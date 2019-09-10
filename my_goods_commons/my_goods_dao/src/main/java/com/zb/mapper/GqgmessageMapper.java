package com.zb.mapper;
import com.zb.pojo.Gqgmessage;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GqgmessageMapper {

	public Gqgmessage getGqgmessageById(@Param(value = "id") Long id)throws Exception;

	public List<Gqgmessage>	getGqgmessageListByMap(Map<String,Object> param)throws Exception;

	public Integer getGqgmessageCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertGqgmessage(Gqgmessage gqgmessage)throws Exception;

	public Integer updateGqgmessage(Gqgmessage gqgmessage)throws Exception;


}
