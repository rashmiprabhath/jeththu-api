package srdp.projects.jeththu.api.models;

public class TestTableModel
{
    private String id;
    private String name;

    public TestTableModel()
    {
    }

    public TestTableModel( String name )
    {
        this.name = name;
    }

    public TestTableModel( String id, String name )
    {
        this.id = id;
        this.name = name;
    }

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
