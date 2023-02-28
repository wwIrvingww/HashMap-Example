import java.util.HashMap;
import java.util.Queue;
import java.util.Random;
public class main {
    public static void main(String[] args) {
        int i = 0;

        var stack = new Stack(100);
        Elemento [] array = new Elemento [100];
        var hashmap = new HashMap<>();

        while (i<100){
            String name = generador();
            Random rand = new Random();
            int ID = rand.nextInt();
            Elemento elemento = new Elemento(name, ID);
            stack.push(elemento);
            array[i] = elemento;
            hashmap.put(generador(),elemento);

            i++;

        }

        System.out.println("Elementos en la stack");


    }


    public static String generador() {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        System.out.println(generatedString);
        return generatedString;
    }



}
