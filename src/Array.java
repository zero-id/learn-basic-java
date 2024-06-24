public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Abdul";
        stringArray[1] = "Latif";
        stringArray[2] = "Faturahman";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);
        System.out.println(stringArray);

        String[] stringArray2 = new String[3];

        String[] namaNama = {
            "Abdul", "Latif", "Faturahman"
        };

        namaNama[0] = null;

        int[] arrayInt = new int[] {
                1,2,3,4,5,6,7,8,9
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Abdul", "Latif"},
                {"Restu", "Wibowo"},
                {"Aris", "Kiplan"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][1]);




    }
}
