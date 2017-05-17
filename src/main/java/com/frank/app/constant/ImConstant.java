package com.frank.app.constant;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value="classpath:property-${spring.profiles.active}/im.properties")
@ConfigurationProperties(prefix="im")
public class ImConstant {
	private String url;

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
