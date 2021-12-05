package by.overone.lesson28homework;


import java.util.HashMap;

public class Main {
    private static int Robots;

    public static void main(String[] args) throws InterruptedException {
        Producer producer = new Producer();
       HashMap<String,Integer> first = producer.dump();
       HashMap<String, Integer> producer1 = producer.dumpNext(first);

        Consumer consumer = new Consumer();
        HashMap<String,Integer> second = consumer.stock(producer1);
        int consumerOne = consumer.robotsCreate(second);

        System.out.println(first);
        System.out.println(producer1);
     //   System.out.println(second);
       System.out.println(consumerOne);

        }
    }