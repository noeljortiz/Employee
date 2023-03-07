//********************************************************************
//  Volunteer.java       Author: Lewis/Loftus/Cocking
//
//  Represents a staff member that works as a volunteer.
//********************************************************************

public class Volunteer extends StaffMember
{
    //-----------------------------------------------------------------
    //  Sets up a volunteer using the specified information.
    //-----------------------------------------------------------------
    public Volunteer (String eName, String eAddress, String ePhone)
    {
        super (eName, eAddress, ePhone);
    }

    //-----------------------------------------------------------------
    //  Returns a zero pay value for this volunteer.
    //-----------------------------------------------------------------
    public double pay()
    {
        return 0.0;
    }


    public int addHours(int moreHours) {
        return 0;
    }

    @Override
    public double awardBonus(double execBonus) {
        return 0;
    }
}
