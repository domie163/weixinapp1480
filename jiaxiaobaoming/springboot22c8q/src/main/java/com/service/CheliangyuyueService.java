package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangyuyueView;


/**
 * 车辆预约
 *
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
public interface CheliangyuyueService extends IService<CheliangyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangyuyueVO> selectListVO(Wrapper<CheliangyuyueEntity> wrapper);
   	
   	CheliangyuyueVO selectVO(@Param("ew") Wrapper<CheliangyuyueEntity> wrapper);
   	
   	List<CheliangyuyueView> selectListView(Wrapper<CheliangyuyueEntity> wrapper);
   	
   	CheliangyuyueView selectView(@Param("ew") Wrapper<CheliangyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangyuyueEntity> wrapper);
   	

}

