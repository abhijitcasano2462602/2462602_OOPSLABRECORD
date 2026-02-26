package practical;

import java.util.Random;  

// Generator thread
class NumberGenerator extends Thread {
    private Random rand = new Random();
    private boolean running = true;

    @Override
    public void run() {
        while (running) {
            int number = rand.nextInt(100); 

            System.out.println("REG NO: 2462602");
            System.out.println("[Generator] Number generated: " + number);

            if (number % 2 == 0) {
                new EvenThread(number).start();
            } else {
                new OddThread(number).start();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Generator stopped");
                running = false;
            }
        }
    }
}

// Even thread
class EvenThread extends Thread {
    private int num;

    EvenThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("[Even Thread] Square of " + num + " = " + (num * num));
    }
}

// Odd thread
class OddThread extends Thread {
    private int num;

    OddThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("[Odd Thread] Cube of " + num + " = " + (num * num * num));
    }
}


public class MultithreadingDemo {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        generator.start();
    }
}