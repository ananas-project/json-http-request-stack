package ananas.lib.jhrs.server;

import ananas.lib.jhrs.ObjectAddress;

public interface JHRSObjectResponder {

	JHRSObjectManager getObjectManager();

	void onInvokeMethod(ObjectAddress obj, JHRSRequest request,
			JHRSResponse response);

}
