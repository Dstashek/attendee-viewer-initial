package io.rscale.training.attendeeviewer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.security.oauth.spring-security-oauth;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders;


@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableEurekaClient
@EnableCircuitBreaker
@EnableOAuth2Sso
public class AttendeeViewerApplication extends WebSecurityConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(AttendeeViewerApplication.class, args);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http.authorizeRequests()
	        .antMatchers("/login").permitAll()
	        .anyRequest().authenticated();
	}
	

}
