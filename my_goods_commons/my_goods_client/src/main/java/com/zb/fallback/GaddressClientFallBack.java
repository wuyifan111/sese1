package com.zb.fallback;

import com.zb.pojo.Gaddress;

import com.zb.client.RestGaddressClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class GaddressClientFallBack implements RestGaddressClient {


    @Override
    public Gaddress getGaddressById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Gaddress>	getGaddressListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getGaddressCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddGaddress(Gaddress gaddress)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyGaddress(Gaddress gaddress)throws Exception{
        return null;
    }
}
