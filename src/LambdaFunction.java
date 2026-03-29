
    interface Add {
        int sum(int a, int b);
    }
    interface Concat {
        String join(String s1, String s2);
    }
    public class LambdaFunction {
        public static void main(String[] args) {
            Add addition = (a, b) -> a + b;
            Concat concatenate = (s1, s2) -> s1 + s2;
            System.out.println("Addition = " + addition.sum(10, 20));
            System.out.println("Concatenation = " + concatenate.join("Hello ", "World"));
        }
    }

