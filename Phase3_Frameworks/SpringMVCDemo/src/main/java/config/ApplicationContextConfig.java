package config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.vodafone")
@PropertySource("classpath:dbconfig.properties")
public class ApplicationContextConfig {

	@Bean(name = "viewResolver")
	public InternalResourceViewResolver getViewResolver() {
	    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	    viewResolver.setPrefix("/WEB-INF/views/");
	    viewResolver.setSuffix(".jsp");
	    return viewResolver;
	}
	
	@Value("${mysqldriver}")
	private String driver;
	@Value("${mysqlurl}")
	private String url;
	@Value("${mysqluser}")
	private String user;
	@Value("${mysqlpwd}")
	private String pwd;
	
	@Bean()
	public DataSource dataSource()
	{
		DriverManagerDataSource db = new DriverManagerDataSource();
		db.setDriverClassName(driver);
		db.setUrl(url);
		db.setUsername(user);
		db.setPassword(pwd);
		return db;
	}
	
	@Bean
	@Autowired
	public JdbcTemplate template(
			DataSource ds)
	{
		return new JdbcTemplate(ds);
	}
	
}
