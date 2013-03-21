package ananas.lib.jhrs;

class JHRSAddressSystemBootstrap {

	public static JHRSAddressSystem getInstance(String classname) {
		if (classname == null) {
			classname = "ananas.lib.impl.jhrs.JHRSAddressSystemImpl";
		}
		try {
			Class<?> cls = Class.forName(classname);
			JHRSAddressSystem addrSys = (JHRSAddressSystem) cls.newInstance();
			return addrSys;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
