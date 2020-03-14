package srdp.projects.jeththu.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import srdp.projects.jeththu.api.entity.TestTable;

import java.util.List;

@Repository
public interface TestTableRepository extends JpaRepository<TestTable,String>
{
    List<TestTable> findAllById( String id );
}
