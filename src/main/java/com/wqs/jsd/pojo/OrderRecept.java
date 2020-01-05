package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * order_recept
 * @author 
 */
public class OrderRecept implements Serializable {
    private Integer id;

    private Integer ordersId;

    private Integer scoreOne;

    private Integer scoreTwo;

    private Integer scoreThree;

    private String evaluate;

    private Date evaluateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getScoreOne() {
        return scoreOne;
    }

    public void setScoreOne(Integer scoreOne) {
        this.scoreOne = scoreOne;
    }

    public Integer getScoreTwo() {
        return scoreTwo;
    }

    public void setScoreTwo(Integer scoreTwo) {
        this.scoreTwo = scoreTwo;
    }

    public Integer getScoreThree() {
        return scoreThree;
    }

    public void setScoreThree(Integer scoreThree) {
        this.scoreThree = scoreThree;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public Date getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }
}