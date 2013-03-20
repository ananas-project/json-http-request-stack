package ananas.lib.jhrs.server;

import ananas.lib.jhrs.JHRSObject;

public interface JHRSObjectResponder {

	JHRSObjectManager getObjectManager();

	void onInvokeMethod(JHRSObject obj, JHRSRequest request,
			JHRSResponse response);

}
