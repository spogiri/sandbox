package com.jrc.transport.pkage.db;

import javax.inject.Inject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jrc.transport.pkage.db.config.PkageDBTestConfig;
import com.jrc.transport.pkage.db.dao.PkageRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PkageDBTestConfig.class)

public class PkageAmqpReceiverTest {

	@Inject PkageRepository repo;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void fetchPkagesFromAmqpServer(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(repo.findAll());
	}


}
