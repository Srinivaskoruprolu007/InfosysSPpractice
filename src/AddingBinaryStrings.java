public class AddingBinaryStrings {
    public static void main(String[] args) {
        String a = "1101",b="100";
        System.out.println(addBinary(a,b));

    }
    static String addBinary(String a, String b){
        if(a.charAt(0)=='0' && a.charAt(0)=='0'){
            return "0";
        }
        StringBuilder res = new StringBuilder();
        int sum = 0;
//        traverse both strings starting from last characters
        int i = a.length()-1, j = b.length()-1;
        while (i >= 0 || j >= 0 || sum==1){
            sum+=((i>=0)? a.charAt(i)-'0':0);
            sum+=((j>=0)? b.charAt(j)-'0':0);
            res.append((char) (sum % 2 + '0'));
            sum/=2;
            i--;j--;
        }
        int start = res.length()-1;
        while (start>=0 && res.charAt(start)=='0'){
            start--;
        }
        if(start!=res.length()-1){
            res.delete(start+1,res.length());
        }
        return res.reverse().toString();
    }
}
