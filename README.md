ThngDroid
=========

Android Wrapper for the EVRYTHNG API!

This project is currently merely in a "Hello World" status! Come again soon... ;-)

To generate a jar file that can be used in Android do:

    mvn assembly:single
    
Sample Main file:

    public static void main(String[] args) {
  	EvrythngSimpleWrapper wrapper = new EvrythngSimpleWrapper(EVRYTHNG_ROOT_URL);

		Thng thng = new Thng();
		thng.setName("Test from Android!");
		thng.setDescription("Hello Android World!");

		Thng newThng = wrapper.post("thngs", thng, Thng.class);
		Thng getThng = wrapper.get(String.format("thngs/%s", newThng.getId()), Thng.class);

		System.out.println("Created thng: " + newThng.getCreatedDate());
	 	System.out.println("Got thng: " + getThng.getCreatedDate());
	  }