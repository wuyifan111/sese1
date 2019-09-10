package com.zb.mapper;
import com.zb.pojo.UserAuths;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserAuthsMapper {

	public UserAuths getUserAuthsById(@Param(value = "id") Long id)throws Exception;

	public List<UserAuths>	getUserAuthsListByMap(Map<String,Object> param)throws Exception;

	public Integer getUserAuthsCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertUserAuths(UserAuths userAuths)throws Exception;

	public Integer updateUserAuths(UserAuths userAuths)throws Exception;


}
