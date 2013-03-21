package ananas.lib.jhrs;

public interface ServerAddress extends JHRSAddress {

	ServiceAddress getService(int port);

	ServiceAddress getService(String scheme);

	ServiceAddress getService(String scheme, int port);

}
