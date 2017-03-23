package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

	@Autowired
	private SuccessKilledDao successKilledDao;
	
	@Test
	public void testInsertSuccessKilled() {
		long id = 1000L;
		long phone = 15201354964L;
		int i = successKilledDao.insertSuccessKilled(id, phone);
		System.out.println(i);
	}

	@Test
	public void testQueryByIdWithSeckill() {
		long id = 1000L;
		long phone = 15201354964L;
		SuccessKilled sk = successKilledDao.queryByIdWithSeckill(id, phone);
		System.out.println(sk.getSeckillId());
		System.out.println(sk.getSeckill().getName());
		System.out.println(sk.getSeckill());
		System.out.println(sk);
	}

}
