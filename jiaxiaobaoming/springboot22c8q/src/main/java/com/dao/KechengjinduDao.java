package com.dao;

import com.entity.KechengjinduEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengjinduVO;
import com.entity.view.KechengjinduView;


/**
 * 课程进度
 * 
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
public interface KechengjinduDao extends BaseMapper<KechengjinduEntity> {
	
	List<KechengjinduVO> selectListVO(@Param("ew") Wrapper<KechengjinduEntity> wrapper);
	
	KechengjinduVO selectVO(@Param("ew") Wrapper<KechengjinduEntity> wrapper);
	
	List<KechengjinduView> selectListView(@Param("ew") Wrapper<KechengjinduEntity> wrapper);

	List<KechengjinduView> selectListView(Pagination page,@Param("ew") Wrapper<KechengjinduEntity> wrapper);
	
	KechengjinduView selectView(@Param("ew") Wrapper<KechengjinduEntity> wrapper);
	

}
