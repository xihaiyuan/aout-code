package com.cj.entity;

import java.util.Date;
/**
 * table name:  clock_media
 * author name: 呐喊
 * create time: 2020-04-26 11:26:28
 */ 
public class ClockMedia extends EntityHelper{

	/*自增id*/
	private null id;
	/*图片文字/图片*/
	private String content;
	/*1：公共，2：每日*/
	private byte type;
	/*1,早安，2,晚安*/
	private byte day_type;
	/*日期*/
	private Date day_time;
	/*1文字 2图片*/
	private byte content_type;
	/*1删除*/
	private byte is_delete;
	/*版本号*/
	private int version;
	/*创建时间*/
	private Date add_time;
	/*修改时间*/
	private Date mod_time;

	public ClockMedia() {
		super();
	}
	public ClockMedia(null id,String content,byte type,byte day_type,Date day_time,byte content_type,byte is_delete,int version,Date add_time,Date mod_time) {
		this.id=id;
		this.content=content;
		this.type=type;
		this.day_type=day_type;
		this.day_time=day_time;
		this.content_type=content_type;
		this.is_delete=is_delete;
		this.version=version;
		this.add_time=add_time;
		this.mod_time=mod_time;
	}
	public void setId(null id){
		this.id=id;
	}
	public null getId(){
		return id;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String getContent(){
		return content;
	}
	public void setType(byte type){
		this.type=type;
	}
	public byte getType(){
		return type;
	}
	public void setDay_type(byte day_type){
		this.day_type=day_type;
	}
	public byte getDay_type(){
		return day_type;
	}
	public void setDay_time(Date day_time){
		this.day_time=day_time;
	}
	public Date getDay_time(){
		return day_time;
	}
	public void setContent_type(byte content_type){
		this.content_type=content_type;
	}
	public byte getContent_type(){
		return content_type;
	}
	public void setIs_delete(byte is_delete){
		this.is_delete=is_delete;
	}
	public byte getIs_delete(){
		return is_delete;
	}
	public void setVersion(int version){
		this.version=version;
	}
	public int getVersion(){
		return version;
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
	@Override
	public String toString() {
		return "clock_media[" + 
			"id=" + id + 
			", content=" + content + 
			", type=" + type + 
			", day_type=" + day_type + 
			", day_time=" + day_time + 
			", content_type=" + content_type + 
			", is_delete=" + is_delete + 
			", version=" + version + 
			", add_time=" + add_time + 
			", mod_time=" + mod_time + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "id";
	}
}

