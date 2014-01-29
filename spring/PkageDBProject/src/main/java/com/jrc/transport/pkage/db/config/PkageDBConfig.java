package com.jrc.transport.pkage.db.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

import com.jrc.transport.pkage.db.dao.PkageRepository;
import com.jrc.transport.pkage.db.domain.Pkage;

@Configuration
@ImportResource("classpath:/META-INF/spring/integration/spring-integration-context.xml")
@ComponentScan(basePackageClasses={Pkage.class})
@EnableGemfireRepositories(basePackageClasses={PkageRepository.class})

public class PkageDBConfig {

}
