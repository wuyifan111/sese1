package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Gticket implements Serializable {
    //票档id
    private Long id;
    //票当名称
    private String ticketname;
    //
    private Long goodsid;
    //
    private Long Gcount;
    //get set 方法
    public void setId (Long  id){
        this.id=id;
    }
    public  Long getId(){
        return this.id;
    }
    public void setTicketname (String  ticketname){
        this.ticketname=ticketname;
    }
    public  String getTicketname(){
        return this.ticketname;
    }
    public void setGoodsid (Long  goodsid){
        this.goodsid=goodsid;
    }
    public  Long getGoodsid(){
        return this.goodsid;
    }
    public void setGcount (Long  Gcount){
        this.Gcount=Gcount;
    }
    public  Long getGcount(){
        return this.Gcount;
    }
}
