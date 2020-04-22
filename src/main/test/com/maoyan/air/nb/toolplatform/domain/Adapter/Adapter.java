package com.maoyan.air.nb.toolplatform.domain.Adapter;

import com.maoyan.air.nb.toolplatform.domain.dto.WishDTO;
import com.maoyan.air.nb.toolplatform.domain.dto.WishPO;
import java.io.Serializable;
import java.lang.String;

public class Adapter implements Serializable {
  private String Adapter;

  public static WishPO dtoToPo(WishDTO wishDto) {
    if (wishDto == null) {
      return null;
    }
    WishPO wishPO = new WishPO();
    wishPO.setId(wishDto.getTest);
    return WishPO;
  }
}
