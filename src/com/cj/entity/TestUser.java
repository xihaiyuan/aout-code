package com.cj.entity;

import java.util.Date;
/**
 * table name:  test_user
 * author name: 呐喊
 * create time: 2020-04-26 11:26:28
 */ 
public class TestUser extends EntityHelper{

	/*id*/
	private int id;
	/*名称*/
	private String name;
	/*版本号*/
	private int version;
	/*删除状态(0:未删除、1:删除）*/
	private byte is_deleted;

	public TestUser() {
		super();
	}
	public TestUser(int id,String name,int version,byte is_deleted) {
		this.id=id;
		this.name=name;
		this.version=version;
		this.is_deleted=is_deleted;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
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
		return "test_user[" + 
			"id=" + id + 
			", name=" + name + 
			", version=" + version + 
			", is_deleted=" + is_deleted + 
			"]";
	}
	@Override
	public String getPrimaryKey() {
		return "id";
	}
}

