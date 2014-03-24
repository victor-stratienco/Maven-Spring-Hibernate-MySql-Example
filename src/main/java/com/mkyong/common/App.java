package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.stock.bo.StockBo;
import com.mkyong.stock.model.Stock;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("config/BeanLocations.xml");

        StockBo stockBo = (StockBo)appContext.getBean("stockBo");

        /** insert **/
        Stock stock = new Stock();
        stock.setStockCode("7668");
        stock.setStockName("HAIO");
        stockBo.save(stock);
        System.out.println("1. Stock: " + stock);

        /** select **/
        Stock stock2 = stockBo.findByStockCode("7668");
        System.out.println("2. Stock2: " + stock2);

        /** update **/
        stock2.setStockName("HAIO-1");
        stockBo.update(stock2);
        System.out.println("3. Stock2: " + stock2);

        /** delete **/
        stockBo.delete(stock2);

        System.out.println("Done");
    }
}