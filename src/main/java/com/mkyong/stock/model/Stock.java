package com.mkyong.stock.model;

import java.io.Serializable;

public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long stockId;
    private String stockCode;
    private String stockName;


    public Long getStockId() {
        return stockId;
    }

    public void setStockId(final Long stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(final String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(final String stockName) {
        this.stockName = stockName;
    }

	@Override
	public String toString() {
		return "[stockId=" + stockId + ", stockCode=" + stockCode + ", stockName=" + stockName + "] : "
				+ super.toString();
	}
}
