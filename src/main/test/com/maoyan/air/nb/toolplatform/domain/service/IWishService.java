package com.maoyan.air.nb.toolplatform.domain.service;

import com.maoyan.air.nb.toolplatform.domain.dto.WishDTO;
import java.lang.Integer;
import java.util.List;

public interface IWishService {
  int insert(WishDTO wishDto);

  int update(WishDTO wishDto);

  List<WishDTO> getList(WishDTO wishDto, Integer limit, Integer offset);

  int getCount(WishDTO wishDto);
}
