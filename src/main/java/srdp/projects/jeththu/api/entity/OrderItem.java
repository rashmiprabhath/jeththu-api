package srdp.projects.jeththu.api.entity;


import javax.persistence.*;

@Entity
@Table(name = "order_item")
public class OrderItem {

  @EmbeddedId
  private OrderItemId orderId;


  public OrderItemId getOrderId() {
    return orderId;
  }

  public void setOrderId(OrderItemId orderId) {
    this.orderId = orderId;
  }
}
