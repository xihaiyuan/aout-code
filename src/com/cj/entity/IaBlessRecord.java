package com.cj.entity;

import java.util.Date;
/**
 * table name:  ia_bless_record
 * author name: 呐喊
 * create time: 2020-04-26 11:26:28
 */ 
public class IaBlessRecord extends EntityHelper{

	private null id;
	/*福包id*/
	private int bag_id;
	/*用户id*/
	private long user_id;
	/*头像*/
	private String head_url;
	/*昵称*/
	private String nick_name;
	/*礼品id*/
	private String gift;
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

	public IaBlessRecord() {
		super();
	}
	public IaBlessRecord(null id,int bag_id,long user_id,String head_url,String nick_name,String gift,String ext_info,Date add_time,Date mod_time,int version,byte is_deleted) {
		this.id=id;
		this.bag_id=bag_id;
		this.user_id=user_id;
		this.head_url=head_url;
		this.nick_name=nick_name;
		this.gift=gift;
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
	public void setHead_url(String head_url){
		this.head_url=head_url;
	}
	public String getHead_url(){
		return head_url;
	}
	public void setNick_name(String nick_name){
		this.nick_name=nick_name;
	}
	public String getNick_name(){
		return nick_name;
	}
	public void setGift(String gift){
		this.gift=gift;
	}
	public String getGift(){
		return gift;
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
		return "ia_bless_record[" + 
			"id=" + id + 
			", bag_id=" + bag_id + 
			", user_id=" + user_id + 
			", head_url=" + head_url + 
			", nick_name=" + nick_name + 
			", gift=" + gift + 
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

