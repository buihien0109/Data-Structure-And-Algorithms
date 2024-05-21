public class _1108_Defanging_an_IP_Address {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char curr = address.charAt(i);
            if(curr == '.') {
                sb.append('[').append(curr).append(']');
            } else {
                sb.append(curr);
            }
        }
        return sb.toString();
    }
}
