package Third.Sequence;

import java.util.Random;

public class Sequence {
    public static void main(String[] args) {
        int[] digi = new int[4];
        Random rangen = new Random();
        Integer seq = null;
        boolean flag = true;
        for (int i = 0; i < 4; i++) {
            digi[i] = rangen.nextInt(0, 100);
            System.out.println(digi[i]);
            if (seq == null || seq < digi[i]){
                seq = digi[i];
            }
            else{
                flag = false;
            }
        }

        if (!flag){
            System.out.println("Not sequential");
        }
        else{
            System.out.println("Sequential");
        }

    }
}
