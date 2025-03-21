package com.dao;

import com.entity.JiaxiaokaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaxiaokaoshiVO;
import com.entity.view.JiaxiaokaoshiView;


/**
 * 驾校考试
 * 
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
public interface JiaxiaokaoshiDao extends BaseMapper<JiaxiaokaoshiEntity> {
	
	List<JiaxiaokaoshiVO> selectListVO(@Param("ew") Wrapper<JiaxiaokaoshiEntity> wrapper);
	
	JiaxiaokaoshiVO selectVO(@Param("ew") Wrapper<JiaxiaokaoshiEntity> wrapper);
	
	List<JiaxiaokaoshiView> selectListView(@Param("ew") Wrapper<JiaxiaokaoshiEntity> wrapper);

	List<JiaxiaokaoshiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaxiaokaoshiEntity> wrapper);
	
	JiaxiaokaoshiView selectView(@Param("ew") Wrapper<JiaxiaokaoshiEntity> wrapper);
	

}
