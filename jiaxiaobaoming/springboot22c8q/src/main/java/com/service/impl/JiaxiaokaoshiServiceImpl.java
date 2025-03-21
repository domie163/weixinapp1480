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


import com.dao.JiaxiaokaoshiDao;
import com.entity.JiaxiaokaoshiEntity;
import com.service.JiaxiaokaoshiService;
import com.entity.vo.JiaxiaokaoshiVO;
import com.entity.view.JiaxiaokaoshiView;

@Service("jiaxiaokaoshiService")
public class JiaxiaokaoshiServiceImpl extends ServiceImpl<JiaxiaokaoshiDao, JiaxiaokaoshiEntity> implements JiaxiaokaoshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaxiaokaoshiEntity> page = this.selectPage(
                new Query<JiaxiaokaoshiEntity>(params).getPage(),
                new EntityWrapper<JiaxiaokaoshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaxiaokaoshiEntity> wrapper) {
		  Page<JiaxiaokaoshiView> page =new Query<JiaxiaokaoshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaxiaokaoshiVO> selectListVO(Wrapper<JiaxiaokaoshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaxiaokaoshiVO selectVO(Wrapper<JiaxiaokaoshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaxiaokaoshiView> selectListView(Wrapper<JiaxiaokaoshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaxiaokaoshiView selectView(Wrapper<JiaxiaokaoshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
