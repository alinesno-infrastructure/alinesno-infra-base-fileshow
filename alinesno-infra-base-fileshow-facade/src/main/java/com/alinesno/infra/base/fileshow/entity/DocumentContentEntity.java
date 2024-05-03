package com.alinesno.infra.base.fileshow.entity;

import java.util.Date;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * <p>
 *
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("document_content")
public class DocumentContentEntity extends InfraBaseEntity {
	/**
	 * 文档ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("文档ID")
	@TableField("document_id")
	private Long documentId;

	/**
	 * 文档内容
	 */
	@ColumnType(MySqlTypeConstant.MEDIUMTEXT)
	@ColumnComment("文档内容")
	@TableField("content")
	private String content;


}
