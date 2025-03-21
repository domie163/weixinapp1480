package com.dao;

import com.entity.CheliangyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangyuyueVO;
import com.entity.view.CheliangyuyueView;


/**
 * 车辆预约
 * 
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
public interface CheliangyuyueDao extends BaseMapper<CheliangyuyueEntity> {
	
	List<CheliangyuyueVO> selectListVO(@Param("ew") Wrapper<CheliangyuyueEntity> wrapper);
	
	CheliangyuyueVO selectVO(@Param("ew") Wrapper<CheliangyuyueEntity> wrapper);
	
	List<CheliangyuyueView> selectListView(@Param("ew") Wrapper<CheliangyuyueEntity> wrapper);

	List<CheliangyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangyuyueEntity> wrapper);
	
	CheliangyuyueView selectView(@Param("ew") Wrapper<CheliangyuyueEntity> wrapper);
	

}
