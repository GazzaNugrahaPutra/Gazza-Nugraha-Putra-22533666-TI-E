package exception;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println("Panjang string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Terjadi NullPointerException. String tidak boleh null.");
        }
    }
}
