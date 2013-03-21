package ananas.lib.jhrs;

public interface JHRSAddressSystem {

	ServerAddress getServer(String address);

	ServiceAddress getService(String address);

	NodeAddress getNode(String address);

	ObjectAddress getObject(String address);

	ClassAddress getClassAddress(String address);

	class Factory {

		public static JHRSAddressSystem getInstance() {
			return JHRSAddressSystemBootstrap.getInstance(null);
		}

		public static JHRSAddressSystem getInstance(String classname) {
			return JHRSAddressSystemBootstrap.getInstance(classname);
		}

	}

}
