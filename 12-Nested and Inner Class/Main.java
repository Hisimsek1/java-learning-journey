public class Main {
    public static void main(String[] args) {
        // Nested Class ( İc ice siniflar)
        //  -Inner Class(İc siniflar)
        //      -Static
        //      -Non Static
        //  - Local Class(Yerel Siniflar)
        //  - Anonymus Class (Anonim siniflar)


        InnerNonStatic a = new InnerNonStatic();
        InnerNonStatic.Inner inner  =  a.new Inner();
        //inner.run();

        InnerStatic.inner innerStatic = new InnerStatic.inner();

        Local l = new Local();
      
        l.run();

        Anonim c = new Anonim();
        //c.run();
        Anonim b = new Anonim(){
            public void run()
            {
                System.out.println("Anonim sinifina ait");
            }
        };
        b.run();
    }
}
