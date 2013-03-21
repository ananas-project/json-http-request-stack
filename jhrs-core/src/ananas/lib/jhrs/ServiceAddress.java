package ananas.lib.jhrs;

public interface ServiceAddress extends JHRSAddressComponent {

	ServerAddress getOwnerServer();

	NodeAddress getNodeByName(String name);

}
