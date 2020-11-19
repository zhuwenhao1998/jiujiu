import java.util.jar.JarOutputStream;

/**
 * Author:  create by zwh
 * Time:2020/11/4 13:57
 */
public class a {
    public static void main(String[] args) {
//        String s1="abc";
//        String s2="abc";
//        System.out.println("s1==s2"+(s1==s2)+"s1.equals(s2)"+s1.equals(s2));
//        String s3 = new String("abc");
//        System.out.println("s1==s3"+(s1==s3)+"s1.equal(s3)"+s2.equals(s3));
        String a1="abc"+"def";
        String a2="abcdef";
        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));
        String a3 = new String("abcdef");
        System.out.println(a1==a3);
        System.out.println(a2==a3);
        System.out.println(a1.equals(a3));
        System.out.println(a2.equals(a3));
    }
}
