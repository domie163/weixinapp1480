package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyuejiaolianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyuejiaolianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyuejiaolianView;


/**
 * 预约教练
 *
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
public interface YuyuejiaolianService extends IService<YuyuejiaolianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyuejiaolianVO> selectListVO(Wrapper<YuyuejiaolianEntity> wrapper);
   	
   	YuyuejiaolianVO selectVO(@Param("ew") Wrapper<YuyuejiaolianEntity> wrapper);
   	
   	List<YuyuejiaolianView> selectListView(Wrapper<YuyuejiaolianEntity> wrapper);
   	
   	YuyuejiaolianView selectView(@Param("ew") Wrapper<YuyuejiaolianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyuejiaolianEntity> wrapper);
   	

}

