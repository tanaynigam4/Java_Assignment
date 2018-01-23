public class Solution {

    public static void main(String args[]) {
        int n = 0;
        int s = 0;
        int e = 0;
        int w = 0;
        long t = System.currentTimeMillis();
        long timeout = t + 20000;
        long new_time = System.currentTimeMillis();
        long t0 = System.currentTimeMillis();
        long t3 = System.currentTimeMillis();
        long t2 = System.currentTimeMillis();
        long t4 = System.currentTimeMillis();
        long t5 = System.currentTimeMillis();
        boolean snell = true;
        boolean weaver = false;
        System.out.println("N = "+n+ "S = "+s+ "E = "+e+ "W = "+w);

        while(System.currentTimeMillis() < timeout) {
            new_time = System.currentTimeMillis();

            if (new_time - t0 >= 1000) {
               System.out.println("N = " + n + " S = " + s + " E = " + e + " W = " + w);
               t0 = new_time;
           }


            if (new_time - t2 >= 3000) {
                snell = !snell;
                weaver = !weaver;
                t2 = new_time;
                t4 = new_time;
                t5 = new_time;
            }

            if (new_time - t3 >= 1000) {
                n++;
                s++;
                e++;
                w++;
                t3 = new_time;
            }

            if (snell == true) {
                if (new_time - t4 >= 2000) {
                    n--;
                    s--;
                    t4 = new_time;
                }

                if (new_time - t5 >= 3000) {
                    n--;
                    s--;
                    t5 = new_time;
                }

            } else if (weaver == true) {
                if (new_time - t4 >= 2000) {
                    e--;
                    w--;
                    t4 = new_time;
                }
                if (new_time - t5 >= 3000) {
                    e--;
                    w--;
                    t5 = new_time;
                }


            }


        }
    }
}
