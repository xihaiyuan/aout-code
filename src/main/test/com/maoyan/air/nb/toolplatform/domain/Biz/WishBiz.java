package com.maoyan.air.nb.toolplatform.domain.Biz;

import com.maoyan.air.nb.toolplatform.domain.dto.WishDTO;
import com.maoyan.air.nb.toolplatform.domain.service.IWishService;
import java.lang.Integer;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class WishBiz {
  @Resource
  private IWishService wishService;

  /**
   * 新增操作
   */
  public int insert(WishDTO wishDto) {
    return wishService.insert(wishDto);
  }

  /**
   * 更新操作
   */
  public int update(WishDTO wishDto) {
    return wishService.update(wishDto);
  }

  /**
   * 获取总数
   */
  public int getCount(WishDTO wishDto) {
    return wishService.getCount(wishDto);
  }

  /**
   * 获取数据列表
   */
  public List<WishDTO> getList(WishDTO wishDto, Integer limit, Integer offset) {
    return wishService.getList(wishDto,limit,offset);
  }
}
