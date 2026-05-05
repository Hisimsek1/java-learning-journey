public class Local {
    public void run()
    {
        class Yerel
        {
            int a;
            Yerel(int a)
            {
                this.a = a;
            }

            public void print()
            {
                System.out.println(a);
            }
        }

        Yerel a = new Yerel(10);
        a.print();
    }
}
