/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa 
tutti i numeri fino al valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.*/

public class MyClass {
    public static void main(String args[]) {
      int num = 10;
      printNum(num);
    }
    
    public static void printNum(int a) {
        for (int i = 0; i<=a; i++) {
            if (i == 5){
                break;
            }
            System.out.println(i);
        }
    }
}