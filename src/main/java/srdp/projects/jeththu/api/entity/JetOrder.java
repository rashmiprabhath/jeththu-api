package srdp.projects.jeththu.api.entity;


import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "jet_order")
public class JetOrder {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  @Column( name  = "jet_order_id" )
  private int orderId;
  @Column( name  = "order_date" )
  private java.sql.Timestamp orderDate;
  @Column( name  = "due_date" )
  private java.sql.Timestamp dueDate;
  @Column( name  = "description" )
  private String description;
  @Column( name  = "gross_total" )
  private BigDecimal grossTotal;
  @Column( name  = "paid_amount" )
  private BigDecimal paidAmount;

  @ManyToOne
  @JoinColumn(name="customer_id", nullable=false)
  private Customer customer;
  @ManyToOne
  @JoinColumn(name="order_status_id", nullable=false)
  private OrderStatus orderStatus;
  @ManyToOne
  @JoinColumn(name="payment_status_id", nullable=false)
  private PaymentStatus paymentStatus;


  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }


  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer( Customer customer ) {
    this.customer = customer;
  }


  public OrderStatus getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(OrderStatus orderStatus) {
    this.orderStatus = orderStatus;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public java.sql.Timestamp getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(java.sql.Timestamp orderDate) {
    this.orderDate = orderDate;
  }

  public Timestamp getDueDate()
  {
    return dueDate;
  }

  public void setDueDate( Timestamp dueDate )
  {
    this.dueDate = dueDate;
  }

  public BigDecimal getGrossTotal()
  {
    return grossTotal;
  }

  public void setGrossTotal( BigDecimal grossTotal )
  {
    this.grossTotal = grossTotal;
  }

  public BigDecimal getPaidAmount()
  {
    return paidAmount;
  }

  public void setPaidAmount( BigDecimal paidAmount )
  {
    this.paidAmount = paidAmount;
  }

  public PaymentStatus getPaymentStatus()
  {
    return paymentStatus;
  }

  public void setPaymentStatus( PaymentStatus paymentStatus )
  {
    this.paymentStatus = paymentStatus;
  }
}
