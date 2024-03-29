package com.companyname.exercise.easymock;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

	private StockMarket stockMarket;
	private List<Stock> stocks = new ArrayList<Stock>();

	public Double getTotalValue() {
		Double value = 0.0;
		for (Stock stock : this.stocks) {
			value += (stockMarket.getPrice(stock.getName()) * stock
					.getQuantity());
		}
		return value;
	}

	public StockMarket getStockMarket() {
		return stockMarket;
	}

	public void setStockMarket(StockMarket stockMarket) {
		this.stockMarket = stockMarket;
	}
	
	public void add(Stock stock) {
		stocks.add(stock);
	}

	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
	
	
}
