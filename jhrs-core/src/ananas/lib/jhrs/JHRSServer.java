package ananas.lib.jhrs;

public interface JHRSServer {

	String getHostName();

	String getServerAddressString();

	JHRSService getService(int port);

	JHRSService getService(String scheme);

	JHRSService getService(String scheme, int port);

}
