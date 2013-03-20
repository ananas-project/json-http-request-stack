package ananas.lib.jhrs.server;

import javax.servlet.http.HttpServlet;

import ananas.lib.jhrs.JHRSClass;

public class AbstractJHRSClassResponder extends HttpServlet implements JHRSClassResponder {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void onInvokeStaticMethod(JHRSClass aClass, JHRSRequest request,
			JHRSResponse response) {
		// TODO Auto-generated method stub
		
	}

}
