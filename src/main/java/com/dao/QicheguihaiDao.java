package com.dao;

import com.entity.QicheguihaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QicheguihaiVO;
import com.entity.view.QicheguihaiView;


/**
 * 汽车归还
 * 
 * @author 
 * @email 
 * @date 2020-10-19 15:10:36
 */
public interface QicheguihaiDao extends BaseMapper<QicheguihaiEntity> {
	
	List<QicheguihaiVO> selectListVO(@Param("ew") Wrapper<QicheguihaiEntity> wrapper);
	
	QicheguihaiVO selectVO(@Param("ew") Wrapper<QicheguihaiEntity> wrapper);
	
	List<QicheguihaiView> selectListView(@Param("ew") Wrapper<QicheguihaiEntity> wrapper);

	List<QicheguihaiView> selectListView(Pagination page,@Param("ew") Wrapper<QicheguihaiEntity> wrapper);
	
	QicheguihaiView selectView(@Param("ew") Wrapper<QicheguihaiEntity> wrapper);
	
}
