public class Converter {
    public static String convert(int number, int system) {
        char[] digits = "0123456789ABCDEF".toCharArray();
        StringBuilder result = new StringBuilder();

        if(number>0) {
        while(number > 0) {
            int remainder = number % system;
            number /= system;
            result.insert(0, digits[remainder]);
        }
        } else {
            result.insert(0, "num is not positive");
        }

        return result.toString();
    }
}
