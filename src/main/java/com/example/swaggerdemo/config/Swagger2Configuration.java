//package com.example.swaggerdemo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@EnableSwagger2
//@Configuration
//public class Swagger2Configuration {
//
//	@Bean
//	public Docket createRestApi() {
//		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
//				.apis(RequestHandlerSelectors.basePackage("com.controller")) // 注意修改此处的包名
//				.paths(PathSelectors.any()).build();
//	}
//
//	private ApiInfo apiInfo() {
//		return new ApiInfoBuilder().title("接口列表 v1.1.0") // 任意，请稍微规范点
//				.description("接口测试") // 任意，请稍微规范点
//				.termsOfServiceUrl("http://localhost:8080/swagger-demo/swagger-ui.html") // 将“url”换成自己的ip:port
//				.version("1.1.0").build();
//	}
//
//}
