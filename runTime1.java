public class runTime1 {
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();
        //we then have our program
        Thread.sleep(3000);

        long duration = (System.nanoTime() - start) / 1000000000;
        
        System.out.println("The program took: " + duration + " s");
    }
    
}
