package ananas.lib.jhrs;

public interface JHRSAddressSystem {

	ServerAddress getServer(String hostname);

	ServiceAddress getService(String url);

	NodeAddress getNode(String url);

	ObjectAddress getObject(String url);

	ClassAddress getClassAddress(String url);

	class Factory {

		public static JHRSAddressSystem getInstance() {
			return JHRSAddressSystemBootstrap.getInstance(null);
		}

		public static JHRSAddressSystem getInstance(String classname) {
			return JHRSAddressSystemBootstrap.getInstance(classname);
		}

	}

}
