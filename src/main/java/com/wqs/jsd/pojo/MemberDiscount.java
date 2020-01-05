package com.wqs.jsd.pojo;

import java.io.Serializable;

/**
 * member_discount
 * @author 
 */
public class MemberDiscount implements Serializable {
    private Integer id;

    private Integer memberId;

    private Integer discountId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Integer discountId) {
        this.discountId = discountId;
    }
}