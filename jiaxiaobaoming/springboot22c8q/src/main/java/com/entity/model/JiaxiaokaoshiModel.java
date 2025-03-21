package com.entity.model;

import com.entity.JiaxiaokaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 驾校考试
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
public class JiaxiaokaoshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 考试类型
	 */
	
	private String kaoshileixing;
		
	/**
	 * 报名须知
	 */
	
	private String baomingxuzhi;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 其他说明
	 */
	
	private String qitashuoming;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：考试类型
	 */
	 
	public void setKaoshileixing(String kaoshileixing) {
		this.kaoshileixing = kaoshileixing;
	}
	
	/**
	 * 获取：考试类型
	 */
	public String getKaoshileixing() {
		return kaoshileixing;
	}
				
	
	/**
	 * 设置：报名须知
	 */
	 
	public void setBaomingxuzhi(String baomingxuzhi) {
		this.baomingxuzhi = baomingxuzhi;
	}
	
	/**
	 * 获取：报名须知
	 */
	public String getBaomingxuzhi() {
		return baomingxuzhi;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：其他说明
	 */
	 
	public void setQitashuoming(String qitashuoming) {
		this.qitashuoming = qitashuoming;
	}
	
	/**
	 * 获取：其他说明
	 */
	public String getQitashuoming() {
		return qitashuoming;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
