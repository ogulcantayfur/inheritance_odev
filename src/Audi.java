public class Audi extends Car
{
    Audi(String model, Engine engine)
    {
        setMarka("Audi");
        setModel(model);
        setEngine(engine);
    }

    public void audiOtonom()
    {
        System.out.println("Audi otonom çalıştı");
    }

    public void audiCarInfo()
    {
        System.out.println(getMarka());
        System.out.println(getModel());
        System.out.println(getEngine().getEnginePower());
        System.out.println(getEngine().getCylinderVolume());

    }


}
