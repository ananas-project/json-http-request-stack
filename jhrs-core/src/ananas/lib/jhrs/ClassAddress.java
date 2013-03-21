package ananas.lib.jhrs;

public interface ClassAddress extends JHRSAddress {

	NodeAddress getOwnerNode();

	ObjectAddress getObjectByName(String name);

}
