public class App {
    static final int MAX=4;
    public static void main(String[] args) throws Exception {
      String nomi[]={"Marco","Matteo","Michele","Giovanni"};
      Corridore lista[]= new Corridore[MAX];
        //Corridore c1=new Corridore("Marco");
     // Corridore c2=new Corridore("Matteo");
      //Corridore c3=new Corridore("Michele");
     // Corridore c4=new Corridore("Giovanni");
       

      for(int i=0;i<MAX;i++)
      {
        lista[i]=new Corridore(nomi[i]);
        lista[i].start();
      }
       

    }
}
