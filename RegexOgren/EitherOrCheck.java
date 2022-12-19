package RegexOgren;
//import org.junit.Test;
//
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//
//public class EitherOrCheck {
//    @Test
//    public void testSimpleTrue() {
//        String s = "humbapumpa jim";
//        assertTrue(s.matches(".*(jim|joe).*"));
//        s = "humbapumpa jom";
//        assertFalse(s.matches(".*(jim|joe).*"));
//        s = "humbaPumpa joe";
//        assertTrue(s.matches(".*(jim|joe).*"));
//        s = "humbapumpa joe jim";
//        assertTrue(s.matches(".*(jim|joe).*"));
//    }
//}

public class EitherOrCheck {

    public static void main(String[] args) {


        String s = "humbapumpa jim";
        System.out.println(s.matches(".*(jim|joe).*"));
        s = "humbapumpa jom";
        System.out.println(s.matches(".*(jim|joe).*"));
        s = "humbaPumpa joe";
        System.out.println(s.matches(".*(jim|joe).*"));
        s = "humbapumpa joe jim";
        System.out.println(s.matches(".*(jim|joe).*"));
        System.out.println(s.matches(".*(jim|joe).*"));



        System.out.println("check Phonmes" );
        String pattern = "\\d\\d\\d([,\\s])?\\d\\d\\d\\d([,\\s])?\\d\\d([,\\s])?\\d\\d";
        s= "1233323322";
        System.out.println(s.matches(pattern));
        s = "1233323";
        System.out.println(s.matches(pattern));
        s = "123 3323";
        System.out.println(s.matches(pattern));
        s = "123 3323 22 33";
        System.out.println(s.matches(pattern));
    }
}