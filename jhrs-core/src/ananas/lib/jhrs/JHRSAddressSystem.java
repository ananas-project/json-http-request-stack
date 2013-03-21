package ananas.lib.jhrs;

public interface JHRSAddressSystem {

	JHRSServer getServer(String address);

	JHRSService getService(String address);

	JHRSNode getNode(String address);

	JHRSObject getObject(String address);

	JHRSClass getClassAddress(String address);

	class Factory {

		public static JHRSAddressSystem getInstance() {
			return JHRSAddressSystemBootstrap.getInstance(null);
		}

		public static JHRSAddressSystem getInstance(String classname) {
			return JHRSAddressSystemBootstrap.getInstance(classname);
		}

	}

}
