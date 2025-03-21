package com.dao;

import com.entity.YuyuejiaolianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyuejiaolianVO;
import com.entity.view.YuyuejiaolianView;


/**
 * 预约教练
 * 
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
public interface YuyuejiaolianDao extends BaseMapper<YuyuejiaolianEntity> {
	
	List<YuyuejiaolianVO> selectListVO(@Param("ew") Wrapper<YuyuejiaolianEntity> wrapper);
	
	YuyuejiaolianVO selectVO(@Param("ew") Wrapper<YuyuejiaolianEntity> wrapper);
	
	List<YuyuejiaolianView> selectListView(@Param("ew") Wrapper<YuyuejiaolianEntity> wrapper);

	List<YuyuejiaolianView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuejiaolianEntity> wrapper);
	
	YuyuejiaolianView selectView(@Param("ew") Wrapper<YuyuejiaolianEntity> wrapper);
	

}
