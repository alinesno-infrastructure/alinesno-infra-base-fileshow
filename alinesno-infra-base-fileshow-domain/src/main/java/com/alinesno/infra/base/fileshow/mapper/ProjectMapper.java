package com.alinesno.infra.base.fileshow.mapper;

import com.alinesno.infra.base.fileshow.entity.ProjectEntity;
import com.alinesno.infra.common.facade.mapper.repository.IBaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectMapper extends IBaseMapper<ProjectEntity> {
}
