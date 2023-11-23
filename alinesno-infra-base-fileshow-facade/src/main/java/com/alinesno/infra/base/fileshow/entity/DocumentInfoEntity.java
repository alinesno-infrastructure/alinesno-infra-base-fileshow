package com.alinesno.infra.base.fileshow.entity;

import java.util.Date;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;


/**
 * <p>
 *
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Data
@TableName("document_info")
public class DocumentInfoEntity extends InfraBaseEntity {
	/**
	 * 文档标题
	 */
	@ColumnType(length = 255)
	@ColumnComment("文档标题")
	@TableField("title")
	private String title;

	/**
	 * 文档格式('Word', 'Office', 'Excel', 'PPT', '其他')
	 */
	@ColumnType(length = 6)
	@ColumnComment("文档格式('Word', 'Office', 'Excel', 'PPT', '其他')")
	@TableField("format")
	private String format;

	/**
	 * 上传时间
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("上传时间")
	@TableField("upload_time")
	private Date uploadTime;

	/**
	 * 查看次数
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("查看次数")
	@TableField("view_count")
	private Long viewCount;

	/**
	 * 打印次数
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("打印次数")
	@TableField("print_count")
	private Long printCount;


}
