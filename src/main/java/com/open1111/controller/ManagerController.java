package com.open1111.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.open1111.service.ManagerService;

/**
 * 管理员Controller层
 * @author user
 *
 */
@Controller
@RequestMapping("/manager2")
public class ManagerController {

	@Resource
	private ManagerService managerService;
}
