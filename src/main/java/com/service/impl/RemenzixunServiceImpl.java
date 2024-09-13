package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.RemenzixunDao;
import com.entity.RemenzixunEntity;
import com.service.RemenzixunService;
import com.entity.vo.RemenzixunVO;
import com.entity.view.RemenzixunView;

@Service("remenzixunService")
public class RemenzixunServiceImpl extends ServiceImpl<RemenzixunDao, RemenzixunEntity> implements RemenzixunService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RemenzixunEntity> page = this.selectPage(
                new Query<RemenzixunEntity>(params).getPage(),
                new EntityWrapper<RemenzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RemenzixunEntity> wrapper) {
		  Page<RemenzixunView> page =new Query<RemenzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RemenzixunVO> selectListVO(Wrapper<RemenzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RemenzixunVO selectVO(Wrapper<RemenzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RemenzixunView> selectListView(Wrapper<RemenzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RemenzixunView selectView(Wrapper<RemenzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
