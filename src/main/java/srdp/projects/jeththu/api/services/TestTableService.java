package srdp.projects.jeththu.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srdp.projects.jeththu.api.entity.Test;
import srdp.projects.jeththu.api.models.TestTableModel;
import srdp.projects.jeththu.api.repository.TestTableRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// this class provide all product services.
@Service
public class TestTableService
{
    @Autowired
    private TestTableRepository testTableRepository;

    public void addTest( String name )
    {
        Test test = new Test();
        test.setName( name );

        this.testTableRepository.save( test );
    }

    public TestTableModel getTestTable( int id )
    {
        Optional<Test> testOptional =  this.testTableRepository.findById( id );
        return testOptional.map( t -> new TestTableModel( t.getId(), t.getName() ) ).orElse( null );
    }

    public List<TestTableModel> getAll(){
        return this.testTableRepository.findAll().stream()
                                       .map( t -> new TestTableModel( t.getId(), t.getName() ) )
                                       .collect( Collectors.toList());
    }

}
