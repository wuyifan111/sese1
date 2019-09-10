package com.zb.fallback;

import com.zb.pojo.Dingdan;

import com.zb.client.RestDingdanClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class DingdanClientFallBack implements RestDingdanClient {


    @Override
    public Dingdan getDingdanById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Dingdan>	getDingdanListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDingdanCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDingdan(Dingdan dingdan)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDingdan(Dingdan dingdan)throws Exception{
        return null;
    }
}
