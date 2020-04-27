package com.cj.entity;

import java.util.Date;
/**
 * table name:  ia_coupon_record
 * author name: 呐喊
 * create time: 2020-04-26 11:26:28
 */ 
public class IaCouponRecord extends EntityHelper{

	private null id;
	/*福包id*/
	private int bag_id;
	/*用户id*/
	private long user_id;
	/*发劵方案id*/
	private int plan_id;
	/*批次id*/
	private int batch_id;
	/*优惠券券码*/
	private String coupon_code;
	/*uniqKey*/
	private String send_uniqkey;
	/*发劵结果(1.成功 2.失败)*/
	private byte status;
	/*发券金额*/
	private int amount;
	/*劵标题*/
	private String title;
	/*发券返回码*/
	private int code;
	/*优惠券有效期截止时间*/
	private Date coupon_expire_time;
	/*预留的其它字段*/
	private String ext_info;
	/*创建时间*/
	private Date add_time;
	/*修改时间*/
	private Date mod_time;
	/*版本号*/
	private int version;
	/*删除状态(0:未删除、1:删除）*/
	private byte is_deleted;

	public IaCouponRecord() {
		super();
	}
	public IaCouponRecord(null id,int bag_id,long user_id,int plan_id,int batch_id,String coupon_code,String send_uniqkey,byte status,int amount,String title,int code,Date coupon_expire_time,String ext_info,Date add_time,Date mod_time,int version,byte is_deleted) {
		this.id=id;
		this.bag_id=bag_id;
		this.user_id=user_id;
		this.plan_id=plan_id;
		this.batch_id=batch_id;
		this.coupon_code=coupon_code;
		this.send_uniqkey=send_uniqkey;
		this.status=status;
		this.amount=amount;
		this.title=title;
		this.code=code;
		this.coupon_expire_time=coupon_expire_time;
		this.ext_info=ext_info;
		this.add_time=add_time;
		this.mod_time=mod_time;
		this.version=version;
		this.is_deleted=is_deleted;
	}
	public void setId(null id){
		this.id=id;
	}
	public null getId(){
		return id;
	}
	public void setBag_id(int bag_id){
		this.bag_id=bag_id;
	}
	public int getBag_id(){
		return bag_id;
	}
	public void setUser_id(long user_id){
		this.user_id=user_id;
	}
	public long getUser_id(){
		return user_id;
	}
	public void setPlan_id(int plan_id){
		this.plan_id=plan_id;
	}
	public int getPlan_id(){
		return plan_id;
	}
	public void setBatch_id(int batch_id){
		this.batch_id=batch_id;
	}
	public int getBatch_id(){
		return batch_id;
	}
	public void setCoupon_code(String coupon_code){
		this.coupon_code=coupon_code;
	}
	public String getCoupon_code(){
		return coupon_code;
	}
	public void setSend_uniqkey(String send_uniqkey){
		this.send_uniqkey=send_uniqkey;
	}
	public String getSend_uniqkey(){
		return send_uniqkey;
	}
	public void setStatus(byte status){
		this.status=status;
	}
	public byte getStatus(){
		return status;
	}
	public void setAmount(int amount){
		this.amount=amount;
	}
	public int getAmount(){
		return amount;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return title;
	}
	public void setCode(int code){
		this.code=code;
	}
	public int getCode(){
		return code;
	}
	public void setCoupon_expire_time(Date coupon_expire_time){
		this.coupon_expire_time=coupon_expire_time;
	}
	public Date getCoupon_expire_time(){
		return coupon_expire_time;
	}
	public void setExt_info(String ext_info){
		this.ext_info=ext_info;
	}
	public String getExt_info(){
		return ext_info;
	}
	public void setAdd_time(Date add_time){
		this.add_time=add_time;
	}
	public Date getAdd_time(){
		return add_time;
	}
	public void setMod_time(Date mod_time){
		this.mod_time=mod_time;
	}
	public Date getMod_time(){
		return mod_time;
	}
	public void setVersion(int version){
		this.version=version;
	}
	public int getVersion(){
		return version;
	}
	public void setIs_deleted(byte is_deleted){
		this.is_deleted=is_deleted;
	}
	public byte getIs_deleted(){
		return is_deleted;
	}
	@Override
	public String toString() {
		return "ia_coupon_record[" + 
			"id=" + id + 
			", bag_id=" + bag_id + 
			", user_id=" + user_id + 
			", plan_id=" + plan_id + 
			", batch_id=" + batch_id + 
			", coupon_code=" + coupon_code + 
			", send_uniqkey=" + send_uniqkey + 
			", status=" + status + 
			", amount=" + amount + 
			", title=" + title + 
			", code=" + code + 
			", coupon_expire_time=" + coupon_expire_time + 
			", ext_info=" + ext_info + 
			", add_time=" + add_time + 
			", mod_time=" + mod_time + 
			", version=" + version + 
			", is_deleted=" + is_deleted + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "id";
	}
}

