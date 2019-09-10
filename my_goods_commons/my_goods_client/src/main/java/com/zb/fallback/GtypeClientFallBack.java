package com.zb.fallback;

import com.zb.pojo.Gtype;

import com.zb.client.RestGtypeClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class GtypeClientFallBack implements RestGtypeClient {


    @Override
    public Gtype getGtypeById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Gtype>	getGtypeListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getGtypeCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddGtype(Gtype gtype)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyGtype(Gtype gtype)throws Exception{
        return null;
    }
}
