package srdp.projects.jeththu.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "TEST_TABLE" )
public class TestTable
{
    @Id
    @Column( name = "ID" )
    private String id;

    @Column( name = "NAME" )
    private String name;

    public String getId()
    {
        return id;
    }

    public void setId( String id )
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }
}
