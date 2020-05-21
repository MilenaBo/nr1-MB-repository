package com.kodilla.stream.array;

// interfejs ArrayOperations z jedną metodą statyczną - getAverage(int[] numbers)

// Metoda getAverage(int[] numbers) powinna:
// - przy pomocy strumienia IntStream oraz metody range(int startInclusive, int endExclusive)
// wyświetlić kolejne elementy tablicy, a następnie:
// - przy pomocy drugiego strumienia IntStream oraz metody range(int startInclusive, int endExclusive),
// a także kolektora average() obliczyć średnią.
// Na końcu metoda powinna zwracać średnią jako wynik typu double.

import java.util.OptionalDouble;
import java.util.stream.IntStream;

interface ArrayOperations {

     static OptionalDouble getAverage(int[] numbers) {

         IntStream.range(0,numbers.length).map(n->numbers[n]);

         OptionalDouble avargeArray10 = IntStream.range(0,10)
                 .map(n->numbers[n])
                 .average();
                return avargeArray10;
     }
}
