import java.util.Scanner;

/**
 * Program ini untuk menghitung luas pada bangun datar yaitu Persegi, Persegi Panjang, Lingkaran, dan Segitiga
 * Pada program ini akan diminta memilih dulu bangun datar yang akan dihitung
 * lalu memasukkan angka sesuai dengan bangun datar yang dipilih
 * setelah itu, hasil dari perhitungan bangun datar akan ditammpilkan
 */

public class ShapeAreaCalculator {

    /**
     * Metode utama untuk menjalankan program.
     * Meminta pilihan bangun datar mana yang akan dihitung
     * masuk ke salah satu method yang bangun datarnya dipilih
     * meminta input angka dari pengguna sesuai bangun datar yang dipilih
     * menampilkan hasil perhitungan bangun datar
     *
     * @param args Argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun datar untuk menghitung luas:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double side = getInput(scanner, "Masukkan panjang sisi persegi: ");
                double squareArea = calculateSquareArea(side);
                printArea("Luas persegi", squareArea);
                break;
            case 2:
                double length = getInput(scanner, "Masukkan panjang: ");
                double width = getInput(scanner, "Masukkan lebar: ");
                double rectangleArea = calculateRectangleArea(length, width);
                printArea("Luas persegi panjang", rectangleArea);
                break;
            case 3:
                double radius = getInput(scanner, "Masukkan jari-jari lingkaran: ");
                double circleArea = calculateCircleArea(radius);
                printArea("Luas lingkaran", circleArea);
                break;
            case 4:
                double base = getInput(scanner, "Masukkan alas segitiga: ");
                double height = getInput(scanner, "Masukkan tinggi segitiga: ");
                double triangleArea = calculateTriangleArea(base, height);
                printArea("Luas segitiga", triangleArea);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    /**
     * Method untuk melakukan inputan angka
     *
     * @param scanner Scanner untuk membaca input pengguna
     * @param message message untuk menampilkan hasil inputan
     * @return angka yang dimasukkan oleh pengguna
     */
    private static double getInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    /**
     * Method untuk melakukan perhitungan Luas Persegi
     *
     * @param side digunakan sebagai rumus luas persegi sisi * sisi
     * @return hasil dari perhitungan rumus luas persegi
     */
    private static double calculateSquareArea(double side) {
        return side * side;
    }

    /**
     * Method untuk melakukan perhitungan Luas Persegi Pannjang
     *
     * @param length digunakan sebagai panjang dari sisi Persegi Panjang
     * @param width digunakan sebagai lebar dari sisi Persegi Panjang
     * @return hasil dari perhitungan rumus luas Persegi Panjang
     */
    private static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    /**
     * Method untuk melakukan perhitungan Luas Lingkaran
     *
     * @param radius digunakan sebagai jari - jari dari sebuah Lingkaran
     * @return hasil dari perhitungan rumus luas Lingkaran
     */
    private static double calculateCircleArea(double radius) {
        return 3.14 * radius * radius;
    }

    /**
     * Method untuk melakukan perhitungan Luas Segitiga
     *
     * @param base digunakan sebagai alas dari sebuah Segitiga
     * @param height digunakan sebagai tinggi dari sebuah Segitiga
     * @return hasil dari perhitungan rumus Luas Segitiga
     */
    private static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    /**
     * Method untuk menampilkan hasil perhitungan sesuai bangun datar yang dipilih
     *
     * @param shape digunakan sebagai Nama bangun datar yang dihitung
     * @param area digunakan sebagai hasil luas bangun datar
     */
    private static void printArea(String shape, double area) {
        System.out.println(shape + ": " +area);
}
}
