package ananas.lib.jhrs;

public interface NodeAddress extends JHRSAddressComponent {

	ServiceAddress getOwnerService();

	ClassAddress getClassByName(String name);
}
