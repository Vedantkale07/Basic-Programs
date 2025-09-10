public class BMI {
    public static void main(String args [] )
    {
        String fname,lname;
        double w,h;
        fname=args[0];
        lname=args[1];
        w=Double.parseDouble(args[2]);
        h=Double.parseDouble(args[3]);
        Double bmi= w / (h*h);
        System.out.println("....Display The Player details....");
            System.out.println("First name of player: "+fname);
            System.out.println("Last Name of Player:"+lname);
            System.out.println("Player Weight:"+w);
            System.out.println("player Height:"+h);
        System.out.println("!!..The body mass Index is(BMI..) : "+bmi);

    }
}
