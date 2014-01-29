package com.jrc.transport.pkagedb.dao;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jrc.transport.pkage.db.config.PkageDBConfig;
import com.jrc.transport.pkage.db.dao.PkageRepository;
import com.jrc.transport.pkage.db.domain.Pkage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PkageDBConfig.class)
@Ignore
public class PkageRepositoryTest {

	@Autowired
	PkageRepository dao;
	
	@Test
	public void test() {
		Pkage pkg = Pkage.builder().create()
						.setPkageId("packageID1")
						.setSenderName("Kepler")
						.setReceiverName("Tesla")
						.setFromZipCode("54320")
						.setToZipCode("MZ450")
						.build();
		dao.save(pkg);
		Pkage secondPkg = Pkage.builder().create()
				.setPkageId("packageID2")
				.setSenderName("Einstein")
				.setReceiverName("Raman")
				.setFromZipCode("52220")
				.setToZipCode("N7890")
				.build();
		dao.save(secondPkg);
		Iterator<Pkage> iter = dao.findAll().iterator();
		assertEquals(iter.next(), pkg);
		assertEquals(iter.next(), secondPkg);
	}
	
}
