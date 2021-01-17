package srdp.projects.jeththu.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_status")
public class OrderStatus {

  @Id
  @Column( name  = "id" )
  private int id;
  @Column( name  = "name" )
  private String status;
  @Column( name  = "description" )
  private String description;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
