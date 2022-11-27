package logicalprogramming;

    import java.util.Scanner;

    public class StopWatch {
        public long startTimer=0;
        public long stopTimer=0;
        public long elapsed;
        public static void main(String[] args) {

            StopWatch st = new StopWatch();
            Scanner sc = new Scanner(System.in);
            System.out.println("Press '1' to Start Time: ");
            int start = sc.nextInt();
            if (start == 1) {
                st.start();
            }

            System.out.println();
            System.out.println("Press '2' to Stop Time: ");
            int stop = sc.nextInt();
            if (stop == 2 ) {
                st.stop();
            }

            long l= st.getElapsedTime();
            System.out.println();
            System.out.println("Total Time Elapsed(in millisec) is:"+l);
            System.out.println();
            System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
        }
        public void start()
        {
            startTimer=System.currentTimeMillis();
            System.out.println("Start Time is: "+startTimer);
        }
        public void stop()
        {
            stopTimer=System.currentTimeMillis();
            System.out.println("Stop Time is: "+stopTimer);
        }
        public long getElapsedTime()
        {
            elapsed=stopTimer-startTimer;
            return elapsed;
        }
    }


