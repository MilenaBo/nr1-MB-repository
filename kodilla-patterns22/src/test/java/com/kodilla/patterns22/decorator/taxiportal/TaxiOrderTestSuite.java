package com.kodilla.patterns22.decorator.taxiportal;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(5),calculatedCost);
    }
    @Test
    public  void  testBasicTaxiOrderGetDescription() {
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //when
        String description = taxiOrder.getDescription();
        //then
        assertEquals("Drive a course",description);
    }
    @Test
    public void testTaxiNetworkGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(40),theCost);
    }
    @Test
    public void testTaxiNetworkGetDescription() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Drive a course"+"  BY  TAXI  NETWORK",description);
    }
    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(37),theCost);
    }
    @Test
    public  void testMyTaxiWithChildSeatGetDescription() {
        //given
        TaxiOrder theorder = new BasicTaxiOrder();
        theorder = new MyTaxiNetworkOrderDecorator(theorder);
        theorder = new ChildSeatDecorator(theorder);
        //when
        String description = theorder.getDescription();
        //then
        assertEquals("Drive a course"+"  BY MYTAXI NETWORK"+"  +CHILD SEAT",description);
    }
    @Test
    public void testMyTaxiWithTWO_ChildSeatGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(39),theCost);
    }
    @Test
    public void testMyTaxiWithTWO_ChildSeatGetDescription() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Drive a course"+"  BY MYTAXI NETWORK"+"  +CHILD SEAT"+"  +CHILD SEAT",description);
    }
    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(52),theCost);
    }
}
