package interviewQuestion;

public class ComplexNumber {
    public static String complexNumberMultiply(String num1, String num2){
        // Split the real and imaginary parts
        // of the given complex string based on '+'
        // and 'i' symbol
        String x[] = num1.split("\\+|i");
        String y[] = num2.split("\\+|i");

        // Store the real num part of complex number
        int num1_real = Integer.parseInt(x[0]);
        // Store the real num part of complex number
        int num1_img = Integer.parseInt(x[1]);
        // Store the real num part of complex number
        int num2_real = Integer.parseInt(y[0]);
        // Store the real num part of complex number
        int num2_img = Integer.parseInt(y[1]);

        // return the product
        return (num1_real * num2_real - num1_img * num2_img) + "+" +
                (num1_real * num2_img + num1_img * num2_real) + "i";
    }

    public static void main(String[] args) {
        String str1 = "1+1i";
        String str2 = "1+1i";
        System.out.println(complexNumberMultiply(str1, str2));
    }
}
