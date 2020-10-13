package com.kodilla.patterns22.decorator.pizza;

import java.math.BigDecimal;

public class ThinCrustOrderDecorator  extends  AbstractPizzaOrderDecorator      {
    public ThinCrustOrderDecorator(PizzaOrder pizzaOrder)       {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {         return super.getCost().add(new BigDecimal(2.50));       }

    @Override
    public String getDescription() {      return super.getDescription() + "***CIENKIE CIASTO***";     }
}
