package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengjinduEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengjinduVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengjinduView;


/**
 * 课程进度
 *
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
public interface KechengjinduService extends IService<KechengjinduEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengjinduVO> selectListVO(Wrapper<KechengjinduEntity> wrapper);
   	
   	KechengjinduVO selectVO(@Param("ew") Wrapper<KechengjinduEntity> wrapper);
   	
   	List<KechengjinduView> selectListView(Wrapper<KechengjinduEntity> wrapper);
   	
   	KechengjinduView selectView(@Param("ew") Wrapper<KechengjinduEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengjinduEntity> wrapper);
   	

}

