package com.ysj.scan_demo;

import com.ysj.scan_demo.annotation.MyAnnotation;
import com.ysj.scan_demo.inter.DInterface;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Configuration(proxyBeanMethods = false)
//@ComponentScan(basePackages = {"com.ysj.scan_demo.inter"})
//@ComponentScan(basePackages = {"com.ysj.scan_demo"})
//		includeFilters = {@ComponentScan.Filter(type= FilterType.ANNOTATION,value= MyAnnotation.class)})
////@ImportResource("application.xml")
//@PropertySources(value = {@PropertySource("classpath:456.properties"),})
//@PropertySource(value = {"classpath:123.properties"})
//@Import({B.class})
public class MyConfig{

	/*@Component
//	@Import(MyConfig.class)
	class InnerClass{

	}*/

	/*@Bean
	public B b(){
		return new B();
	}
	@Bean
	public C getC(){
		 b();
		 return new C();
	}
	@Bean
	public D getD(){
		return new D(b());
	}*/

}
