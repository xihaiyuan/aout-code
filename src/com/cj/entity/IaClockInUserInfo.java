package com.cj.entity;

import java.util.Date;
/**
 * table name:  ia_clock_in_user_info
 * author name: 呐喊
 * create time: 2020-04-26 11:26:28
 */ 
public class IaClockInUserInfo extends EntityHelper{

	private null id;
	/*openId*/
	private String open_id;
	/*unionId*/
	private String union_id;
	/*用户id*/
	private long user_id;
	/*邀请人*/
	private String invite_people;
	/*补卡机会*/
	private int remedy_chance;
	/*早打卡提醒配置*/
	private String morn_remind_config;
	/*晚打卡提醒配置*/
	private String night_remind_config;
	/*每日打卡提醒开关状态 0:关 1:开*/
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

	public IaClockInUserInfo() {
		super();
	}
	public IaClockInUserInfo(null id,String open_id,String union_id,long user_id,String invite_people,int remedy_chance,String morn_remind_config,String night_remind_config,byte state,String ext_info,Date add_time,Date mod_time,int version,byte is_deleted) {
		this.id=id;
		this.open_id=open_id;
		this.union_id=union_id;
		this.user_id=user_id;
		this.invite_people=invite_people;
		this.remedy_chance=remedy_chance;
		this.morn_remind_config=morn_remind_config;
		this.night_remind_config=night_remind_config;
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
	public void setOpen_id(String open_id){
		this.open_id=open_id;
	}
	public String getOpen_id(){
		return open_id;
	}
	public void setUnion_id(String union_id){
		this.union_id=union_id;
	}
	public String getUnion_id(){
		return union_id;
	}
	public void setUser_id(long user_id){
		this.user_id=user_id;
	}
	public long getUser_id(){
		return user_id;
	}
	public void setInvite_people(String invite_people){
		this.invite_people=invite_people;
	}
	public String getInvite_people(){
		return invite_people;
	}
	public void setRemedy_chance(int remedy_chance){
		this.remedy_chance=remedy_chance;
	}
	public int getRemedy_chance(){
		return remedy_chance;
	}
	public void setMorn_remind_config(String morn_remind_config){
		this.morn_remind_config=morn_remind_config;
	}
	public String getMorn_remind_config(){
		return morn_remind_config;
	}
	public void setNight_remind_config(String night_remind_config){
		this.night_remind_config=night_remind_config;
	}
	public String getNight_remind_config(){
		return night_remind_config;
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
		return "ia_clock_in_user_info[" + 
			"id=" + id + 
			", open_id=" + open_id + 
			", union_id=" + union_id + 
			", user_id=" + user_id + 
			", invite_people=" + invite_people + 
			", remedy_chance=" + remedy_chance + 
			", morn_remind_config=" + morn_remind_config + 
			", night_remind_config=" + night_remind_config + 
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

