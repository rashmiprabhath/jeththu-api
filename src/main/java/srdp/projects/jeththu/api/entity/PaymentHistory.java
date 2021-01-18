package srdp.projects.jeththu.api.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Payment_history")
public class PaymentHistory {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  @Column( name  = "payment_id" )
  private int paymentId;
  @Column( name  = "amount" )
  private BigDecimal amount;
  @Column( name  = "paid_date" )
  private java.sql.Timestamp paidDate;

    @ManyToOne
    @JoinColumn(name="jet_order_id", nullable=false)
    private JetOrder order;

  public int getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(int paymentId) {
    this.paymentId = paymentId;
  }


  public JetOrder getOrder() {
    return order;
  }

  public void setOrder( JetOrder order ) {
    this.order = order;
  }


  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public java.sql.Timestamp getPaidDate() {
    return paidDate;
  }

  public void setPaidDate(java.sql.Timestamp paidDate) {
    this.paidDate = paidDate;
  }


}
