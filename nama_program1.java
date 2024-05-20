public class nama_program1 {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Sebelum pertukaran: a = " + a + ", b = " + b);
        
        // Menukar nilai a dan b tanpa menggunakan variabel sementara
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("Setelah pertukaran: a = " + a + ", b = " + b);
    }
}
