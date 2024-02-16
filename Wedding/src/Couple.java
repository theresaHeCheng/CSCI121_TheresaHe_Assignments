public class Couple
{
    Person bride;
    Person groom;
    String brideName;
    String groomName;
    public Couple(Person b, Person g)//constructor
    {
        bride = b;
        groom = g;
    }

    public Person getBride()
    {
        return bride;
    }

    public Person getGroom()
    {
        return groom;
    }

}

