package srdp.projects.jeththu.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  @Column( name  = "intem_id" )
  private int itemId;
  @Column( name  = "name" )
  private String name;
  @Column( name  = "details" )
  private String details;


  public int getItemId() {
    return itemId;
  }

  public void setItemId(int itemId) {
    this.itemId = itemId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

}
