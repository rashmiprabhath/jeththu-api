package srdp.projects.jeththu.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import srdp.projects.jeththu.api.models.TestTableModel;
import srdp.projects.jeththu.api.services.ItemService;

@RestController
@RequestMapping("/products")
public class ProductController
{
    @Autowired
    private ItemService itemService;

    @GetMapping
    public TestTableModel getName()
    {
        return new TestTableModel( 1,"Jeththu Products" );
    }
}
