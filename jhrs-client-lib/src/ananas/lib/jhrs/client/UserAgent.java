package ananas.lib.jhrs.client;

import ananas.lib.jhrs.JHRSAddressSystem;
import ananas.lib.jhrs.ClassAddress;
import ananas.lib.jhrs.NodeAddress;
import ananas.lib.jhrs.ObjectAddress;

public interface UserAgent {

	class Factory {

		public static UserAgent newAgent() {
			return UserAgentBootstrap.newInstance(null);
		}

		public static UserAgent getAgent() {
			return UserAgentBootstrap.getInstance(null);
		}

	}

	JHRSAddressSystem getAddressSystem();

	ObjectEndpoint getObjectEndpoint(ObjectAddress obj);

	ClassEndpoint getClassEndpoint(ClassAddress cls);

	NodeEndpoint getNodeEndpoint(NodeAddress node);

}
