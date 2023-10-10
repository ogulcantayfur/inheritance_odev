public class Car
{
    private Engine engine;
    private String brand;
    private String model;

    public Engine getEngine()
    {
        return engine;
    }

    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }

    public String getMarka()
    {
        return brand;
    }

    public void setMarka(String marka)
    {
        this.brand = marka;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void gazVer(){
        System.out.println("Araba hızlandı");
    }

    public void frenYap(){
        System.out.println("Araba yavaşladı");
    }


}
