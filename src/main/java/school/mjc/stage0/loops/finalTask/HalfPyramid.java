package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int i,j,k;
        for(i=cathetusLength;i>=1;i--){
            for(j=i;j>=2;j--){
                System.out.print(" ");
            }
            for(k=1;k<=cathetusLength-i+1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}