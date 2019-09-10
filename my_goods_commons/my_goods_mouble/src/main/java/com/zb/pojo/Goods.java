package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Goods implements Serializable {
    //商品编号
    private Long id;
    //商品名称
    private String Gname;
    //外键商品类型id
    private Long Gtypeid;
    //外键，引用商品地区表
    private Long Gaddress;
    //商品价格
    private Float Gprice;
    //
    private Date Gdatetime;
    //商品演出地址
    private String Gchang;
    //商品演出场次
    private String Gscene;
    //商品票档
    private Long Gticket;
    //是否为抢购商品
    private Long Gtobuy;
    //存放图片
    private String Gimage;
    //get set 方法
    public void setId (Long  id){
        this.id=id;
    }
    public  Long getId(){
        return this.id;
    }
    public void setGname (String  Gname){
        this.Gname=Gname;
    }
    public  String getGname(){
        return this.Gname;
    }
    public void setGtypeid (Long  Gtypeid){
        this.Gtypeid=Gtypeid;
    }
    public  Long getGtypeid(){
        return this.Gtypeid;
    }
    public void setGaddress (Long  Gaddress){
        this.Gaddress=Gaddress;
    }
    public  Long getGaddress(){
        return this.Gaddress;
    }
    public void setGprice (Float  Gprice){
        this.Gprice=Gprice;
    }
    public  Float getGprice(){
        return this.Gprice;
    }
    public void setGdatetime (Date  Gdatetime){
        this.Gdatetime=Gdatetime;
    }
    public  Date getGdatetime(){
        return this.Gdatetime;
    }
    public void setGchang (String  Gchang){
        this.Gchang=Gchang;
    }
    public  String getGchang(){
        return this.Gchang;
    }
    public void setGscene (String  Gscene){
        this.Gscene=Gscene;
    }
    public  String getGscene(){
        return this.Gscene;
    }
    public void setGticket (Long  Gticket){
        this.Gticket=Gticket;
    }
    public  Long getGticket(){
        return this.Gticket;
    }
    public void setGtobuy (Long  Gtobuy){
        this.Gtobuy=Gtobuy;
    }
    public  Long getGtobuy(){
        return this.Gtobuy;
    }
    public void setGimage (String  Gimage){
        this.Gimage=Gimage;
    }
    public  String getGimage(){
        return this.Gimage;
    }
}
