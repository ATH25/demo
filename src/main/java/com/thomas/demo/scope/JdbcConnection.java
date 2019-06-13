package com.thomas.demo.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
/*
 * whenever you want to create a new instance of the dependency of a bean class 
 * (here, JdbcConnection is a dependency of PersonDAO), you have to use 
 * @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, 
				proxyMode = ScopedProxyMode.TARGET_CLASS)
instead of @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)*/
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, 
				proxyMode = ScopedProxyMode.TARGET_CLASS)

public class JdbcConnection {
	
	public JdbcConnection() {
		System.out.println("JDBC Connection");
	}

}
