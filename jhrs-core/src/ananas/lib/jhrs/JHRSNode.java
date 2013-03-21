package ananas.lib.jhrs;

public interface JHRSNode extends JHRSAddressComponent {

	JHRSService getOwnerService();

	JHRSClass getClassByName(String name);
}
