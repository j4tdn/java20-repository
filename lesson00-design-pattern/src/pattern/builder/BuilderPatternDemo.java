package pattern.builder;

import bean.UserAdv;

/*
  Builder Pattern is a construction pattern 
  	+ build/create complex object(has many attributes)
  	+ build out an immutable(impossible to update data at HEAP) object
  	+ create one construction process replace for many representation (many overload constructors)
  	
  	+immutable : can't change value at Heap
  				. create many constructors with enough parameters required
  				--> to many constructor 
  				-->can't create duplicate constructor with same data type & mount
  				
  	+ builder Pattern --> create just one constructor to create an immutable object
  				
 */
public class BuilderPatternDemo {
	public static void main(String[] args) {
		//require: firstname, lastName, phone
		
		UserAdv u1 = UserAdv.of()
				.withAddress("Quang tri")
				.withFirstName("Mquan");
		
		System.out.println("u1: " + u1);
	}
}
