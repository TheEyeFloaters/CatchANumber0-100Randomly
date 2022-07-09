public class TestNumber {
    public static void main(String[] args) {
        int TestNumber = 101;
        int i = 0;
        while (TestNumber > 100) {
            TestNumber = (int) (Math.random() * 1000000000);
            System.out.println(i);
            i = i + 1;

        }

    }

}