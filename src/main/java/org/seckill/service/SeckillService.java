package org.seckill.service;

import java.util.List;

import org.seckill.entity.Seckill;

public interface SeckillService {
	List<Seckill> getSeckillList();
	
	Seckill getById(long seckillId);
	
	/**
	 * 秒杀开启时，输出秒杀接口地址，否则输出系统时间和秒杀时间
	 * @param seckillId
	 */
	void exportSeckillUrl(long seckillId);
}
