package com.alinesno.infra.base.fileshow.service;

import com.alinesno.infra.base.fileshow.entity.DocumentInfoEntity;
import com.alinesno.infra.common.facade.services.IBaseService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */

public interface IDocumentInfoService extends IBaseService<DocumentInfoEntity> {

    /**
     * 保存文件
     * @param documentInfoEntity
     */
    void saveDocument(DocumentInfoEntity documentInfoEntity);

    /**
     * 判断账号是否开通服务
     * @param applicationId
     * @return
     */
    boolean checkAccountService(String applicationId , String suffix);

}
