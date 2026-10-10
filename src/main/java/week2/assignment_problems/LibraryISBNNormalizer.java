package week2.assignment_problems;

public class LibraryISBNNormalizer {

    static void normalizeISBN(String isbn) {
        String normalized = isbn.replace("-", "").replace(" ", "");

        if (normalized.length() == 10 || normalized.length() == 13) {
            System.out.println(normalized);
        } else {
            System.out.println("Invalid ISBN");
        }
    }

    public static void main(String[] args) {
        normalizeISBN("978-0-123456-47-2");
        normalizeISBN("12345");
    }
}
