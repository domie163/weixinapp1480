package com.entity.vo;

import com.entity.JiaxiaokaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 驾校考试
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
public class JiaxiaokaoshiVO  implements Serializable {
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
