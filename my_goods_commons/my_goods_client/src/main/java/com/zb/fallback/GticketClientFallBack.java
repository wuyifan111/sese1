package com.zb.fallback;

import com.zb.pojo.Gticket;

import com.zb.client.RestGticketClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class GticketClientFallBack implements RestGticketClient {


    @Override
    public Gticket getGticketById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Gticket>	getGticketListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getGticketCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddGticket(Gticket gticket)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyGticket(Gticket gticket)throws Exception{
        return null;
    }
}
