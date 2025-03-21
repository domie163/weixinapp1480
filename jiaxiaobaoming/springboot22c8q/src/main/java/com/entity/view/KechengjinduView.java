package com.entity.view;

import com.entity.KechengjinduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程进度
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
@TableName("kechengjindu")
public class KechengjinduView  extends KechengjinduEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengjinduView(){
	}
 
 	public KechengjinduView(KechengjinduEntity kechengjinduEntity){
 	try {
			BeanUtils.copyProperties(this, kechengjinduEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
