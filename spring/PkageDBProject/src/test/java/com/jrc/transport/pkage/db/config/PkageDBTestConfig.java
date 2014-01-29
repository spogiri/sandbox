package com.jrc.transport.pkage.db.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.jrc.transport.pkage.db.config.PkageDBConfig;

@Configuration
@Import(PkageDBConfig.class)
public class PkageDBTestConfig {

}
