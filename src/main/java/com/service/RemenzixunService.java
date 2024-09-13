package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RemenzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RemenzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RemenzixunView;


/**
 * 热门资讯
 *
 * @author 
 * @email 
 * @date 2021-01-08 09:35:54
 */
public interface RemenzixunService extends IService<RemenzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RemenzixunVO> selectListVO(Wrapper<RemenzixunEntity> wrapper);
   	
   	RemenzixunVO selectVO(@Param("ew") Wrapper<RemenzixunEntity> wrapper);
   	
   	List<RemenzixunView> selectListView(Wrapper<RemenzixunEntity> wrapper);
   	
   	RemenzixunView selectView(@Param("ew") Wrapper<RemenzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RemenzixunEntity> wrapper);
   	
}

