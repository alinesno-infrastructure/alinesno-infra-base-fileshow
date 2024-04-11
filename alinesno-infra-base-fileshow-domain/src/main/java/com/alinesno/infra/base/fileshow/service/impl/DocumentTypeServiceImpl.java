package com.alinesno.infra.base.fileshow.service.impl;

import com.alinesno.infra.base.fileshow.entity.DocumentInfoEntity;
import com.alinesno.infra.base.fileshow.entity.DocumentTypeEntity;
import com.alinesno.infra.base.fileshow.mapper.DocumentInfoMapper;
import com.alinesno.infra.base.fileshow.mapper.DocumentTypeMapper;
import com.alinesno.infra.base.fileshow.service.IDocumentInfoService;
import com.alinesno.infra.base.fileshow.service.IDocumentTypeService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

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
public class DocumentTypeServiceImpl extends IBaseServiceImpl<DocumentTypeEntity, DocumentTypeMapper> implements IDocumentTypeService {

}
