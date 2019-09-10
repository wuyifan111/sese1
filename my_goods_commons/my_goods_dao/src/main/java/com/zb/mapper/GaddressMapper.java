package com.zb.mapper;
import com.zb.pojo.Gaddress;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GaddressMapper {

	public Gaddress getGaddressById(@Param(value = "id") Long id)throws Exception;

	public List<Gaddress>	getGaddressListByMap(Map<String,Object> param)throws Exception;

	public Integer getGaddressCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertGaddress(Gaddress gaddress)throws Exception;

	public Integer updateGaddress(Gaddress gaddress)throws Exception;


}
