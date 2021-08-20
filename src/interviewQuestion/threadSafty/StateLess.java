package interviewQuestion.threadSafty;

import java.math.BigInteger;

/**
 * Approach using stateless implementation
 * Here factorial() method is a stateless deterministic function where given a
 * specific input it always produces the same output
 * The method neither relies on external state nor maintains state at all. Hence, it's considered
 * to be thread-safe and can be safely called by multiple threads at the same time.
 *
 * All threads can safely call the factorial() method and will get the expected result
 * without interfering with each other and without altering the output that the method
 * generates for other threads
 */
public class StateLess {
    public static BigInteger factorial(int num){
        BigInteger factor = new BigInteger("1");
        for (int i = 2; i <num; i++){
            factor = factor.multiply(BigInteger.valueOf(i));
        }
        return factor;
    }

    public static void main(String[] args) {
        System.out.println(factorial(9));
    }
}
