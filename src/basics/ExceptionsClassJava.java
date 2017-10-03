package basics;

import java.io.IOException;

public class ExceptionsClassJava {

    public static void main(String[] args) {
        try {
            canThrowException();
        } catch (IOException e) {
            e.printStackTrace();
        }

        canThrowRuntimeException();
    }

    // Checked exception
    private static void canThrowException() throws IOException {
        throw new IOException();
    }

    // Unchecked exception - All exceptions in Kotlin are unchecked
    private static void canThrowRuntimeException()  {
        throw new IllegalStateException();
    }
}
