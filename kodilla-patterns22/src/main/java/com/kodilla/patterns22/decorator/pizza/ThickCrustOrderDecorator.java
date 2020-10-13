package com.kodilla.patterns22.decorator.pizza;

import java.math.BigDecimal;

public class ThickCrustOrderDecorator extends AbstractPizzaOrderDecorator   {
    public  ThickCrustOrderDecorator(PizzaOrder pizzaOrder)     {
        super(pizzaOrder);
    }
    @Override
    //hardcoded stub cost = 5
    public BigDecimal getCost()     {   return  super.getCost().add(new BigDecimal(5));     }

    @Override
    public String getDescription()  {   return  super.getDescription() + "***GRUBE CIASTO***";   }
}
