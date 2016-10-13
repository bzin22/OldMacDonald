class Chick implements Animal 
{     
     private String myType;
     private String mySound;
     public Chick (String type , String sound1 , String sound2)
     {
     	myType = type;
     	int a = (int)(Math.random()*2+1);
     	if (a == 1)
     	{
     		mySound = sound1;
     	} 
     	else 
     	{
     		mySound = sound2;
     	}
     }
     public Chick()
     {
     	myType = "unknown";
     	mySound = "unknown";
     }
     public String getType()
     {
     	return myType;
     }
     public String getSound()
     {
     	return mySound;
     }
}
