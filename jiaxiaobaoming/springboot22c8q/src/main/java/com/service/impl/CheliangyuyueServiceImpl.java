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


import com.dao.CheliangyuyueDao;
import com.entity.CheliangyuyueEntity;
import com.service.CheliangyuyueService;
import com.entity.vo.CheliangyuyueVO;
import com.entity.view.CheliangyuyueView;

@Service("cheliangyuyueService")
public class CheliangyuyueServiceImpl extends ServiceImpl<CheliangyuyueDao, CheliangyuyueEntity> implements CheliangyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangyuyueEntity> page = this.selectPage(
                new Query<CheliangyuyueEntity>(params).getPage(),
                new EntityWrapper<CheliangyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangyuyueEntity> wrapper) {
		  Page<CheliangyuyueView> page =new Query<CheliangyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangyuyueVO> selectListVO(Wrapper<CheliangyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangyuyueVO selectVO(Wrapper<CheliangyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangyuyueView> selectListView(Wrapper<CheliangyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangyuyueView selectView(Wrapper<CheliangyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
