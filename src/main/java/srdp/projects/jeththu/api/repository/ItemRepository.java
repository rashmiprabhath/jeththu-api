package srdp.projects.jeththu.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import srdp.projects.jeththu.api.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer>
{
}
