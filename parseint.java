/**
 * parseint
 */
public class parseint {

    public static void main(String[] args) {
        
        String a = "123";

        // use we convert string (in number value) to integer value we use the : Integer.parseInt(a) 
        int num = Integer.parseInt(a);

        // in here, a is string and 1 in integer so print : 1231
        System.out.println(a + 1);

        // in here, num is convert a(string value) to num(integer value) then a is int and 1 is int so print : 124(123 + 1)
        System.out.println(num + 1);


    }
}