package ananas.lib.jhrs;

public interface JHRSAddressComponent {

	JHRSAddressSystem getAddressSystem();

	String getAddressString();

	JHRSAddressComponent getParent();

}
