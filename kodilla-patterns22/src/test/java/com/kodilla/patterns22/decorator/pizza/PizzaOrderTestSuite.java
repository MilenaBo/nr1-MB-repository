package com.kodilla.patterns22.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Podstawowa pizza (ciasto i sos pomidorowy z serem)", description);
    }

    @Test
    public void testThickCrustGetCost() {
        //given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new ThickCrustOrderDecorator(thePizza);
        //when
        BigDecimal theCost = thePizza.getCost();
        //then
        assertEquals(new BigDecimal(20), theCost);
        System.out.println("   CENA  ZAMÓWIENIA:   " + theCost);
    }

    @Test
    public void testThickCrustGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ThickCrustOrderDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Podstawowa pizza (ciasto i sos pomidorowy z serem)***GRUBE CIASTO***", description);
        System.out.println("ZAMÓWIENIE:   " + description);
    }

    @Test
    public void testThickCrustExtraCheeseGetCost() {
        //given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new ThickCrustOrderDecorator(thePizza);
        thePizza = new ExtraCheeseDecorator(thePizza);
        //when
        BigDecimal theCost = thePizza.getCost();
        //then
        assertEquals(new BigDecimal(24), theCost);
        System.out.println("   CENA  ZAMÓWIENIA extra ser:   " + theCost);
    }

    @Test
    public void testThickCrustExtraCheeseGetDescription() {
        //given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new ThickCrustOrderDecorator(thePizza);
        thePizza = new ExtraCheeseDecorator(thePizza);
        //when
        String description = thePizza.getDescription();
        //then
        assertEquals("Podstawowa pizza (ciasto i sos pomidorowy z serem)***GRUBE CIASTO*** ++++EXTRA SER++", description);
        System.out.println("ZAMÓWIENIE:   " + description);
    }
}