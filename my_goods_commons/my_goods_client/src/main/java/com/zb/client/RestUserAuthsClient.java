package com.zb.client;
import com.zb.pojo.UserAuths;

import com.zb.fallback.UserAuthsClientFallBack;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
/**
* Created by shang-pc on 2018/5/15.
*/
@FeignClient(name = "my-house-private", fallback = UserAuthsClientFallBack.class)
public interface RestUserAuthsClient {
@RequestMapping(value = "/getUserAuthsById",method = RequestMethod.POST)
public UserAuths getUserAuthsById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getUserAuthsListByMap",method = RequestMethod.POST)
public List<UserAuths>	getUserAuthsListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getUserAuthsCountByMap",method = RequestMethod.POST)
public Integer getUserAuthsCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddUserAuths",method = RequestMethod.POST)
public Integer qdtxAddUserAuths(@RequestBody UserAuths userAuths)throws Exception;

@RequestMapping(value = "/qdtxModifyUserAuths",method = RequestMethod.POST)
public Integer qdtxModifyUserAuths(@RequestBody UserAuths userAuths)throws Exception;
}

