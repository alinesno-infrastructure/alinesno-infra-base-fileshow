package com.alinesno.infra.base.fileshow.service.impl;

import com.alinesno.infra.base.fileshow.entity.ApplicationEntity;
import com.alinesno.infra.base.fileshow.mapper.ApplicationMapper;
import com.alinesno.infra.base.fileshow.service.IApplicationService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class ApplicationServiceImpl extends IBaseServiceImpl<ApplicationEntity, ApplicationMapper> implements IApplicationService {

    /**
     * 获取支持的类型
     * @param applicationId
     * @return
     */
    @Override
    public List<String> getDocumentType(String applicationId) {

        ApplicationEntity e = getById(applicationId) ;
        String documentStr = e.getDocumentType() ;

        return Arrays.asList(documentStr.split(","));
    }

    @Override
    public void saveDocumentType(String applicationId, String documentStr) {

        ApplicationEntity e = getById(applicationId) ;
        e.setDocumentType(documentStr);

    }

}
