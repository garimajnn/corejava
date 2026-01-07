package exception;

public class Main {
   static String s;

   public  static void gari() throws Exception{
       System.out.println("Garima");
               throw new RuntimeException();
   }

    public static void main(String[] args)  {
        s="ga";
        try{
            gari();

        }
        catch (Exception e){
            System.out.println("Runtime exception "+e.getMessage());
        }

    }
}
