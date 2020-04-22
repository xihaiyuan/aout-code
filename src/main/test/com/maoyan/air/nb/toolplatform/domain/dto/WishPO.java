package com.maoyan.air.nb.toolplatform.domain.dto;

import com.maoyan.newbusiness.common.base.BaseObject;
import java.io.Serializable;
import java.util.Date;

public class WishPO extends BaseObject implements Serializable {
    private Integer id;

    private Integer channelId;

    private Long userId;

    private String topicId;

    private String templateId;

    private String title;

    private String headImage;

    private Byte hasCalender;

    private String musicName;

    private String musicUrl;

    private String contentIds;

    private Integer realBrowseNum;

    private Integer browseNum;

    private Date setTime;

    private String floorContent;

    private Byte contentStatus;

    private Byte imageStatus;

    private Byte status;

    private String extInfo;

    private Date addTime;

    private Date modTime;

    private Integer version;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId == null ? null : topicId.trim();
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId == null ? null : templateId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage == null ? null : headImage.trim();
    }

    public Byte getHasCalender() {
        return hasCalender;
    }

    public void setHasCalender(Byte hasCalender) {
        this.hasCalender = hasCalender;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName == null ? null : musicName.trim();
    }

    public String getMusicUrl() {
        return musicUrl;
    }

    public void setMusicUrl(String musicUrl) {
        this.musicUrl = musicUrl == null ? null : musicUrl.trim();
    }

    public String getContentIds() {
        return contentIds;
    }

    public void setContentIds(String contentIds) {
        this.contentIds = contentIds == null ? null : contentIds.trim();
    }

    public Integer getRealBrowseNum() {
        return realBrowseNum;
    }

    public void setRealBrowseNum(Integer realBrowseNum) {
        this.realBrowseNum = realBrowseNum;
    }

    public Integer getBrowseNum() {
        return browseNum;
    }

    public void setBrowseNum(Integer browseNum) {
        this.browseNum = browseNum;
    }

    public Date getSetTime() {
        return setTime;
    }

    public void setSetTime(Date setTime) {
        this.setTime = setTime;
    }

    public String getFloorContent() {
        return floorContent;
    }

    public void setFloorContent(String floorContent) {
        this.floorContent = floorContent == null ? null : floorContent.trim();
    }

    public Byte getContentStatus() {
        return contentStatus;
    }

    public void setContentStatus(Byte contentStatus) {
        this.contentStatus = contentStatus;
    }

    public Byte getImageStatus() {
        return imageStatus;
    }

    public void setImageStatus(Byte imageStatus) {
        this.imageStatus = imageStatus;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo == null ? null : extInfo.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getModTime() {
        return modTime;
    }

    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}