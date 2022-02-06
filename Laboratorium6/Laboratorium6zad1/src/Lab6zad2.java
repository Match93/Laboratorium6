/*Zadanie 2. Zwierzęta
        Proszę zaimplementować aplikację obrazującą Zwierzęta i ich podstawowe czynności (płynie, wynurza
        się, zanurza, wydala, leci, ląduje). Wskazówka: Należy utworzyć dwa interfejsy: Pływanie z metodami
        plyn(), wynurz(), zanurz() oraz interfejs Latanie z metodami lec(), wyladuj(). Klasę Zwierze należy
        zmodyfikować tak aby była klasą abstrakcyjną. Klasę Ryba również by była abstrakcyjna. W klasie
        Ryba powinny się znaleźć metody jedz() i wydalaj().
        Gotowe rozwiązanie powinno zostać przetestowane poprzez utworzenie nowego Zwierzaka gatunku
        Wieloryb i sprawdzenie jego działania

 */
public class Lab6zad2 {
    public static void main(String[]args){
        Pływanie w1= new Wieloryb();
        w1.płyń();
        w1.wynurz();
        w1.zanurz();

    }

    }


