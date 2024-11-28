package ua.edu.ucu.task2;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@Data
@Builder
public class Client {
    private static AtomicInteger counter = new AtomicInteger();
    private final int id = counter.incrementAndGet();
    private String name;
    private int age;
    private String gender;
    private String email;

}
