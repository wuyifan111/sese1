package com.zb.mapper;
import com.zb.pojo.Gtype;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GtypeMapper {

	public Gtype getGtypeById(@Param(value = "id") Long id)throws Exception;

	public List<Gtype>	getGtypeListByMap(Map<String,Object> param)throws Exception;

	public Integer getGtypeCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertGtype(Gtype gtype)throws Exception;

	public Integer updateGtype(Gtype gtype)throws Exception;


}
