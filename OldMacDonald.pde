
public void setup()
{
	Cow clark = new Cow("cow" , "moo"); 
	Pig peter = new Pig("pig" , "oink");
	Chick christine = new Chick("chick" , "cluck" , "cheep");
	Farm texas = new NamedCow();
	System.out.println ( clark.getType() + " goes " + clark.getSound() );
	System.out.println ( peter.getType() + " goes " + peter.getSound() );
	System.out.println ( christine.getType() + " goes " + christine.getSound() );
}

