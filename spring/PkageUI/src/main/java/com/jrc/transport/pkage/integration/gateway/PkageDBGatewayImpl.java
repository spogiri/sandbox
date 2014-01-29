package com.jrc.transport.pkage.integration.gateway;

import javax.inject.Inject;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import com.jrc.transport.pkage.integration.dto.Pkage;


@Component
public class PkageDBGatewayImpl implements PkageDBGateway {

	@Inject AmqpTemplate amqpTemplate;
	
	public PkageDBGatewayImpl() {
	}

	@Override
	public void createPkage(Pkage pkage){
	
		amqpTemplate.convertAndSend(pkage);
		
	}
	
}
