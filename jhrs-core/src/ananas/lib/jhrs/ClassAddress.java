package ananas.lib.jhrs;

public interface ClassAddress extends JHRSAddressComponent {

	NodeAddress getOwnerNode();

	ObjectAddress getObjectByName(String name);

}
