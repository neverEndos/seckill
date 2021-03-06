package org.seckill.dao;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

	@Autowired
	private SeckillDao seckillDao;
	
	@Test
	public void testReduceNumber() {
		int i = seckillDao.reduceNumber(1000L, new Date());
		System.out.println(i);
	}

	@Test
	public void testQueryById() {
		long id = 1000;
		Seckill seckill = seckillDao.queryById(id);
		System.out.println(seckill);
		System.out.println(seckill.getName());
	}

	@Test
	public void testQueryAll() {
		List<Seckill> list = seckillDao.queryAll(0, 100);
		for (Seckill seckill : list) {
			System.out.println(seckill);
			System.out.println(seckill.getName());
		}
	}

}
