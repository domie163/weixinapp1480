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


import com.dao.YuyuejiaolianDao;
import com.entity.YuyuejiaolianEntity;
import com.service.YuyuejiaolianService;
import com.entity.vo.YuyuejiaolianVO;
import com.entity.view.YuyuejiaolianView;

@Service("yuyuejiaolianService")
public class YuyuejiaolianServiceImpl extends ServiceImpl<YuyuejiaolianDao, YuyuejiaolianEntity> implements YuyuejiaolianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyuejiaolianEntity> page = this.selectPage(
                new Query<YuyuejiaolianEntity>(params).getPage(),
                new EntityWrapper<YuyuejiaolianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyuejiaolianEntity> wrapper) {
		  Page<YuyuejiaolianView> page =new Query<YuyuejiaolianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuyuejiaolianVO> selectListVO(Wrapper<YuyuejiaolianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyuejiaolianVO selectVO(Wrapper<YuyuejiaolianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyuejiaolianView> selectListView(Wrapper<YuyuejiaolianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyuejiaolianView selectView(Wrapper<YuyuejiaolianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
