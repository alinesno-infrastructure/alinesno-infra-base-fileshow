package com.alinesno.infra.base.fileshow.service.impl;

import com.alinesno.infra.base.fileshow.entity.DocumentTypeEntity;
import com.alinesno.infra.base.fileshow.mapper.DocumentTypeMapper;
import com.alinesno.infra.base.fileshow.service.IDocumentTypeService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.extern.slf4j.Slf4j;
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

    @Override
    public boolean isOpenType(String suffix) {

        LambdaQueryWrapper<DocumentTypeEntity> wrapper = new LambdaQueryWrapper<>() ;
        wrapper.eq(DocumentTypeEntity::getIsOpen , true)
                .eq(DocumentTypeEntity::getTypeDesc , suffix) ;

        long count = count(wrapper) ;

        return count > 0 ;
    }
}
