package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Pay implements Serializable {
    //
    private String id;
    //业务订单号
    private String orderNo;
    //交易订单号
    private String tradeNo;
    //1.支付宝2.微信
    private int payMethod;
    //交易金额
    private Double amount;
    //
    private Date createTime;
    //
    private Date updateTime;
    //get set 方法
    public void setId (String  id){
        this.id=id;
    }
    public  String getId(){
        return this.id;
    }
    public void setOrderNo (String  orderNo){
        this.orderNo=orderNo;
    }
    public  String getOrderNo(){
        return this.orderNo;
    }
    public void setTradeNo (String  tradeNo){
        this.tradeNo=tradeNo;
    }
    public  String getTradeNo(){
        return this.tradeNo;
    }
    public void setPayMethod (int  payMethod){
        this.payMethod=payMethod;
    }
    public  int getPayMethod(){
        return this.payMethod;
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
    public void setUpdateTime (Date  updateTime){
        this.updateTime=updateTime;
    }
    public  Date getUpdateTime(){
        return this.updateTime;
    }
}
