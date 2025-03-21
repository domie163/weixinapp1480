package com.dao;

import com.entity.JiaxiaobaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaxiaobaomingVO;
import com.entity.view.JiaxiaobaomingView;


/**
 * 驾校报名
 * 
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
public interface JiaxiaobaomingDao extends BaseMapper<JiaxiaobaomingEntity> {
	
	List<JiaxiaobaomingVO> selectListVO(@Param("ew") Wrapper<JiaxiaobaomingEntity> wrapper);
	
	JiaxiaobaomingVO selectVO(@Param("ew") Wrapper<JiaxiaobaomingEntity> wrapper);
	
	List<JiaxiaobaomingView> selectListView(@Param("ew") Wrapper<JiaxiaobaomingEntity> wrapper);

	List<JiaxiaobaomingView> selectListView(Pagination page,@Param("ew") Wrapper<JiaxiaobaomingEntity> wrapper);
	
	JiaxiaobaomingView selectView(@Param("ew") Wrapper<JiaxiaobaomingEntity> wrapper);
	

}
