package srdp.projects.jeththu.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import srdp.projects.jeththu.api.entity.Test;
import srdp.projects.jeththu.api.models.TestTableModel;
import srdp.projects.jeththu.api.services.TestTableService;

import java.util.List;

/**
 * Copyright (c) 2018 CodeGen International (pvt) Ltd.
 * demo: ProductController
 * Author: rashmi
 * Date: 20. Feb. 2020
 */
@RestController
@RequestMapping( "/test" )
public class TestTableController
{
    @Autowired
    private TestTableService testTableService;

    @GetMapping
    public TestTableModel getTestTable( @RequestParam( value = "id" ) int id )
    {
        return this.testTableService.getTestTable( id );
    }

    @GetMapping( "/all" )
    public List<TestTableModel> getAll(){
        return this.testTableService.getAll();
    }

    @PostMapping
    public void saveTest( @RequestParam( value = "name") String name ){
        this.testTableService.addTest( name );
    }
}
