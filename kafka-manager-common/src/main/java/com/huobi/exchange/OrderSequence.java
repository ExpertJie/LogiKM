package com.huobi.exchange;

import java.math.BigDecimal;

public class OrderSequence {
    private String type;
    private String symbol;
    private BigDecimal amount;
    private BigDecimal price;
    private Long actionId;
    private Long orderId;
    private String circuitRate;
    private Long createdAt;
    private Long orderCreatedAt;
    private Long userId;
    private String clientOrderId;
    private String source;
    private Long orderVersion;
    private Long accountId;
    private String version;
    private int actionType;
    private String extra;

    public OrderSequence() {
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getActionId() {
        return this.actionId;
    }

    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCircuitRate() {
        return this.circuitRate;
    }

    public void setCircuitRate(String circuitRate) {
        this.circuitRate = circuitRate;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getOrderCreatedAt() {
        return this.orderCreatedAt;
    }

    public void setOrderCreatedAt(Long orderCreatedAt) {
        this.orderCreatedAt = orderCreatedAt;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getClientOrderId() {
        return this.clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getOrderVersion() {
        return this.orderVersion;
    }

    public void setOrderVersion(Long orderVersion) {
        this.orderVersion = orderVersion;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getActionType() {
        return this.actionType;
    }

    public void setActionType(int actionType) {
        this.actionType = actionType;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public static OrderSequence pbToEntity(com.huobi.order.action.protocol.OrderSequenceProtocol.OrderSequence pb) {
        OrderSequence orderSequence = new OrderSequence();
        orderSequence.setType(pb.getType());
        orderSequence.setAmount(new BigDecimal(pb.getAmount()));
        orderSequence.setPrice(new BigDecimal(pb.getPrice()));
        orderSequence.setActionId(pb.getActionId());
        orderSequence.setOrderId(pb.getOrderId());
        orderSequence.setCircuitRate(pb.getCircuitRate());
        orderSequence.setUserId(pb.getUserId());
        orderSequence.setClientOrderId(pb.getClientOrderId());
        orderSequence.setSource(pb.getSource());
        orderSequence.setOrderVersion(pb.getOrderVersion());
        orderSequence.setVersion(pb.getVersion());
        orderSequence.setSymbol(pb.getSymbol());
        orderSequence.setAccountId(pb.getAccountId());
        orderSequence.setOrderCreatedAt(pb.getCreatedAt());
        orderSequence.setCreatedAt(pb.getCreatedAt());
        orderSequence.setActionType(pb.getActionType());
        orderSequence.setExtra(pb.getExtra());
        return orderSequence;
    }
}
