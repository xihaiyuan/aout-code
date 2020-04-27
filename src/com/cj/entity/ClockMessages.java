package com.cj.entity;

import java.util.Date;
/**
 * table name:  clock_messages
 * author name: 呐喊
 * create time: 2020-04-26 11:26:28
 */ 
public class ClockMessages extends EntityHelper{

	/*自增id*/
	private null id;
	/*名称*/
	private String title;
	/*链接地址/内容*/
	private String content;
	/*日期*/
	private Date day_time;
	/*可上线的最小时间*/
	private Date begin_time;
	/*可上线的结束时间*/
	private Date end_time;
	/*1公共，2每日*/
	private byte type;
	/*1.早安，2.晚安*/
	private byte day_type;
	/*1文字 2链接*/
	private byte content_type;
	/*0：下线，1:上线*/
	private byte online;
	/*版本号*/
	private int version;
	/*0未删除，1已删除*/
	private byte is_delete;
	/*创建时间*/
	private Date add_time;
	/*修改时间*/
	private Date mod_time;

	public ClockMessages() {
		super();
	}
	public ClockMessages(null id,String title,String content,Date day_time,Date begin_time,Date end_time,byte type,byte day_type,byte content_type,byte online,int version,byte is_delete,Date add_time,Date mod_time) {
		this.id=id;
		this.title=title;
		this.content=content;
		this.day_time=day_time;
		this.begin_time=begin_time;
		this.end_time=end_time;
		this.type=type;
		this.day_type=day_type;
		this.content_type=content_type;
		this.online=online;
		this.version=version;
		this.is_delete=is_delete;
		this.add_time=add_time;
		this.mod_time=mod_time;
	}
	public void setId(null id){
		this.id=id;
	}
	public null getId(){
		return id;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return title;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String getContent(){
		return content;
	}
	public void setDay_time(Date day_time){
		this.day_time=day_time;
	}
	public Date getDay_time(){
		return day_time;
	}
	public void setBegin_time(Date begin_time){
		this.begin_time=begin_time;
	}
	public Date getBegin_time(){
		return begin_time;
	}
	public void setEnd_time(Date end_time){
		this.end_time=end_time;
	}
	public Date getEnd_time(){
		return end_time;
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
	public void setContent_type(byte content_type){
		this.content_type=content_type;
	}
	public byte getContent_type(){
		return content_type;
	}
	public void setOnline(byte online){
		this.online=online;
	}
	public byte getOnline(){
		return online;
	}
	public void setVersion(int version){
		this.version=version;
	}
	public int getVersion(){
		return version;
	}
	public void setIs_delete(byte is_delete){
		this.is_delete=is_delete;
	}
	public byte getIs_delete(){
		return is_delete;
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
		return "clock_messages[" + 
			"id=" + id + 
			", title=" + title + 
			", content=" + content + 
			", day_time=" + day_time + 
			", begin_time=" + begin_time + 
			", end_time=" + end_time + 
			", type=" + type + 
			", day_type=" + day_type + 
			", content_type=" + content_type + 
			", online=" + online + 
			", version=" + version + 
			", is_delete=" + is_delete + 
			", add_time=" + add_time + 
			", mod_time=" + mod_time + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "id";
	}
}

