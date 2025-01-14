package com.entity.view;

import com.entity.WentishangbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问题上报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-19 15:10:36
 */
@TableName("wentishangbao")
public class WentishangbaoView  extends WentishangbaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WentishangbaoView(){
	}
 
 	public WentishangbaoView(WentishangbaoEntity wentishangbaoEntity){
 	try {
			BeanUtils.copyProperties(this, wentishangbaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
