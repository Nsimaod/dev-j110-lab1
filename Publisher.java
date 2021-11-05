public class Publisher
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException
    {
        if(name==null)
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
        if(city==null)
        {
            throw new IllegalArgumentException();
        }
        this.city = city;
    }

    private String city;

    public Publisher(String name, String city) throws IllegalArgumentException
    {
        if(name==null || city==null)
        {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.city = city;
    }
}
