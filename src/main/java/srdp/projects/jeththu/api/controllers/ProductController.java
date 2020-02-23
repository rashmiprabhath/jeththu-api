package srdp.projects.jeththu.api.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import srdp.projects.jeththu.api.models.ProductTest;

/**
 * Copyright (c) 2018 CodeGen International (pvt) Ltd.
 * demo: ProductController
 * Author: rashmi
 * Date: 20. Feb. 2020
 */
@RestController
@RequestMapping("/products")
public class ProductController
{
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public ProductTest getName()
	{
		return new ProductTest( "Jeththu Products" );
	}
}
