package Week02;

public class LogicalOperator {
    public static void main(String[] args) {
        //mantıksal operator

        String username="hasankadirdemircan";
        int pasword=123456;

        String username2 = "ruveydaylmz";
        int pasword2 = 12345679;
        String str1="Ruveyda";
        String str2 ="Ruveyda";

           System.out.println(username.equals("hasankadirdemircan"));
            System.out.println(username.equals("hasankandemir"));
            System.out.println(pasword == 123456);
            System.out.println(pasword == 0123456);

            if(username.equals("hasankadirdemircan")  && pasword== 123456){
                System.out.println("giriş başarılı");

             System.out.println("--------------------------------------");
            //-------------------


            System.out.println(str1+str2);

            String str3 = new String("Ruveyda");
            String str4 = new String ("Ruveyda");

            System.out.println(str4);

            System.out.println(username2.equals("ruveydaylmz"));
            System.out.println(username2.equals("ruveyda"));

            //toLowerCase() -> harfleri küçük hale getirir
            //toUpperCase() -> harfleri büyük hale getirir
            if (username2.equals(new String("ruveydaylmZ").toLowerCase()) && pasword2 ==12345679){
                System.out.println("giriş başarılı2");
            }







        }

















    }
}
