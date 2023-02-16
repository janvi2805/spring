package spring.models;

import java.sql.Timestamp;
import java.util.Random;

public class Sum {
    
    Random random = new Random();
    Timestamp timeStamp = new Timestamp(System.currentTimeMillis());

    public int randomValue = random.nextInt(23);
    public int timestamp = (int) timeStamp.getTime();

    public int getTotal() {
        return randomValue + timestamp;
        //return random.nextInt(5) + (int) timeStamp.getTime();
    }
}
