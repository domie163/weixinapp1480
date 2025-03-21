package com.entity.view;

import com.entity.CheliangyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车辆预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-04 16:42:01
 */
@TableName("cheliangyuyue")
public class CheliangyuyueView  extends CheliangyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheliangyuyueView(){
	}
 
 	public CheliangyuyueView(CheliangyuyueEntity cheliangyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, cheliangyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
