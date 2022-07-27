package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int result = numberToPrint;
        for (int i=1; i<power; i++){
            result = result*numberToPrint;
        }
        System.out.println(result);
    }
}