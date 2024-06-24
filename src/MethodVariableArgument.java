public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values ={80, 90, 80, 70,50};
        sayCongrats("Restu", values );
        sayCongrats("Abdul Latif", 90,90,90,100,80 );

    }

    static void sayCongrats(String name, int... values) {
      var total = 0;
      for (var value: values) total += value;

      var finalValue = total / values.length;

      if(finalValue >= 75) System.out.println("Selamat " + name + ", Anda lulus");
      else System.out.println("Maaf, Anda tidak lulus!");
    };
}
