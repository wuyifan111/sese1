package com.zb.mapper;
import com.zb.pojo.Pay;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PayMapper {

	public Pay getPayById(@Param(value = "id") Long id)throws Exception;

	public List<Pay>	getPayListByMap(Map<String,Object> param)throws Exception;

	public Integer getPayCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertPay(Pay pay)throws Exception;

	public Integer updatePay(Pay pay)throws Exception;


}
