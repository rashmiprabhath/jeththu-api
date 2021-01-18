package srdp.projects.jeththu.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import srdp.projects.jeththu.api.entity.Test;

import java.util.Optional;

@Repository
public interface TestTableRepository extends JpaRepository<Test,Integer>
{
    Optional<Test> findById( Integer id );
}
