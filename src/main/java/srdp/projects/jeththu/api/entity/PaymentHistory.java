package com.sample;


public class PaymentHistory {

  private String paymentId;
  private String orderId;
  private String amount;
  private java.sql.Date paidDate;
  private String paymentStatus;


  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  public java.sql.Date getPaidDate() {
    return paidDate;
  }

  public void setPaidDate(java.sql.Date paidDate) {
    this.paidDate = paidDate;
  }


  public String getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

}
