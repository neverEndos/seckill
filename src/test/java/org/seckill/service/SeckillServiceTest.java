package org.seckill.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class SeckillServiceTest {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SeckillService seckillService;

	@Test
	public void testGetSeckillList() {
		List<Seckill> list = seckillService.getSeckillList();
		logger.info("list={}", list);
	}

	@Test
	public void testGetById() {
		Seckill seckill = seckillService.getById(1000);
		logger.info("seckill={}", seckill);
	}

	@Test
	public void testExportSeckillUrl() {
		long seckillId = 1000;
		Exposer exposer = seckillService.exportSeckillUrl(seckillId);
		logger.info("exposer={}",exposer);
		/*
		 *  exposer=Exposer [exposed=true, 
		 *  md5=87720e8486bf88cec68cbf95f16594f0, 
		 *  seckillId=1000, 
		 *  now=0, start=0, end=0]
		 */
	}

	@Test
	public void testExecuteSeckill() {
		long seckillId = 1000;
		long userPhone = 15106136080L;
		String md5 = "87720e8486bf88cec68cbf95f16594f0";
		SeckillExecution seckillExecution = seckillService.executeSeckill(seckillId, userPhone, md5);
		logger.info("seckillExecution={}",seckillExecution);
	}

}
