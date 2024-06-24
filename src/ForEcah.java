public class ForEcah {
    public static void main(String[] args) {
        String[] names = {
                "Abdul", "Latif", "Faturahman", "Zero", "Ngoding"
        };

        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("FOR EACH");

        for (var value : names) {
            System.out.println(value);
        }
    };
}
