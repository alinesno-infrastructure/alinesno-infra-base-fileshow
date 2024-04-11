package com.alinesno.infra.base.fileshow.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;

/**
 * 文档类型
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("document_type")
public class DocumentTypeEntity extends InfraBaseEntity {

    /**
     * 类型名称
     */
    @ColumnType(length = 32)
    @ColumnComment("类型名称")
    private String typeName;

    /**
     * 图标
     */
    @ColumnType(length = 32)
    @ColumnComment("图标")
    private String icon;

    /**
     * 是否打开
     */
    @ColumnType(length = 1)
    @ColumnComment("是否打开")
    private Boolean isOpen;

    /**
     * 请求次数
     */
    @ColumnType(length = 11)
    @ColumnComment("请求次数")
    private Integer requestCount;

    /**
     * 是否限流
     */
    @ColumnType(length = 1)
    @ColumnComment("是否限流")
    private Boolean isRateLimited;
}
