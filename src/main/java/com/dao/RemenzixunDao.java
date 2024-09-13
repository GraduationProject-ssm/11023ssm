package com.dao;

import com.entity.RemenzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RemenzixunVO;
import com.entity.view.RemenzixunView;


/**
 * 热门资讯
 * 
 * @author 
 * @email 
 * @date 2021-01-08 09:35:54
 */
public interface RemenzixunDao extends BaseMapper<RemenzixunEntity> {
	
	List<RemenzixunVO> selectListVO(@Param("ew") Wrapper<RemenzixunEntity> wrapper);
	
	RemenzixunVO selectVO(@Param("ew") Wrapper<RemenzixunEntity> wrapper);
	
	List<RemenzixunView> selectListView(@Param("ew") Wrapper<RemenzixunEntity> wrapper);

	List<RemenzixunView> selectListView(Pagination page,@Param("ew") Wrapper<RemenzixunEntity> wrapper);
	
	RemenzixunView selectView(@Param("ew") Wrapper<RemenzixunEntity> wrapper);
	
}
