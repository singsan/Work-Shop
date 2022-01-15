package com.sancode.invent.workshop.concurrency;

import com.sancode.invent.workshop.model.Mechanic;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.lang.Thread.sleep;

public class CompletableFutureDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFutureDemo cfDemo = new CompletableFutureDemo();
       // Future<Mechanic> mechanicFuture = cfDemo.getAsyncMechanic();
        CompletableFuture  completableFuture = new CompletableFuture();
//        System.out.println(mechanicFuture.get());
        var completableFutureSupplyAsync = CompletableFuture.supplyAsync(()->"Hello");
        var completableFutureThenApply = completableFuture.thenApply((i)-> i +"Hello");

        System.out.println(completableFutureSupplyAsync.get()+" "+completableFutureThenApply.get());

    }

    private Future<Mechanic> getAsyncMechanic() throws InterruptedException {
        CompletableFuture<Mechanic> mechanicCompletableFuture = new CompletableFuture<>();
        Executors.newCachedThreadPool().submit(() -> {
            sleep(1000);
            mechanicCompletableFuture.complete(Mechanic.builder().mechanicName("sanjay_completable").build());
            return null;
        });


        return mechanicCompletableFuture;
    }

}
