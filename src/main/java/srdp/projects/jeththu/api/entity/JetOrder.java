package com.sample;


public class JetOrder {

  private String orderId;
  private String customerId;
  private String orderStatus;
  private String description;
  private java.sql.Date orderDate;
  private String specialNotes;
  private String itemId;


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public java.sql.Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(java.sql.Date orderDate) {
    this.orderDate = orderDate;
  }


  public String getSpecialNotes() {
    return specialNotes;
  }

  public void setSpecialNotes(String specialNotes) {
    this.specialNotes = specialNotes;
  }


  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

}
