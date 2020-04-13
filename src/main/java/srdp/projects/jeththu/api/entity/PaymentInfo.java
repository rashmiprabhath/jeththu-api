package com.sample;


public class PaymentInfo {

  private String orderId;
  private String totalPrice;
  private String paymentStatus;
  private String paidAmount;


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public String getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }


  public String getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  public String getPaidAmount() {
    return paidAmount;
  }

  public void setPaidAmount(String paidAmount) {
    this.paidAmount = paidAmount;
  }

}
