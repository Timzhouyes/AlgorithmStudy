package LeetCode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) throws NumberFormatException {
        if (x == 0) {
            return 0;
        }
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }
        Integer y = new Integer(x);
        String container = y.toString();

        StringBuilder characters = new StringBuilder();

        if (container.charAt(0) == '-') {
            characters.append('-');
            if (container.charAt(container.length() - 1) != '0') {
                characters.append(container.charAt(container.length() - 1));
            }
            for (int i = container.length() - 2; i > 0; i--) {
                characters.append(container.charAt(i));
            }
            try {
                return Integer.parseInt(characters.toString());
            } catch (NumberFormatException e) {
                return 0;
            }
        } else {
            if (container.charAt(container.length() - 1) != '0') {
                characters.append(container.charAt(container.length() - 1));
            }
            for (int i = container.length() - 2; i >= 0; i--) {
                characters.append(container.charAt(i));
            }
            try {
                return Integer.parseInt(characters.toString());
            } catch (NumberFormatException e) {
                return 0;
            }
        }

    }
}
