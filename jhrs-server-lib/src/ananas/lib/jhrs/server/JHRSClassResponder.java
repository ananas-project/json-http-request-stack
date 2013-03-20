package ananas.lib.jhrs.server;

import ananas.lib.jhrs.JHRSClass;

public interface JHRSClassResponder {

	void onInvokeStaticMethod(JHRSClass aClass, JHRSRequest request,
			JHRSResponse response);

}
