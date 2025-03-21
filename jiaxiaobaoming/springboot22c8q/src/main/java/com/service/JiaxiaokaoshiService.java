package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaxiaokaoshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaxiaokaoshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaxiaokaoshiView;


/**
 * 驾校考试
 *
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
public interface JiaxiaokaoshiService extends IService<JiaxiaokaoshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaxiaokaoshiVO> selectListVO(Wrapper<JiaxiaokaoshiEntity> wrapper);
   	
   	JiaxiaokaoshiVO selectVO(@Param("ew") Wrapper<JiaxiaokaoshiEntity> wrapper);
   	
   	List<JiaxiaokaoshiView> selectListView(Wrapper<JiaxiaokaoshiEntity> wrapper);
   	
   	JiaxiaokaoshiView selectView(@Param("ew") Wrapper<JiaxiaokaoshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaxiaokaoshiEntity> wrapper);
   	

}

