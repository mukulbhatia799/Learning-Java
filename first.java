public class first extends Thread {
    public static void main(String[] args) {
        Thread th = new Thread();
        th.setName("thread1");
        System.out.println(th.getName());

        Runnable runnable = () -> {
            for(int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}