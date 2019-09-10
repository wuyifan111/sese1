package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Gqgmessage implements Serializable {
    //生成的商品号
    private String id;
    //用户id
    private String userId;
    //商品id
    private String goodsId;
    //抢购状态
    private String status;
    //金额
    private Double amount;
    //
    private Date createTime;
    //
    private Date UpdateTime;
    //get set 方法
    public void setId (String  id){
        this.id=id;
    }
    public  String getId(){
        return this.id;
    }
    public void setUserId (String  userId){
        this.userId=userId;
    }
    public  String getUserId(){
        return this.userId;
    }
    public void setGoodsId (String  goodsId){
        this.goodsId=goodsId;
    }
    public  String getGoodsId(){
        return this.goodsId;
    }
    public void setStatus (String  status){
        this.status=status;
    }
    public  String getStatus(){
        return this.status;
    }
    public void setAmount (Double  amount){
        this.amount=amount;
    }
    public  Double getAmount(){
        return this.amount;
    }
    public void setCreateTime (Date  createTime){
        this.createTime=createTime;
    }
    public  Date getCreateTime(){
        return this.createTime;
    }
    public void setUpdateTime (Date  UpdateTime){
        this.UpdateTime=UpdateTime;
    }
    public  Date getUpdateTime(){
        return this.UpdateTime;
    }
}
