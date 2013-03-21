package ananas.lib.jhrs;

public interface JHRSAddress {

	JHRSAddressSystem getAddressSystem();

	String getURL();

	JHRSAddress getParent();

}
