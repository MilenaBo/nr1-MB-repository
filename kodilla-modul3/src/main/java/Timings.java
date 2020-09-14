import com.kodilla.modul3.kolekcjePomiary35.*;

/* Name of the class has to be "Main" only if the class is public. */
class Timings
{
    public static void main (String[] args) throws java.lang.Exception
    {
        CollectionCreate.collectionCreate();
        ArraySpeedTest.arraySpeedTest();
        ArraySpeedTestRemove0.arraySpeedTestRemove0();
        ArrayListSpeedTest.arrayListSpeedTest();

       BookArrayListSpeedTest.bookArrayListSpeedTest();
       BookLinkedListSpeedTest.bookLinkedListSpeedTest();
       BookHashMapSpeed.bookHashMapSpeed();

        // Displaying quantity of milliseconds from 01.01.1970
        System.out.println("Milliseconds: " + System.currentTimeMillis());

        // Displaying quantity of nanoseconds
        System.out.println("Nanoseconds: " + System.nanoTime());
    }
}