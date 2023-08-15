package pattern.builder;

import bean.User;
import bean.UserAdv;
import bean.UserHighAdv;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		// required: firstName, lastName, phone
		User u1 = User.builder().withFirstName("Le").withLastName("Teo").withPhone("2345678").build();
		System.out.println("u1 --> " + u1);

		// required: firstName, age, address
		User u2 = User.builder().withFirstName("Le").withAge(20).withAddress("Da Nang").build();
		System.out.println("u2 --> " + u2);

		// required: firstName, lastName, address
		UserAdv ua1 = UserAdv.of().firstName("Hoang").lastName("Teo").address("Viet Nam");
		ua1.firstName("Hoang Updated");
		System.out.println("ua1 --> " + ua1);

		// required: firstName, lastName, address
		UserHighAdv uha1 = UserHighAdv.of().firstName("Le").lastName("Ben").address("Viet Nam");
		uha1.lastName("Benjamin");
		System.out.println("uha1 --> " + uha1);

	}

}
