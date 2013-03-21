package ananas.lib.jhrs.client;

import ananas.lib.jhrs.JHRSAddressSystem;
import ananas.lib.jhrs.JHRSClass;
import ananas.lib.jhrs.JHRSNode;
import ananas.lib.jhrs.JHRSObject;

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

	ObjectEndpoint getObjectEndpoint(JHRSObject obj);

	ClassEndpoint getClassEndpoint(JHRSClass cls);

	NodeEndpoint getNodeEndpoint(JHRSNode node);

}
