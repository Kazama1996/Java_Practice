package Launcher.ipml;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

import Launcher.Launcher;

class MyProducer implements Runnable {

    private ArrayBlockingQueue<String> buffer;
    private String color;

    public MyProducer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        Random random = new Random();
        String[] nums = { "1", "2", "3", "4", "5" };
        for (String num : nums) {
            try {
                System.out.println(color + "Adding......" + num);
                buffer.put(num);
                Thread.sleep(random.nextInt(1000));

            } catch (InterruptedException ex) {
                System.out.println("Producer was interrupt");
            }

        }
        System.out.println(color + "Adding EOF and exiting......");

        try {
            buffer.put("EOF");
        } catch (InterruptedException ex) {

        }

    }

}

class MyCosumer implements Runnable {

    private ArrayBlockingQueue<String> buffer;
    private String color;
    ReentrantLock bufferLock;

    public MyCosumer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (buffer.isEmpty()) {
                    continue;
                }
                if (buffer.peek().equals("EOF")) {
                    System.out.println(color + "Exiting");
                    break;
                } else {
                    System.out.println(color + "Remove" + buffer.take());
                }
            } catch (InterruptedException ex) {

            }

        }
    }

}

public class ConcurrencyLauncher implements Launcher {

    @Override
    public void launch() throws CloneNotSupportedException {

        int size = 6;

        for (int i = 0; i < size; i++) {

            for (int k = 0; k < size - 1 - i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = size - 1; i > 0; i--) {
            for (int k = 0; k < size - i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);

        // ExecutorService executorService = Executors.newFixedThreadPool(3);

        // MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_GREEN);
        // MyCosumer cosumer1 = new MyCosumer(buffer, ThreadColor.ANSI_RED);
        // MyCosumer cosumer2 = new MyCosumer(buffer, ThreadColor.ANSI_BLUE);

        // executorService.execute(producer);
        // executorService.execute(cosumer1);
        // executorService.execute(cosumer2);

        // executorService.shutdown();

    }

}
