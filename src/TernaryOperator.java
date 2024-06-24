public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan = nilai >= 75 ? "Selamat anda lulus" : "Silahkan coba lagi!";

        System.out.println(ucapan);
        
        if (nilai >= 75) {
            ucapan = "Selamat Anda Lulus!";
        } else {
            ucapan = "Silahkan coba lagi!";
        }

        System.out.println(ucapan);
    }
}
