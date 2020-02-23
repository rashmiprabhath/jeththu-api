package srdp.projects.jeththu.api.models;

public class ProductTest
{

    public ProductTest()
    {
    }

    public ProductTest( String name )
    {
        this.name = name;
    }

    private String name;

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }
}
