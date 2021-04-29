package phonebook;
//Egy alkalmazást írunk, ahol a megrendelő szeretné az alkalmazásban tárolt ügyfeleit és azok telefonszámát exportálni fájlba.
//
//Hozd létre a Phonebook osztályt, és abban az exportPhonebook(Map<String, String> contacts, String output) metódust!
//
//A paraméterben kapott mapben a kulcsok nevek, az értékek pedig telefonszámok. Írd ki az összes kulcs-érték párt az outputként megadott címre, minden kulcs-érték párt egy új sorba, az alábbi szintaxisban:
//
//név: telefonszám
//
//A kiírás sorrendje a fájlba nem fontos, de a map összes elemét pontosan egyszer írd ki a fájlba!
//
//Láthatod, hogy a tesztesetek a phonebookOutput könyvtárba dolgoznak. Ezt hozd létre, hogy az osztályod tudjon bele írni!
//
//Nem szükséges figyelni arra, hogy ne tárold a teljes fájltartalmat memóriában. Azaz használhatsz akár Files egy metódusát fájlba írásra, akár Writer példányt is.
//
//Ha a metódus akármelyik paraméternek null értéket kapna, akkor dobj IllegalArgumentException-t!

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {


    public void exportPhonebook(Map<String, String> contacts, String output) throws IOException {

        if (contacts == null) {
            throw new IllegalArgumentException("This map is null");
        }

        if (output == null) {
            throw new IllegalArgumentException("This output is wrong");
        }


        else {
            BufferedWriter phonebook = new BufferedWriter(new FileWriter(output));
            for (int i = 0; i < contacts.size(); i++ ) {
                String line = contacts.get(i) + " : " + contacts.entrySet();
                phonebook.write(line);
            }

        }
   }

}
