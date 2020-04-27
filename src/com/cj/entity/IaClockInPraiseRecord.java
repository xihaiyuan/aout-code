package com.cj.entity;

import java.util.Date;
/**
 * table name:  ia_clock_in_praise_record
 * author name: 呐喊
 * create time: 2020-04-26 11:26:28
 */ 
public class IaClockInPraiseRecord extends EntityHelper{

	private null id;
	/*打卡记录id*/
	private int recode_id;
	/*用户id*/
	private long user_id;
	/*点赞用户id*/
	private long praise_user_id;
	/*点赞状态状态(0.点赞 1.回赞）*/
	private byte state;
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

	public IaClockInPraiseRecord() {
		super();
	}
	public IaClockInPraiseRecord(null id,int recode_id,long user_id,long praise_user_id,byte state,String ext_info,Date add_time,Date mod_time,int version,byte is_deleted) {
		this.id=id;
		this.recode_id=recode_id;
		this.user_id=user_id;
		this.praise_user_id=praise_user_id;
		this.state=state;
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
	public void setRecode_id(int recode_id){
		this.recode_id=recode_id;
	}
	public int getRecode_id(){
		return recode_id;
	}
	public void setUser_id(long user_id){
		this.user_id=user_id;
	}
	public long getUser_id(){
		return user_id;
	}
	public void setPraise_user_id(long praise_user_id){
		this.praise_user_id=praise_user_id;
	}
	public long getPraise_user_id(){
		return praise_user_id;
	}
	public void setState(byte state){
		this.state=state;
	}
	public byte getState(){
		return state;
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
		return "ia_clock_in_praise_record[" + 
			"id=" + id + 
			", recode_id=" + recode_id + 
			", user_id=" + user_id + 
			", praise_user_id=" + praise_user_id + 
			", state=" + state + 
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

