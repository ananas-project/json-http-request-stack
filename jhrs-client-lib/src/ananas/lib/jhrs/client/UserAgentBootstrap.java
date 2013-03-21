package ananas.lib.jhrs.client;

final class UserAgentBootstrap {

	public static UserAgent newInstance(String classname) {

		try {
			if (classname == null) {
				classname = "ananas.lib.impl.jhrs.client.UserAgentImpl";
			}
			Class<?> cls = Class.forName(classname);
			UserAgent agent = (UserAgent) cls.newInstance();
			return agent;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public static UserAgent getInstance(String classname) {
		return newInstance(classname);
	}

}
