package ananas.lib.jhrs;

public interface JHRSNode {

	JHRSService getOwnerService();

	String getNodeAddressString();

	JHRSClass getClassByName(String name);
}
