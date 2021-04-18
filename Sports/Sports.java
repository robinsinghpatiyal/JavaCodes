package Sports;

public class Sports {
    private String name;
    private int teamSize;

    // creates a Sport object
    public void Sport(String name, int teamSize)
    {
        this.name = name;
        this.teamSize = teamSize;
    }

    // sets name of sport
    public void setName(String name)
    {
        this.name = name;
    }

    // Returns name of sport
    public String getName()
    {
        return name;
    }

    // sets Team Size
    public void setTeamSize(int teamSize)
    {
        this.teamSize = teamSize;
    }

    // Returns Team Size
    public int getTeamSize()
    {
        return teamSize;
    }

    // Returns a description of the sport
    public String toString()
    {
        System.out.println("Printing Details of the sport created: ");
        String description =" ";
        description += "Name: " + name + "\nTeam Size: "
                + teamSize + "\n";
        return description;
    }
}
