package com.open1111.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.open1111.dao.ManagerDao;
import com.open1111.service.ManagerService;

/**
 * 管理员Service实现类
 * @author user
 *
 */
@Service("managerService")
public class ManagerServiceImpl implements ManagerService {

	@Resource
	private ManagerDao managerDao;
}
