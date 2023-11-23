package com.alinesno.infra.base.fileshow.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.base.fileshow.entity.SearchRecordsEntity;
import com.alinesno.infra.base.fileshow.mapper.SearchRecordsMapper;
import com.alinesno.infra.base.fileshow.service.ISearchRecordsService;
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
public class SearchRecordsServiceImpl extends IBaseServiceImpl<SearchRecordsEntity, SearchRecordsMapper> implements ISearchRecordsService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(SearchRecordsServiceImpl.class);

}
