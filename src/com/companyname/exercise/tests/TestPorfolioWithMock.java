package com.companyname.exercise.tests;

import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.junit.Test;

import com.companyname.exercise.easymock.Portfolio;
import com.companyname.exercise.easymock.Stock;
import com.companyname.exercise.easymock.StockMarket;

public class TestPorfolioWithMock extends TestCase{

	private Portfolio portfolio;
	private StockMarket marketMock;
	
	@Test
	public void test() {

		portfolio = new Portfolio();
		marketMock = EasyMock.createMock(StockMarket.class);
		portfolio.setStockMarket(marketMock);
		
		// generate a simulation
		EasyMock.expect(marketMock.getPrice("cemex")).andReturn(50.00);
		EasyMock.replay(marketMock);
		
		// test the function with the mock
		Stock stock = new Stock("cemex", 2);
		portfolio.add(stock);
		assertEquals(100.00, portfolio.getTotalValue());
	
	}

}
