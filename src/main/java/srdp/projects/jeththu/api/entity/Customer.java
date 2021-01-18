package srdp.projects.jeththu.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "cutomer")
public class Customer {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  @Column( name  = "customer_id" )
  private int customerId;
  @Column( name  = "name" )
  private String name;
  @Column( name  = "gender" )
  private String gender;
  @Column( name  = "address" )
  private String address;
  @Column( name  = "contact_number" )
  private String contactNumber;


  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }

}
