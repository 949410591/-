public class ProgramRunTime {
    public static void main(String[] args) throws Exception {

        long startTime = System.currentTimeMillis();


        for (int i = 0; i <1000000000 ; i++) {


        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)+"ms");

    }
}
