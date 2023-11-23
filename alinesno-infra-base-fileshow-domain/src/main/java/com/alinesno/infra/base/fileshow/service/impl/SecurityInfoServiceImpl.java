package com.alinesno.infra.base.fileshow.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.base.fileshow.entity.SecurityInfoEntity;
import com.alinesno.infra.base.fileshow.mapper.SecurityInfoMapper;
import com.alinesno.infra.base.fileshow.service.ISecurityInfoService;
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
public class SecurityInfoServiceImpl extends IBaseServiceImpl<SecurityInfoEntity, SecurityInfoMapper> implements ISecurityInfoService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(SecurityInfoServiceImpl.class);

}
