package com.example.swaggerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.swaggerdemo.entity.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "欢迎接口")
@RestController
@RequestMapping("/api")
public class HelloController {

	@ApiOperation(value = "接口的用途", notes = "接口的备注")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "name", value = "姓名", required = true, defaultValue = "lixingshuai", paramType = "body") })
	@ApiResponses({ @ApiResponse(code = 200, message = "成功", response = User.class) })
	@GetMapping("/hello")
	public String hello(String name) {
		return "Hello " + name;
	}

}
