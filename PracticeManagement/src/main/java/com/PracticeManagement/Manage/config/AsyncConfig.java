package com.PracticeManagement.Manage.config;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.PracticeManagement.Manage.model.Doctor;

/**
 *	@see Doctor	
 *	@author Nguyễn Minh Trí
 *	
 */

@Configuration
@EnableAsync
public class AsyncConfig {
	/**
	 * Đây là phương thức cấu hình và quản lý các luồng
	 * @return thông tin cấu hình các luồng
	 */
	@Bean(name ="taskExecutor")
    public Executor taskExecutor(){
        ThreadPoolTaskExecutor executor=new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(100);
        executor.setThreadNamePrefix("userThread-");
        executor.initialize();
        return executor;
    }
}
