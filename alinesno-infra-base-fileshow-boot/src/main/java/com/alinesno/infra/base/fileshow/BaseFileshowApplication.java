package com.alinesno.infra.base.fileshow;

import com.alinesno.infra.common.facade.enable.EnableActable;
import com.alinesno.infra.common.web.adapter.sso.enable.EnableInfraSsoApi;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 集成一个Java开发示例工具
 * @author LuoAnDong
 * @since 2023年8月3日 上午6:23:43
 */
@EnableScheduling
@EnableActable
@EnableInfraSsoApi
@MapperScan("com.alinesno.infra.base.fileshow.mapper")
@SpringBootApplication
public class BaseFileshowApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseFileshowApplication.class, args);
	}

}
