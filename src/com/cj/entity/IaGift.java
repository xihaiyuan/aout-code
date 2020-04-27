package com.cj.entity;

import java.util.Date;
/**
 * table name:  ia_gift
 * author name: 呐喊
 * create time: 2020-04-26 11:26:28
 */ 
public class IaGift extends EntityHelper{

	private null id;
	/*礼品类型(1.手机 2.优惠劵 3.趣味礼品 4.幸运签）*/
	private byte type;
	/*礼品名称*/
	private String name;
	/*礼品状态(0.下线 1.上线）*/
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

	public IaGift() {
		super();
	}
	public IaGift(null id,byte type,String name,byte state,String ext_info,Date add_time,Date mod_time,int version,byte is_deleted) {
		this.id=id;
		this.type=type;
		this.name=name;
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
	public void setType(byte type){
		this.type=type;
	}
	public byte getType(){
		return type;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
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
		return "ia_gift[" + 
			"id=" + id + 
			", type=" + type + 
			", name=" + name + 
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

