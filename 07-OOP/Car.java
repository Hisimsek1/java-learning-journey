public class Car {
    // Public : Herkes erisebilir.
    // Private : Sadece bulundugu class icinde kullanılabilir.
    // Protected : Aynı package + miras alan classlar icin

    private int enginePower,speed ,engine;
    protected String color;

    Car()
    {
        this.engine = 2020;
        this.enginePower = 300;
        this.speed = 120;
        this.color = "red";
    }

    public void print()
    {
        System.out.println(engine);
    }
}
