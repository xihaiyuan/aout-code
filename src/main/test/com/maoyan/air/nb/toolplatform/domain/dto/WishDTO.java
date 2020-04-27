package com.maoyan.air.nb.toolplatform.domain.dto;

import java.io.Serializable;
import java.lang.Byte;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
import lombok.Data;

@Data
public class WishDTO implements Serializable {
  /**
   * 自增id
   */
  private Integer id;

  /**
   * 图片文字/图片
   */
  private String content;

  /**
   * 1：公共，2：每日
   */
  private Byte type;

  /**
   * 1,早安，2,晚安
   */
  private Byte dayType;

  /**
   * 日期
   */
  private Date dayTime;

  /**
   * 1文字 2图片
   */
  private Byte contentType;

  /**
   * 1删除
   */
  private Byte isDelete;

  /**
   * 版本号
   */
  private Integer version;

  /**
   * 创建时间
   */
  private Date addTime;

  /**
   * 修改时间
   */
  private Date modTime;
}
