package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class OrderDb implements Serializable {
    //主键
    private String id;
    //用户id
    private String userId;
    //库存id
    private String stockId;
    //订单编号
    private String orderNo;
    //商品id
    private String goodId;
    //购买数量
    private int num;
    //总价
    private Double amount;
    //支付状态1：支付2：未支付
    private int status;
    //阿里订单号
    private String aliTradeNo;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;
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
    public void setStockId (String  stockId){
        this.stockId=stockId;
    }
    public  String getStockId(){
        return this.stockId;
    }
    public void setOrderNo (String  orderNo){
        this.orderNo=orderNo;
    }
    public  String getOrderNo(){
        return this.orderNo;
    }
    public void setGoodId (String  goodId){
        this.goodId=goodId;
    }
    public  String getGoodId(){
        return this.goodId;
    }
    public void setNum (int  num){
        this.num=num;
    }
    public  int getNum(){
        return this.num;
    }
    public void setAmount (Double  amount){
        this.amount=amount;
    }
    public  Double getAmount(){
        return this.amount;
    }
    public void setStatus (int  status){
        this.status=status;
    }
    public  int getStatus(){
        return this.status;
    }
    public void setAliTradeNo (String  aliTradeNo){
        this.aliTradeNo=aliTradeNo;
    }
    public  String getAliTradeNo(){
        return this.aliTradeNo;
    }
    public void setCreateTime (Date  createTime){
        this.createTime=createTime;
    }
    public  Date getCreateTime(){
        return this.createTime;
    }
    public void setUpdateTime (Date  updateTime){
        this.updateTime=updateTime;
    }
    public  Date getUpdateTime(){
        return this.updateTime;
    }
}
