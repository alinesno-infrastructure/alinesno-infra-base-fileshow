package com.alinesno.infra.base.fileshow.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.base.fileshow.entity.DocumentContentEntity;
import com.alinesno.infra.base.fileshow.mapper.DocumentContentMapper;
import com.alinesno.infra.base.fileshow.service.IDocumentContentService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Service
public class DocumentContentServiceImpl extends IBaseServiceImpl<DocumentContentEntity, DocumentContentMapper> implements IDocumentContentService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(DocumentContentServiceImpl.class);

}
