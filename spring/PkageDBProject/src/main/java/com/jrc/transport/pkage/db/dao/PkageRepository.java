package com.jrc.transport.pkage.db.dao;

import org.springframework.data.gemfire.repository.GemfireRepository;
import org.springframework.stereotype.Repository;

import com.jrc.transport.pkage.db.domain.Pkage;

@Repository
public interface PkageRepository extends GemfireRepository<Pkage, String>{

	
}
