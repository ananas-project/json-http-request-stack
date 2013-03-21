package ananas.lib.jhrs.server;

import ananas.lib.jhrs.ClassAddress;

public interface JHRSClassResponder {

	void onInvokeStaticMethod(ClassAddress aClass, JHRSRequest request,
			JHRSResponse response);

}
