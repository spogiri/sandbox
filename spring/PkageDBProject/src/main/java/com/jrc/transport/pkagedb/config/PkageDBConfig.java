package com.jrc.transport.pkagedb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

import com.jrc.transport.pkagedb.dao.PkageRepository;
import com.jrc.transport.pkagedb.domain.Pkage;

@Configuration
@ImportResource("META-INF/spring/gemfire/cache-config.xml")
@ComponentScan(basePackageClasses={Pkage.class})
@EnableGemfireRepositories(basePackageClasses={PkageRepository.class})
public class PkageDBConfig {


	
	
}
