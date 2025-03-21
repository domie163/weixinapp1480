package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaxiaobaomingDao;
import com.entity.JiaxiaobaomingEntity;
import com.service.JiaxiaobaomingService;
import com.entity.vo.JiaxiaobaomingVO;
import com.entity.view.JiaxiaobaomingView;

@Service("jiaxiaobaomingService")
public class JiaxiaobaomingServiceImpl extends ServiceImpl<JiaxiaobaomingDao, JiaxiaobaomingEntity> implements JiaxiaobaomingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaxiaobaomingEntity> page = this.selectPage(
                new Query<JiaxiaobaomingEntity>(params).getPage(),
                new EntityWrapper<JiaxiaobaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaxiaobaomingEntity> wrapper) {
		  Page<JiaxiaobaomingView> page =new Query<JiaxiaobaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaxiaobaomingVO> selectListVO(Wrapper<JiaxiaobaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaxiaobaomingVO selectVO(Wrapper<JiaxiaobaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaxiaobaomingView> selectListView(Wrapper<JiaxiaobaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaxiaobaomingView selectView(Wrapper<JiaxiaobaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
