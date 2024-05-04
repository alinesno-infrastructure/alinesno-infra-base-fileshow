package com.alinesno.infra.base.fileshow.service.impl;

import com.alinesno.infra.base.fileshow.entity.ProjectEntity;
import com.alinesno.infra.base.fileshow.enums.DocumentTypeEnum;
import com.alinesno.infra.base.fileshow.mapper.ProjectMapper;
import com.alinesno.infra.base.fileshow.service.IProjectService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.common.facade.enums.HasStatusEnums;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.sqids.Sqids;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class ProjectServiceImpl extends IBaseServiceImpl<ProjectEntity, ProjectMapper> implements IProjectService {

    private static final String DEFAULT_PROJECT_FIELD = "default" ;

    /**
     * 获取支持的类型
     * @param appCode
     * @return
     */
    @Override
    public List<String> getDocumentType(String appCode) {

        ProjectEntity e = getOne(new LambdaQueryWrapper<ProjectEntity>().eq(ProjectEntity::getProjectCode , appCode)) ;

        if(e.getHasStatus() == HasStatusEnums.ILLEGAL.value){
            return List.of();
        }

        String documentStr = e.getDocumentType() ;

        return Arrays.asList(documentStr.split(","));
    }

    @Override
    public void saveDocumentType(String projectId, String documentStr) {

        ProjectEntity e = getById(projectId) ;
        e.setDocumentType(documentStr);

    }

    @Override
    public void initDefaultApp(long userId) {

        Sqids sqids=Sqids.builder().build();
        String code = sqids.encode(Arrays.asList(1L,2L,3L)); // "86Rf07"

       ProjectEntity project = new ProjectEntity() ;

        project.setOperatorId(userId);
        project.setFieldProp(DEFAULT_PROJECT_FIELD);

        project.setProjectName("默认文档应用");
        project.setProjectDesc("包含所有的文档查看权限，用于开发和验证场景");
        project.setProjectCode(code);
        project.setDocumentType(DocumentTypeEnum.getAllNameStr());

       save(project) ;
    }

    @Override
    public ProjectEntity getDefaultProject(long userId) {
        return getOne(new LambdaQueryWrapper<ProjectEntity>()
                .eq(ProjectEntity::getFieldProp , DEFAULT_PROJECT_FIELD)
                .eq(ProjectEntity::getOperatorId , userId));
    }

}
