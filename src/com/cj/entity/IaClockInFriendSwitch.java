package com.cj.entity;

import java.util.Date;
/**
 * table name:  ia_clock_in_friend_switch
 * author name: 呐喊
 * create time: 2020-04-26 11:26:28
 */ 
public class IaClockInFriendSwitch extends EntityHelper{

	private null id;
	/*unionId*/
	private String union_id;
	/*用户id*/
	private long user_id;
	/*好友userId*/
	private long friend_id;
	/*openId*/
	private String friend_open_id;
	/*unionId*/
	private String friend_union_id;
	/*早打卡提醒状态*/
	private byte morn_state;
	/*晚打卡提醒状态*/
	private byte night_state;
	/*创建时间*/
	private Date add_time;
	/*修改时间*/
	private Date mod_time;
	/*版本号*/
	private int version;
	/*删除状态(0:未删除、1:删除）*/
	private byte is_deleted;
	private String friend_states;

	public IaClockInFriendSwitch() {
		super();
	}
	public IaClockInFriendSwitch(null id,String union_id,long user_id,long friend_id,String friend_open_id,String friend_union_id,byte morn_state,byte night_state,Date add_time,Date mod_time,int version,byte is_deleted,String friend_states) {
		this.id=id;
		this.union_id=union_id;
		this.user_id=user_id;
		this.friend_id=friend_id;
		this.friend_open_id=friend_open_id;
		this.friend_union_id=friend_union_id;
		this.morn_state=morn_state;
		this.night_state=night_state;
		this.add_time=add_time;
		this.mod_time=mod_time;
		this.version=version;
		this.is_deleted=is_deleted;
		this.friend_states=friend_states;
	}
	public void setId(null id){
		this.id=id;
	}
	public null getId(){
		return id;
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
	public void setFriend_id(long friend_id){
		this.friend_id=friend_id;
	}
	public long getFriend_id(){
		return friend_id;
	}
	public void setFriend_open_id(String friend_open_id){
		this.friend_open_id=friend_open_id;
	}
	public String getFriend_open_id(){
		return friend_open_id;
	}
	public void setFriend_union_id(String friend_union_id){
		this.friend_union_id=friend_union_id;
	}
	public String getFriend_union_id(){
		return friend_union_id;
	}
	public void setMorn_state(byte morn_state){
		this.morn_state=morn_state;
	}
	public byte getMorn_state(){
		return morn_state;
	}
	public void setNight_state(byte night_state){
		this.night_state=night_state;
	}
	public byte getNight_state(){
		return night_state;
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
	public void setFriend_states(String friend_states){
		this.friend_states=friend_states;
	}
	public String getFriend_states(){
		return friend_states;
	}
	@Override
	public String toString() {
		return "ia_clock_in_friend_switch[" + 
			"id=" + id + 
			", union_id=" + union_id + 
			", user_id=" + user_id + 
			", friend_id=" + friend_id + 
			", friend_open_id=" + friend_open_id + 
			", friend_union_id=" + friend_union_id + 
			", morn_state=" + morn_state + 
			", night_state=" + night_state + 
			", add_time=" + add_time + 
			", mod_time=" + mod_time + 
			", version=" + version + 
			", is_deleted=" + is_deleted + 
			", friend_states=" + friend_states + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "id";
	}
}

