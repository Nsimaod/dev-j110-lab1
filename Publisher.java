public class Publisher
{
    private String name;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException
    {
        if(name==null || name.equals(""))
        {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) throws IllegalArgumentException
    {
        if(city==null || city.equals(""))
        {
            throw new IllegalArgumentException();
        }
        this.city = city;
    }


    public Publisher(String name, String city) throws IllegalArgumentException
    {
        setName(name);
        setCity(city);
    }
}
