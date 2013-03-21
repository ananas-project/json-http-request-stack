package ananas.lib.jhrs;

public interface ServiceAddress extends JHRSAddress {

	ServerAddress getOwnerServer();

	NodeAddress getNodeByName(String name);

}
