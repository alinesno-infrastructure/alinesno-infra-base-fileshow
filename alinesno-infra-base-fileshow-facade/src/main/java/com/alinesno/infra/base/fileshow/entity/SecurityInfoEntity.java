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
@TableName("security_info")
public class SecurityInfoEntity extends InfraBaseEntity {
	/**
	 * 文档ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("文档ID")
	@TableField("document_id")
	private Long documentId;

	/**
	 * 加密方法('MD5', 'AES', '其他')
	 */
	@ColumnType(length = 6)
	@ColumnComment("加密方法('MD5', 'AES', '其他')")
	@TableField("encryption_method")
	private String encryptionMethod;

	/**
	 * 存储位置
	 */
	@ColumnType(length = 255)
	@ColumnComment("存储位置")
	@TableField("storage_location")
	private String storageLocation;

	/**
	 * 访问权限('授权', '未授权')
	 */
	@ColumnType(length = 6)
	@ColumnComment("访问权限('授权', '未授权')")
	@TableField("access_permission")
	private String accessPermission;

	/**
	 * 安全级别('低', '中', '高')
	 */
	@ColumnType(length = 6)
	@ColumnComment("安全级别('低', '中', '高')")
	@TableField("security_level")
	private String securityLevel;


}
