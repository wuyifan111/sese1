package com.zb.mapper;
import com.zb.pojo.OrderDb;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDbMapper {

	public OrderDb getOrderDbById(@Param(value = "id") Long id)throws Exception;

	public List<OrderDb>	getOrderDbListByMap(Map<String,Object> param)throws Exception;

	public Integer getOrderDbCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertOrderDb(OrderDb orderDb)throws Exception;

	public Integer updateOrderDb(OrderDb orderDb)throws Exception;


}
