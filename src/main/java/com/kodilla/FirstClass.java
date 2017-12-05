import java.util.*;

/*Napisz program, który:

będzie posiadał zmienną int sumaA (zainicjowana z wartością 1000)
oraz drugą zmienną int SumaB (zainicjowana z wartością 0).
Pętle while, wewnątrz której losujemy:
liczbę typu int z zakresu 0-9 i dodawaj ją do zmiennej sumaA oraz
liczbę typu int z zakresu 0-49 i dodawaj ją do zmiennej sumaB.
Pętlę wykonuj tak długo, jak długo spełniony jest warunek sumaA > sumaB.

W każdej iteracji wyświetl numer przebiegu pętli oraz aktualne wartości obu zmiennych.
*/
@SuppressWarnings("SpellCheckingInspection")
class Kodilla {
   @SuppressWarnings("SpellCheckingInspection")
   public static void main (String[] args) {
       
       
       int sumaA = 1000;
       int sumaB = 0;
       int tryCounter = 0;
       
       Random randomGenerator = new Random();

       /*
       for( int n = 1; n < 11; n=n+1)  {
       tryCounter = 19 * n + tryCounter;
       System.out.println("Attepmt " + tryCounter);
       }

       */


       while(sumaA > sumaB) {
      	tryCounter++;
      	sumaA = sumaA + randomGenerator.nextInt(10);
      	sumaB = sumaB + randomGenerator.nextInt(50);
      	System.out.println(sumaA);
      	System.out.println(sumaB);
      	
      	
      	System.out.println("Attempt " + tryCounter);
      }
      	
      
   }
}