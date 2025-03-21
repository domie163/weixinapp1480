package com.entity.view;

import com.entity.JiaxiaokaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 驾校考试
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
@TableName("jiaxiaokaoshi")
public class JiaxiaokaoshiView  extends JiaxiaokaoshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaxiaokaoshiView(){
	}
 
 	public JiaxiaokaoshiView(JiaxiaokaoshiEntity jiaxiaokaoshiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaxiaokaoshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
