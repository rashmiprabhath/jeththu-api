package srdp.projects.jeththu.api.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderItemId implements Serializable
{
    @Column( name = "item_intem_id" )
    private int item_id;
    @Column( name = "jet_order_jet_order_id" )
    private int orderItemId;

    public int getItem_id()
    {
        return item_id;
    }

    public void setItem_id( int item_id )
    {
        this.item_id = item_id;
    }

    public int getOrderItemId()
    {
        return orderItemId;
    }

    public void setOrderItemId( int orderItemId )
    {
        this.orderItemId = orderItemId;
    }
}
