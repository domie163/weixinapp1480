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

import com.entity.KaoshibaomingEntity;
import com.entity.view.KaoshibaomingView;

import com.service.KaoshibaomingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 考试报名
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
@RestController
@RequestMapping("/kaoshibaoming")
public class KaoshibaomingController {
    @Autowired
    private KaoshibaomingService kaoshibaomingService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KaoshibaomingEntity kaoshibaoming,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date yuyueshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date yuyueshijianend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			kaoshibaoming.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KaoshibaomingEntity> ew = new EntityWrapper<KaoshibaomingEntity>();
                if(yuyueshijianstart!=null) ew.ge("yuyueshijian", yuyueshijianstart);
                if(yuyueshijianend!=null) ew.le("yuyueshijian", yuyueshijianend);
		PageUtils page = kaoshibaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoshibaoming), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KaoshibaomingEntity kaoshibaoming, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date yuyueshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date yuyueshijianend,
		HttpServletRequest request){
        EntityWrapper<KaoshibaomingEntity> ew = new EntityWrapper<KaoshibaomingEntity>();
                if(yuyueshijianstart!=null) ew.ge("yuyueshijian", yuyueshijianstart);
                if(yuyueshijianend!=null) ew.le("yuyueshijian", yuyueshijianend);
		PageUtils page = kaoshibaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoshibaoming), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KaoshibaomingEntity kaoshibaoming){
       	EntityWrapper<KaoshibaomingEntity> ew = new EntityWrapper<KaoshibaomingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kaoshibaoming, "kaoshibaoming")); 
        return R.ok().put("data", kaoshibaomingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KaoshibaomingEntity kaoshibaoming){
        EntityWrapper< KaoshibaomingEntity> ew = new EntityWrapper< KaoshibaomingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kaoshibaoming, "kaoshibaoming")); 
		KaoshibaomingView kaoshibaomingView =  kaoshibaomingService.selectView(ew);
		return R.ok("查询考试报名成功").put("data", kaoshibaomingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KaoshibaomingEntity kaoshibaoming = kaoshibaomingService.selectById(id);
        return R.ok().put("data", kaoshibaoming);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KaoshibaomingEntity kaoshibaoming = kaoshibaomingService.selectById(id);
        return R.ok().put("data", kaoshibaoming);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KaoshibaomingEntity kaoshibaoming, HttpServletRequest request){
    	kaoshibaoming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaoshibaoming);
        kaoshibaomingService.insert(kaoshibaoming);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KaoshibaomingEntity kaoshibaoming, HttpServletRequest request){
    	kaoshibaoming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaoshibaoming);
        kaoshibaomingService.insert(kaoshibaoming);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody KaoshibaomingEntity kaoshibaoming, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kaoshibaoming);
        kaoshibaomingService.updateById(kaoshibaoming);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kaoshibaomingService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<KaoshibaomingEntity> wrapper = new EntityWrapper<KaoshibaomingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = kaoshibaomingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
