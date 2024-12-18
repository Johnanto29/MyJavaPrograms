package stringhandling;

public class stringaddchar {

	public void addchar() {
		String Fullname;
	
		String[]names = new String[6];
		names[0]= "a";
		names[1]= "n";		
		names[2]= "t";
		names[3]= "o";
		names[4]= "n";
		names[5]= "y";
	
		
            Fullname = String.join("",names);
            System.out.println(Fullname);
            
            String name1 = Fullname;
            
            String[] names2= name1.split("t");
            for(String  name:names2) {
            
            System.out.println(name);
          
            }
            
            System.out.println(names2[0]);
            System.out.println(names2[1]);
	}
            
	

	public static void main(String[] args) {

		stringaddchar ob = new stringaddchar();
		ob.addchar();

	}

}
