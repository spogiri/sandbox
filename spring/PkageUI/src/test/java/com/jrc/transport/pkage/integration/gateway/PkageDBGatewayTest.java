package com.jrc.transport.pkage.integration.gateway;

import javax.inject.Inject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jrc.transport.pkage.integration.dto.Pkage;
import com.jrc.transport.pkage.ui.config.PkageUITestConfig;

@ContextConfiguration(classes={PkageUITestConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class PkageDBGatewayTest {

	@Inject PkageDBGateway pkageDBGateway;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void createPkage() {
		Pkage pkage = new Pkage();
		pkage.setPkageId("DummyPkage");
		pkage.setSenderName("James Gosling");
		pkage.setReceiverName("Rod Johnson");
		pkage.setFromZipCode("123456");
		pkage.setToZipCode("99999");
		pkageDBGateway.createPkage(pkage );
	}

}
