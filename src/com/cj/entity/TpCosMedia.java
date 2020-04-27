package com.cj.entity;

import java.util.Date;
/**
 * table name:  tp_cos_media
 * author name: 呐喊
 * create time: 2020-04-26 11:26:28
 */ 
public class TpCosMedia extends EntityHelper{

	private null id;
	/*资源类型(0:视频、1:音频）*/
	private byte type;
	/*媒体标识*/
	private String name;
	/*cos任务id*/
	private String task_id;
	/*媒体资源id*/
	private String file_id;
	/*媒体资源url*/
	private String media_url;
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

	public TpCosMedia() {
		super();
	}
	public TpCosMedia(null id,byte type,String name,String task_id,String file_id,String media_url,String ext_info,Date add_time,Date mod_time,int version,byte is_deleted) {
		this.id=id;
		this.type=type;
		this.name=name;
		this.task_id=task_id;
		this.file_id=file_id;
		this.media_url=media_url;
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
	public void setTask_id(String task_id){
		this.task_id=task_id;
	}
	public String getTask_id(){
		return task_id;
	}
	public void setFile_id(String file_id){
		this.file_id=file_id;
	}
	public String getFile_id(){
		return file_id;
	}
	public void setMedia_url(String media_url){
		this.media_url=media_url;
	}
	public String getMedia_url(){
		return media_url;
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
		return "tp_cos_media[" + 
			"id=" + id + 
			", type=" + type + 
			", name=" + name + 
			", task_id=" + task_id + 
			", file_id=" + file_id + 
			", media_url=" + media_url + 
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

