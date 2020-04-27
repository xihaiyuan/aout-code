package com.cj.entity;

import java.util.Date;
/**
 * table name:  tp_user_year_inventory
 * author name: 呐喊
 * create time: 2020-04-26 11:26:28
 */ 
public class TpUserYearInventory extends EntityHelper{

	private null id;
	/*手机号码*/
	private String phone;
	/*通用渠道Id*/
	private int channel_id;
	/*用户昵称*/
	private String nick_name;
	/*头像*/
	private String head_url;
	/*头像审核状态(0:未审核、1:审核中、2:通过、3:未通过）*/
	private byte head_audit_result;
	/*订单数*/
	private int order_count;
	/*打败用户数*/
	private String beat_user_percent;
	/*用户标签*/
	private String labels;
	/*电影id集合*/
	private String movie_ids;
	/*基础图片集合*/
	private String base_pics;
	/*基础视频集合*/
	private String base_videos;
	/*生成视频*/
	private String video_without_pic;
	/*生成视频*/
	private String video;
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

	public TpUserYearInventory() {
		super();
	}
	public TpUserYearInventory(null id,String phone,int channel_id,String nick_name,String head_url,byte head_audit_result,int order_count,String beat_user_percent,String labels,String movie_ids,String base_pics,String base_videos,String video_without_pic,String video,String ext_info,Date add_time,Date mod_time,int version,byte is_deleted) {
		this.id=id;
		this.phone=phone;
		this.channel_id=channel_id;
		this.nick_name=nick_name;
		this.head_url=head_url;
		this.head_audit_result=head_audit_result;
		this.order_count=order_count;
		this.beat_user_percent=beat_user_percent;
		this.labels=labels;
		this.movie_ids=movie_ids;
		this.base_pics=base_pics;
		this.base_videos=base_videos;
		this.video_without_pic=video_without_pic;
		this.video=video;
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
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setChannel_id(int channel_id){
		this.channel_id=channel_id;
	}
	public int getChannel_id(){
		return channel_id;
	}
	public void setNick_name(String nick_name){
		this.nick_name=nick_name;
	}
	public String getNick_name(){
		return nick_name;
	}
	public void setHead_url(String head_url){
		this.head_url=head_url;
	}
	public String getHead_url(){
		return head_url;
	}
	public void setHead_audit_result(byte head_audit_result){
		this.head_audit_result=head_audit_result;
	}
	public byte getHead_audit_result(){
		return head_audit_result;
	}
	public void setOrder_count(int order_count){
		this.order_count=order_count;
	}
	public int getOrder_count(){
		return order_count;
	}
	public void setBeat_user_percent(String beat_user_percent){
		this.beat_user_percent=beat_user_percent;
	}
	public String getBeat_user_percent(){
		return beat_user_percent;
	}
	public void setLabels(String labels){
		this.labels=labels;
	}
	public String getLabels(){
		return labels;
	}
	public void setMovie_ids(String movie_ids){
		this.movie_ids=movie_ids;
	}
	public String getMovie_ids(){
		return movie_ids;
	}
	public void setBase_pics(String base_pics){
		this.base_pics=base_pics;
	}
	public String getBase_pics(){
		return base_pics;
	}
	public void setBase_videos(String base_videos){
		this.base_videos=base_videos;
	}
	public String getBase_videos(){
		return base_videos;
	}
	public void setVideo_without_pic(String video_without_pic){
		this.video_without_pic=video_without_pic;
	}
	public String getVideo_without_pic(){
		return video_without_pic;
	}
	public void setVideo(String video){
		this.video=video;
	}
	public String getVideo(){
		return video;
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
		return "tp_user_year_inventory[" + 
			"id=" + id + 
			", phone=" + phone + 
			", channel_id=" + channel_id + 
			", nick_name=" + nick_name + 
			", head_url=" + head_url + 
			", head_audit_result=" + head_audit_result + 
			", order_count=" + order_count + 
			", beat_user_percent=" + beat_user_percent + 
			", labels=" + labels + 
			", movie_ids=" + movie_ids + 
			", base_pics=" + base_pics + 
			", base_videos=" + base_videos + 
			", video_without_pic=" + video_without_pic + 
			", video=" + video + 
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

