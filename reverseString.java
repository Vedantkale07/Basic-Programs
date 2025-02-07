public class reverseString {
    public static void main(String[] args) {
        
        String s="vedant";
        String r="";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            
            ch= s.charAt(i);
            r=ch+r;

        }
        System.out.println("reverse:"+ r);
    }
}
