public class MainClass
{
    public static void main(String[] args)
    {

        Audi a5 = new Audi("a5", new DieselEngine(110, 1.5));
        Audi a3 = new Audi("a3", new GasolineEngine(90, 1.0));
        a5.audiCarInfo();
        a5.gazVer();
        a5.frenYap();
        a5.audiOtonom();
    }


}
