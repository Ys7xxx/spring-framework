package com.ysj.scan_demo.inter;

import com.ysj.scan_demo.C;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public interface DInterface {

	@Bean
	public default C get(){
		return new C();
	}
}
