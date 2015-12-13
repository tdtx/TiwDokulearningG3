package jhc.info;

import java.util.*;

public class InformacionProperties {

	private static String strQCF;

	private static String strQueue;

	private static String strQUEUE_createQUEUE;

	private static final String nombreProperties = "InfoAplicacion";

	// **************************************************
	public InformacionProperties() {
		super();
	}

	// **************************************************
	public static String getQCF() {

		if (strQCF == null)
			cagarProperties();

		return strQCF;
	}

	// **************************************************
	public static String getQueue() {

		if (strQueue == null)
			cagarProperties();

		return strQueue;
	}

	// **************************************************
	public static String getQUEUE_createQUEUE() {

		if (strQUEUE_createQUEUE == null)
			cagarProperties();

		return strQUEUE_createQUEUE;
	}

	// **************************************************
	private static void cagarProperties() throws MissingResourceException {

		PropertyResourceBundle appProperties = null;

		try {

			appProperties = (PropertyResourceBundle) PropertyResourceBundle
					.getBundle(nombreProperties);

			strQCF = appProperties.getString("Info.strQCF");
			strQueue = appProperties.getString("Info.strQueue");
			strQUEUE_createQUEUE = appProperties.getString("Info.strQUEUE_createQUEUE");	

		} catch (MissingResourceException e) {

			throw e;
		}

	}
}
