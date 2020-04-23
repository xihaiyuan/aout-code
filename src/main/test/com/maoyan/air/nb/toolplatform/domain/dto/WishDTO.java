package com.maoyan.air.nb.toolplatform.domain.dto;

import java.io.Serializable;
import java.lang.String;
import lombok.Data;

@Data
public class WishDTO implements Serializable {
  /**
   * 自增id
   */
  private String id;

  /**
   * 图片文字/图片
   */
  private String content;

  /**
   * 1：公共，2：每日
   */
  private String type;

  /**
   * 1,早安，2,晚安
   */
  private String day_type;

  /**
   * 日期
   */
  private String day_time;

  /**
   * 1文字 2图片
   */
  private String content_type;

  /**
   * 1删除
   */
  private String is_delete;

  /**
   * 版本号
   */
  private String version;

  /**
   * 创建时间
   */
  private String add_time;

  /**
   * 修改时间
   */
  private String mod_time;
}
