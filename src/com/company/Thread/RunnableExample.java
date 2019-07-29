package com.company.Thread;

import java.util.concurrent.*;

public class RunnableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Double> f1 = service.submit(new AreaOfCircle(4.0));
        Future<Double> f2 = service.submit(new CircumferenceOfCircle(4.0));
        System.out.println("Area of circle is -: "+f1.get());
        System.out.println("Circumference of circle is -: "+f2.get());
        service.shutdown();
    }
}

class AreaOfCircle implements Callable<Double>{

    double radius=0.0;
    AreaOfCircle(Double r)
    {
        this.radius=r;
    }

    @Override
    public Double call()throws Exception{
        return Math.PI*radius*radius;
    }
}

class CircumferenceOfCircle implements Callable<Double> {

    double radius = 0.0;
    CircumferenceOfCircle(double d){
        radius=d;
    }

    @Override
    public Double call() {
        return 2*Math.PI*radius;
    }
}
