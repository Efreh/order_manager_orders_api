package com.efr.order.rest.api.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId")
    private int orderId;
    @Column(name = "date",nullable = false)
    private LocalDate date;
    @Column(name = "workShift",nullable = false,length = 1)
    private int workShift;
    @Column(name = "employeeId",nullable = false)
    private int employeeId;
    @OneToMany(mappedBy = "orderId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Position> positionList;
    @Column(name = "masterCheck",columnDefinition = "boolean default false")
    private boolean masterCheck;
    @Column(name = "otkControllerCheck",columnDefinition = "boolean default false")
    private boolean otkControllerCheck;

    public Order() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getWorkShift() {
        return workShift;
    }

    public void setWorkShift(int workShift) {
        this.workShift = workShift;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public List<Position> getPositionList() {
        return positionList;
    }

    public void setPositionList(List<Position> positionList) {
        this.positionList = positionList;
    }

    public boolean isMasterCheck() {
        return masterCheck;
    }

    public void setMasterCheck(boolean masterCheck) {
        this.masterCheck = masterCheck;
    }

    public boolean isOtkControllerCheck() {
        return otkControllerCheck;
    }

    public void setOtkControllerCheck(boolean otkControllerCheck) {
        this.otkControllerCheck = otkControllerCheck;
    }
}
