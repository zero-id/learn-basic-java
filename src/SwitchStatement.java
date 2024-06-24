public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda lulus dengan nilai bagus!");
                break;
            case  "B":
            case  "C":
                System.out.println("Selamat, Anda lulus!");
                break;
            case  "D":
                System.out.println("Anda Tidak lulus!");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan!");
        };

        switch (nilai) {
            case "A" -> System.out.println("Wow, Anda lulus dengan nilai bagus!");
            case "B", "C" -> System.out.println("Selamat, Anda lulus!");
            case "D" -> System.out.println("Anda belum lulus!");
            default -> {
                System.out.println("Mungkin anda belum lulus");
            }
        }

        String ucapan;

        switch (nilai) {
            case "A" -> ucapan = "Wow, Anda lulus dengan nilai bagus!";
            case "B", "C" -> ucapan ="Selamat, Anda lulus!";
            case "D" -> ucapan = "Anda belum lulus!";
            default -> {
                ucapan = "Mungkin anda belum lulus";
            }
        }

        System.out.println(ucapan);

        ucapan = switch (nilai) {
            case "A":
                yield "Wow, Anda lulus dengan nilai terbaik!";
            case  "B":
            case  "C":
                yield  "Selamat, Anda lulus!";
            case  "D":
                 yield  "Anda Tidak lulus!";
            default:
                yield  "Mungkin anda salah jurusan!";
        };

        System.out.println(ucapan);
    }
}
