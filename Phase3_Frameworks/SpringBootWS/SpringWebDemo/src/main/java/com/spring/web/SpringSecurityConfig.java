package com.spring.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

//@Configuration
//@EnableWebSecurity
public class SpringSecurityConfig{
	//extends WebSecurityConfigurerAdapter {
}
//
//	// authentication
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//		.withUser("user")
//		.password(passwordEncoder().encode("user")).roles("USER")
//		.and()
//		.withUser("shalini")
//		.password(passwordEncoder().encode("shalini")).roles("USER")
//		.and()
//		.withUser("admin")
//		.password(passwordEncoder().encode("admin")).roles("ADMIN");
//	}
//	@Bean
//	 PasswordEncoder passwordEncoder()
//	{
//		return new BCryptPasswordEncoder();
//	}
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/h2-console/**",
//				"/v2/api-docs",
//				"/swagger-resources",
//				"/swagger-resources/**",
//				"/configuration/ui",
//				"/configuration/security",
//				"/swagger-ui.html","/swagger-ui.html/**",
//				"/webjars/**","/v2/swagger.json",
//				"/v3/api-docs/**","/swagger-ui/**");
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//		.antMatchers("/books").permitAll()
//		.antMatchers(HttpMethod.GET,"/books/**").hasAnyRole("USER","ADMIN")
//		.antMatchers("/rest/**").hasAnyRole("ADMIN")
//		.anyRequest().authenticated()
//		.and().formLogin().and().logout();
//		
//	}
//}
//
