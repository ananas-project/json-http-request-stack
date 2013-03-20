package ananas.lib.jhrs;

public interface JHRSService {

	JHRSServer getOwnerServer();

	String getServiceAddressString();

	JHRSNode getNodeByName(String name);

}
