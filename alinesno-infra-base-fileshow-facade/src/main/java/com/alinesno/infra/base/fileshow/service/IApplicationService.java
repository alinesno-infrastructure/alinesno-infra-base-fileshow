package com.alinesno.infra.base.fileshow.service;

import com.alinesno.infra.base.fileshow.entity.ApplicationEntity;
import com.alinesno.infra.common.facade.services.IBaseService;

import java.util.List;

/**
 *
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
public interface IApplicationService extends IBaseService<ApplicationEntity> {

    /**
     * 获取当前应用支持的文档类型
     * @param applicationId
     * @return
     */
    List<String> getDocumentType(String applicationId);

    /**
     * 保存应用文档类型
      * @param documentStr
     */
    void saveDocumentType(String applicationId , String documentStr) ;

}
