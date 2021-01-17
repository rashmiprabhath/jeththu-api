package srdp.projects.jeththu.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srdp.projects.jeththu.api.entity.TestTable;
import srdp.projects.jeththu.api.repository.TestTableRepository;

import java.util.List;

// this class provide all product services.
@Service
public class TestTableService
{
    @Autowired
    private TestTableRepository testTableRepository;

    public void addTest( int id, String name )
    {
        TestTable testTable = new TestTable();
        testTable.setId( id );
        testTable.setName( name );

        this.testTableRepository.save( testTable );
    }

    public TestTable getTestTable( String id )
    {
        List<TestTable> testTableList = this.testTableRepository.findAllById( id );
        return testTableList.size() > 0 ? testTableList.get( 0 ) : null;
    }
}
