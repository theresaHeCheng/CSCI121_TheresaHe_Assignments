import java.time.LocalDate;
public class Wedding
{
    Couple couple;
    LocalDate date;
    String location;
    public Wedding(Couple c, LocalDate d, String l)
    {
        couple = c;
        date = d;
        location = l;
    }

    public Couple getCouple()
    {
        return couple;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public String getLocation()
    {
        return location;
    }
}
