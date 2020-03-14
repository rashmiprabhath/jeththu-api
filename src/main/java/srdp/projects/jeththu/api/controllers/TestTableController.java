package srdp.projects.jeththu.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import srdp.projects.jeththu.api.entity.TestTable;
import srdp.projects.jeththu.api.models.TestTableModel;
import srdp.projects.jeththu.api.services.TestTableService;

/**
 * Copyright (c) 2018 CodeGen International (pvt) Ltd.
 * demo: ProductController
 * Author: rashmi
 * Date: 20. Feb. 2020
 */
@RestController
@RequestMapping( "/products" )
public class TestTableController
{
    @Autowired
    private TestTableService testTableService;

    @CrossOrigin( origins = "http://localhost:4200" )
    @GetMapping
    public TestTableModel getName()
    {
        return new TestTableModel( "Jeththu Products" );
    }

    @CrossOrigin( origins = "http://localhost:4200" )
    @GetMapping( "/test" )
    public TestTable getTestTable( @RequestParam( value = "id" ) String id )
    {
        return testTableService.getTestTable( id );
    }
}
