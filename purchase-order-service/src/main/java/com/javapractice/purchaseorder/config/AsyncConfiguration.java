package com.javapractice.purchaseorder.config;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
public class AsyncConfiguration {

	@Bean("asyncTaskExecutor")
	public Executor asyncTaskExecutor() {
		
		ThreadPoolTaskExecutor taskExecutor = 
				new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);
		taskExecutor.setQueueCapacity(200);
		taskExecutor.setMaxPoolSize(5);
		taskExecutor.setThreadNamePrefix("AsyncTaskThread-");
		
		taskExecutor.initialize();
		
		return taskExecutor;
	}
}
