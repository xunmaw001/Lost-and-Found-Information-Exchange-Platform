package com.entity.view;

import com.entity.ShiwurenlingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 失物认领
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 20:23:12
 */
@TableName("shiwurenling")
public class ShiwurenlingView  extends ShiwurenlingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiwurenlingView(){
	}
 
 	public ShiwurenlingView(ShiwurenlingEntity shiwurenlingEntity){
 	try {
			BeanUtils.copyProperties(this, shiwurenlingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
