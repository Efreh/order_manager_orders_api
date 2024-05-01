package com.efr.order.rest.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_positions")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "positionId")
    private int positionId;
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order orderId;
    @Column(name = "orderNumber",length = 50)
    private String orderNumber;
    @Column(name = "orderPosition",length = 50,nullable = false)
    private String orderPosition;
    @Column(name = "amount")
    private int amount;
    @Column(name = "workOperation1",length = 50)
    private String workOperation1;
    @Column(name = "workOperation2",length = 50)
    private String workOperation2;
    @Column(name = "workOperation3",length = 50)
    private String workOperation3;
    @Column(name = "workOperation4",length = 50)
    private String workOperation4;
}
