package com.alinesno.infra.base.fileshow.service.impl;

import com.alinesno.infra.base.fileshow.entity.DocumentInfoEntity;
import com.alinesno.infra.base.fileshow.mapper.DocumentInfoMapper;
import com.alinesno.infra.base.fileshow.service.IApplicationService;
import com.alinesno.infra.base.fileshow.service.IDocumentInfoService;
import com.alinesno.infra.base.fileshow.service.IDocumentTypeService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Slf4j
@Service
public class DocumentInfoServiceImpl extends IBaseServiceImpl<DocumentInfoEntity, DocumentInfoMapper> implements IDocumentInfoService {

	@Autowired
	private IApplicationService applicationService ;

	@Autowired
	private IDocumentTypeService documentTypeService ;

	@Override
	public void saveDocument(DocumentInfoEntity documentInfoEntity) {

		String url = documentInfoEntity.getUrl() ;
		LambdaQueryWrapper<DocumentInfoEntity> wrapper = new LambdaQueryWrapper<>() ;
		wrapper.eq(DocumentInfoEntity::getUrl , url) ;

		DocumentInfoEntity e =  this.getOne(wrapper) ;
		if(e != null){
			e.setViewCount(e.getViewCount()+1);
			this.update(e) ;
			return ;
		}

		// TODO 文件上传到云存储服务

		this.save(documentInfoEntity) ;
	}

	@Override
	public boolean checkAccountService(String applicationId , String suffix) {

		// 1.判断是否开启这个查看类型
		boolean isOpenType = documentTypeService.isOpenType(suffix) ;
		if(!isOpenType){
			return false ;
		}

		// 2.判断应用是否包含这个类型
		List<String> typeList = applicationService.getDocumentType(applicationId) ;
		return typeList.contains(suffix) ;
	}
}
