package com.entity.vo;

import com.entity.JiaxiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 驾校信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
public class JiaxiaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 学费
	 */
	
	private String xuefei;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 驾校地址
	 */
	
	private String jiaxiaodizhi;
		
	/**
	 * 成立时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chenglishijian;
		
	/**
	 * 驾校简介
	 */
	
	private String jiaxiaojianjie;
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：学费
	 */
	 
	public void setXuefei(String xuefei) {
		this.xuefei = xuefei;
	}
	
	/**
	 * 获取：学费
	 */
	public String getXuefei() {
		return xuefei;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：驾校地址
	 */
	 
	public void setJiaxiaodizhi(String jiaxiaodizhi) {
		this.jiaxiaodizhi = jiaxiaodizhi;
	}
	
	/**
	 * 获取：驾校地址
	 */
	public String getJiaxiaodizhi() {
		return jiaxiaodizhi;
	}
				
	
	/**
	 * 设置：成立时间
	 */
	 
	public void setChenglishijian(Date chenglishijian) {
		this.chenglishijian = chenglishijian;
	}
	
	/**
	 * 获取：成立时间
	 */
	public Date getChenglishijian() {
		return chenglishijian;
	}
				
	
	/**
	 * 设置：驾校简介
	 */
	 
	public void setJiaxiaojianjie(String jiaxiaojianjie) {
		this.jiaxiaojianjie = jiaxiaojianjie;
	}
	
	/**
	 * 获取：驾校简介
	 */
	public String getJiaxiaojianjie() {
		return jiaxiaojianjie;
	}
			
}
