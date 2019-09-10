package com.zb.client;
import com.zb.pojo.Gaddress;

import com.zb.fallback.GaddressClientFallBack;
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
@FeignClient(name = "my-house-private", fallback = GaddressClientFallBack.class)
public interface RestGaddressClient {
@RequestMapping(value = "/getGaddressById",method = RequestMethod.POST)
public Gaddress getGaddressById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getGaddressListByMap",method = RequestMethod.POST)
public List<Gaddress>	getGaddressListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getGaddressCountByMap",method = RequestMethod.POST)
public Integer getGaddressCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddGaddress",method = RequestMethod.POST)
public Integer qdtxAddGaddress(@RequestBody Gaddress gaddress)throws Exception;

@RequestMapping(value = "/qdtxModifyGaddress",method = RequestMethod.POST)
public Integer qdtxModifyGaddress(@RequestBody Gaddress gaddress)throws Exception;
}

