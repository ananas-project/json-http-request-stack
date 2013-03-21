package ananas.lib.jhrs;

public interface NodeAddress extends JHRSAddress {

	ServiceAddress getOwnerService();

	ClassAddress getClassByName(String name);
}
