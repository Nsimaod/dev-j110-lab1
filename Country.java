public class Country {

    private String name;

    private double square;
    private double population;
    private String capitalName;
    private double capitalPopulation;

    public Country(String name, double square, double population, String capitalName, double capitalPopulation)
    {
        this.name = name;
        this.square = square;
        this.population = population;
        this.capitalName = capitalName;
        this.capitalPopulation = capitalPopulation;
    }

    public Country(String name, double square, double population)
    {
        this.name = name;
        this.square = square;
        this.population = population;
    }

    public Country(String name, double square, String capitalName)
    {
        this.name = name;
        this.square = square;
        this.capitalName = capitalName;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName (String name) throws IllegalArgumentException
    {
        if(name==null)
        {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) throws IllegalArgumentException
    {
        if(square<=0)
        {
            throw new IllegalArgumentException();
        }
        this.square = square;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) throws IllegalArgumentException
    {
        if(population<=0)
        {
            throw new IllegalArgumentException();
        }
        this.population = population;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) throws IllegalArgumentException
    {
        {
            if(capitalName==null)
            {
                throw new IllegalArgumentException();
            }
        }
        this.capitalName = capitalName;
    }

    public double getCapitalPopulation() {
        return capitalPopulation;
    }

    public void setCapitalPopulation(double capitalPopulation) throws IllegalArgumentException
    {
        if(capitalPopulation<=0)
        {
            throw new IllegalArgumentException();
        }
        this.capitalPopulation = capitalPopulation;
    }

    public double getDensity()
    {
        return population/(double)square;
    }

    public void setCapital(String capName, int capPopulation) throws IllegalArgumentException
    {
        if(capName==null)
        {
            throw new IllegalArgumentException();
        }
        if(capPopulation<=0)
        {
            throw new IllegalArgumentException();
        }
        this.capitalName=capName;
        this.capitalPopulation=capPopulation;
    }

    public void print()
    {
        System.out.print("Name: "+name+", Square: "+square);
        if(population!=0)
        {
            System.out.print(", Population: "+population);
        }
        if(capitalName!=null)
        {
            System.out.print(", Capital: "+capitalName);
            if(capitalPopulation!=0)
            {
                System.out.print(", Capital population: " + capitalPopulation);
            }
        }
        System.out.println();
    }

    public static void printAll(Country[] arg)
    {
        for(Country c: arg)
        {
            c.print();
        }
    }

    public static void main(String[] args)
    {
        Country[] countries=
        {
                new Country("Russia", 17100, 146700, "Moscow", 12600),
                new Country("Finland", 338, 5500, "Helsinki", 655),
                new Country("France", 643.8, 67800, "Paris", 2100),
                new Country("Andorra", 0.467, 85.4, " Andorra la Vella", 22.6),
                new Country("Singapore", 0.725, 5700)
        };
        printAll(countries);
        Country country=new Country("Ukraine", 603.5, "Kyiv");
        country.print();
    }
}
