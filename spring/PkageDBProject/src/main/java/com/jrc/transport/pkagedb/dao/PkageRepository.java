package com.jrc.transport.pkagedb.dao;

import org.springframework.data.gemfire.repository.GemfireRepository;
import org.springframework.stereotype.Repository;

import com.jrc.transport.pkagedb.domain.Pkage;

@Repository
public interface PkageRepository extends GemfireRepository<Pkage, String>{

	
}
