package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 驾校考试
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
@TableName("jiaxiaokaoshi")
public class JiaxiaokaoshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaxiaokaoshiEntity() {
		
	}
	
	public JiaxiaokaoshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 考试科目
	 */
					
	private String kaoshikemu;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：考试科目
	 */
	public void setKaoshikemu(String kaoshikemu) {
		this.kaoshikemu = kaoshikemu;
	}
	/**
	 * 获取：考试科目
	 */
	public String getKaoshikemu() {
		return kaoshikemu;
	}
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
