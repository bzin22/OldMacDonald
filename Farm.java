class Farm 
{     
   private Animal[] aBunchOfAnimals = new Animal[3];
   public Farm()
   {
   		aBunchOfAnimals[0] = new NamedCow ("cow" , "Elise" , "moo");
   		aBunchOfAnimals[1] = new Chick ("chick" , "cluck" , "cheep");
   		aBunchOfAnimals[2] = new Pig ("pig" , "oink");	
   }
   public void animalSounds()
   {
         System.out.println( "The cow is also known as " + ((NamedCow)aBunchOfAnimals[0]).getName() );
   }
}
