package com.alinesno.infra.base.fileshow.api.controller;

import com.alinesno.infra.base.fileshow.entity.ApplicationEntity;
import com.alinesno.infra.base.fileshow.service.IApplicationService;
import com.alinesno.infra.common.core.constants.SpringInstanceScope;
import com.alinesno.infra.common.facade.pageable.DatatablesPageBean;
import com.alinesno.infra.common.facade.pageable.TableDataInfo;
import com.alinesno.infra.common.web.adapter.rest.BaseController;
import io.swagger.annotations.Api;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 处理与ApplicationEntity相关的请求的Controller。
 * 继承自BaseController类并实现IApplicationService接口。
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Slf4j
@Api(tags = "Application")
@RestController
@Scope(SpringInstanceScope.PROTOTYPE)
@RequestMapping("/api/infra/base/fileshow/application")
public class ApplicationController extends BaseController<ApplicationEntity, IApplicationService> {

    @Autowired
    private IApplicationService service;

    /**
     * 获取ApplicationEntity的DataTables数据。
     *
     * @param request HttpServletRequest对象。
     * @param model   Model对象。
     * @param page    DatatablesPageBean对象。
     * @return 包含DataTables数据的TableDataInfo对象。
     */
    @ResponseBody
    @PostMapping("/datatables")
    public TableDataInfo datatables(HttpServletRequest request, Model model, DatatablesPageBean page) {
        log.debug("page = {}", ToStringBuilder.reflectionToString(page));
        return this.toPage(model, this.getFeign(), page);
    }

    /**
     * 保存文件类型
     * @param applicationId
     * @param documentStr
     */
    @PostMapping("/saveDocumentType")
    public void saveDocumentType(@Validated @RequestParam String applicationId,
                                 @Validated @RequestBody String documentStr) {
        // 在这里调用您的 saveDocumentType 方法，传入 applicationId 和 documentStr
        service.saveDocumentType(applicationId, documentStr);
    }


    @Override
    public IApplicationService getFeign() {
        return this.service;
    }
}
