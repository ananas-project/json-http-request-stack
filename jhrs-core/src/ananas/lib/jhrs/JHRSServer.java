package ananas.lib.jhrs;

public interface JHRSServer extends JHRSAddressComponent {

	JHRSService getService(int port);

	JHRSService getService(String scheme);

	JHRSService getService(String scheme, int port);

}
