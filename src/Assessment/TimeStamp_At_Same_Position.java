package Assessment;

public class TimeStamp_At_Same_Position {
    public static void main(String[] args){
        Time time = new Time();
        Thread thread = new Thread(time);
        thread.start();

    }
}

class Time implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println(i);

            System.out.print("\033[H\033[2J");
            System.out.flush();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
