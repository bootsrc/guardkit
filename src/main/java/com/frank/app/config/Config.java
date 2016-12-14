package com.frank.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * @author frank.liu Config class must be in the package or sub-package of
 *         package of '@SpringBootApplication class'
 *         Config文件必须放在App所在的package和子package里
 *
 */
@Configuration
@ImportResource(locations = { "classpath:appContext.xml" })
public class Config {

}
