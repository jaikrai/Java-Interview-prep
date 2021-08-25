package interviewQuestion.threadSafty;

import java.util.Arrays;
import java.util.List;

public class ThreadLocal extends Thread {
    private final List<Integer> numbers = Arrays.asList(1,2,3,4);

    @Override
    public void run(){
        numbers.forEach(System.out::println);
    }
}
