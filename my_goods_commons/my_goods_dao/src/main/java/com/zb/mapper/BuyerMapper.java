package com.zb.mapper;
import com.zb.pojo.Buyer;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BuyerMapper {

	public Buyer getBuyerById(@Param(value = "id") Long id)throws Exception;

	public List<Buyer>	getBuyerListByMap(Map<String,Object> param)throws Exception;

	public Integer getBuyerCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertBuyer(Buyer buyer)throws Exception;

	public Integer updateBuyer(Buyer buyer)throws Exception;


}
