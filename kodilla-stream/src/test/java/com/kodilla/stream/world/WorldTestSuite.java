package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
@Test
    public void testGetPeopleQuantity() {
    //given
        // create countries
    List<Country> asia = new ArrayList<>();
    Country asia1 = new Country("CHINA",new BigDecimal("1439323776"));
    asia.add(asia1);
    Country asia2 = new Country("INDIA",new BigDecimal("1380004385"));
    asia.add(asia2);

    List<Country> northAmerica = new ArrayList<>();
    Country northAmerica1 = new Country("USA",new BigDecimal("331002651"));
    northAmerica.add(northAmerica1);
    Country northAmerica2 = new Country("Mexico",new BigDecimal("128932753"));
    northAmerica.add(northAmerica2);

        //create continents
    List<Continent> continent = new ArrayList<>();

    Continent continent1 = new Continent(asia,"Asia");
////////    World.addContinents(continent1);                          DLACZEGO TAK NIE DZIAŁA ????
    continent.add(continent1);
    Continent continent2 = new Continent(northAmerica,"North America");
    continent.add(continent2);

    //when
     BigDecimal total = BigDecimal.ZERO;
///////     total = World.getPeopleQuantity().totalPopulation;
// ////////// **** CO ZROBIĆ ŻEBY URUCHOMIĆ I SPRAWDZIC METODĘ getPeopleQuantity()  ??

    //Then
    BigDecimal expectedQuantity = new BigDecimal("3279263565");
    Assert.assertEquals(expectedQuantity,total);

///////////   NA RAZIE POLICZONE DLA 4-ECH KRAJÓW (2 KONTYNENTY)

}

}
