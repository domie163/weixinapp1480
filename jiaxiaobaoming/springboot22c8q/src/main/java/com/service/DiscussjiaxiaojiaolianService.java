package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiaxiaojiaolianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiaxiaojiaolianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiaxiaojiaolianView;


/**
 * 驾校教练评论表
 *
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
public interface DiscussjiaxiaojiaolianService extends IService<DiscussjiaxiaojiaolianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiaxiaojiaolianVO> selectListVO(Wrapper<DiscussjiaxiaojiaolianEntity> wrapper);
   	
   	DiscussjiaxiaojiaolianVO selectVO(@Param("ew") Wrapper<DiscussjiaxiaojiaolianEntity> wrapper);
   	
   	List<DiscussjiaxiaojiaolianView> selectListView(Wrapper<DiscussjiaxiaojiaolianEntity> wrapper);
   	
   	DiscussjiaxiaojiaolianView selectView(@Param("ew") Wrapper<DiscussjiaxiaojiaolianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiaxiaojiaolianEntity> wrapper);
   	

}

