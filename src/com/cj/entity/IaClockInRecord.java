package com.cj.entity;

import java.util.Date;
/**
 * table name:  ia_clock_in_record
 * author name: 呐喊
 * create time: 2020-04-26 11:26:28
 */ 
public class IaClockInRecord extends EntityHelper{

	private null id;
	/*用户id*/
	private long user_id;
	/*年*/
	private int year;
	/*月*/
	private int month;
	/*当月打卡详情*/
	private String details;
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

	public IaClockInRecord() {
		super();
	}
	public IaClockInRecord(null id,long user_id,int year,int month,String details,String ext_info,Date add_time,Date mod_time,int version,byte is_deleted) {
		this.id=id;
		this.user_id=user_id;
		this.year=year;
		this.month=month;
		this.details=details;
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
	public void setUser_id(long user_id){
		this.user_id=user_id;
	}
	public long getUser_id(){
		return user_id;
	}
	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return year;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public int getMonth(){
		return month;
	}
	public void setDetails(String details){
		this.details=details;
	}
	public String getDetails(){
		return details;
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
		return "ia_clock_in_record[" + 
			"id=" + id + 
			", user_id=" + user_id + 
			", year=" + year + 
			", month=" + month + 
			", details=" + details + 
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

