//Hozd létre az AddDigits osztályt, és annak az addDigits(String input) metódusát.
//
//A metódus feladata, hogy a paraméterben kapott Stringben található összes számjegyet adja össze, és
// ennek az összegét adja vissza. Ha a bemeneti String üres, vagy null, adjon vissza -1 értéket.

package addigits;

public class AddDigits {

    public int addDigits(String s) {
        int summery = 0;
        if (s == null || s.equals("")) return -1;
        else {
            int stringLenght = s.length();

            for (int i = 0; i < stringLenght; i++) {
                int numericValue = Character.getNumericValue(s.charAt(i));

                if (numericValue < 10 && numericValue > -1) {
                    summery = summery + numericValue;
                }
            }
        }
        return summery;
    }
}
