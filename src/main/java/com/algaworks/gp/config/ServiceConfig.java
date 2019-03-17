package com.algaworks.gp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.algaworks.gp.controller.GpController;

@Configuration
@ComponentScan(basePackageClasses = GpController.class)
public class ServiceConfig {

}
