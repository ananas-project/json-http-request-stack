package ananas.lib.jhrs;

public interface JHRSService extends JHRSAddressComponent {

	JHRSServer getOwnerServer();

	JHRSNode getNodeByName(String name);

}
