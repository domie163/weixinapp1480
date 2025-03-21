package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiaxiaokaoshiEntity;
import com.entity.view.JiaxiaokaoshiView;

import com.service.JiaxiaokaoshiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 驾校考试
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
@RestController
@RequestMapping("/jiaxiaokaoshi")
public class JiaxiaokaoshiController {
    @Autowired
    private JiaxiaokaoshiService jiaxiaokaoshiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaxiaokaoshiEntity jiaxiaokaoshi,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date fabushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date fabushijianend,
		HttpServletRequest request){
        EntityWrapper<JiaxiaokaoshiEntity> ew = new EntityWrapper<JiaxiaokaoshiEntity>();
                if(fabushijianstart!=null) ew.ge("fabushijian", fabushijianstart);
                if(fabushijianend!=null) ew.le("fabushijian", fabushijianend);
		PageUtils page = jiaxiaokaoshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaxiaokaoshi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaxiaokaoshiEntity jiaxiaokaoshi, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date fabushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date fabushijianend,
		HttpServletRequest request){
        EntityWrapper<JiaxiaokaoshiEntity> ew = new EntityWrapper<JiaxiaokaoshiEntity>();
                if(fabushijianstart!=null) ew.ge("fabushijian", fabushijianstart);
                if(fabushijianend!=null) ew.le("fabushijian", fabushijianend);
		PageUtils page = jiaxiaokaoshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaxiaokaoshi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaxiaokaoshiEntity jiaxiaokaoshi){
       	EntityWrapper<JiaxiaokaoshiEntity> ew = new EntityWrapper<JiaxiaokaoshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaxiaokaoshi, "jiaxiaokaoshi")); 
        return R.ok().put("data", jiaxiaokaoshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaxiaokaoshiEntity jiaxiaokaoshi){
        EntityWrapper< JiaxiaokaoshiEntity> ew = new EntityWrapper< JiaxiaokaoshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaxiaokaoshi, "jiaxiaokaoshi")); 
		JiaxiaokaoshiView jiaxiaokaoshiView =  jiaxiaokaoshiService.selectView(ew);
		return R.ok("查询驾校考试成功").put("data", jiaxiaokaoshiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaxiaokaoshiEntity jiaxiaokaoshi = jiaxiaokaoshiService.selectById(id);
        return R.ok().put("data", jiaxiaokaoshi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaxiaokaoshiEntity jiaxiaokaoshi = jiaxiaokaoshiService.selectById(id);
        return R.ok().put("data", jiaxiaokaoshi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaxiaokaoshiEntity jiaxiaokaoshi, HttpServletRequest request){
    	jiaxiaokaoshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaxiaokaoshi);
        jiaxiaokaoshiService.insert(jiaxiaokaoshi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaxiaokaoshiEntity jiaxiaokaoshi, HttpServletRequest request){
    	jiaxiaokaoshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaxiaokaoshi);
        jiaxiaokaoshiService.insert(jiaxiaokaoshi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiaxiaokaoshiEntity jiaxiaokaoshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaxiaokaoshi);
        jiaxiaokaoshiService.updateById(jiaxiaokaoshi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaxiaokaoshiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiaxiaokaoshiEntity> wrapper = new EntityWrapper<JiaxiaokaoshiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jiaxiaokaoshiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
