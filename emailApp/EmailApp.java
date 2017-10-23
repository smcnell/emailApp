package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("John", "Smith");
		em1.setAlternateEmail("fjkdlad@email.com");
		System.out.println("Alt email:" + em1.getAlternateEmail());
	}

}
