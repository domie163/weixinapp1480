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


import com.dao.KechengjinduDao;
import com.entity.KechengjinduEntity;
import com.service.KechengjinduService;
import com.entity.vo.KechengjinduVO;
import com.entity.view.KechengjinduView;

@Service("kechengjinduService")
public class KechengjinduServiceImpl extends ServiceImpl<KechengjinduDao, KechengjinduEntity> implements KechengjinduService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengjinduEntity> page = this.selectPage(
                new Query<KechengjinduEntity>(params).getPage(),
                new EntityWrapper<KechengjinduEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengjinduEntity> wrapper) {
		  Page<KechengjinduView> page =new Query<KechengjinduView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengjinduVO> selectListVO(Wrapper<KechengjinduEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengjinduVO selectVO(Wrapper<KechengjinduEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengjinduView> selectListView(Wrapper<KechengjinduEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengjinduView selectView(Wrapper<KechengjinduEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
