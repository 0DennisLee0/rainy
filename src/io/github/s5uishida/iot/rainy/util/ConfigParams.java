package io.github.s5uishida.iot.rainy.util;

/*
 * @author s5uishida
 *
 */
public class ConfigParams {
	public static final String NAME						= "rainy - a tiny tool for iot data collection and monitoring";
	public static final String VERSION					= "0.1.24";

	public static final String CONFIG_DIR_PARAM			= "config.dir";
	public static final String CONFIG_FILE				= "rainy.properties";
	public static final String INFLUXDB_CONFIG_FILE		= "influxdb.properties";
	public static final String MQTT_CONFIG_FILE			= "mqtt.properties";
	public static final String MQTTS_CONFIG_FILE		= "mqtts.properties";
	public static final String CC2650_CONFIG_FILE		= "cc2650.properties";
	public static final String BME280_CONFIG_FILE		= "bme280.properties";
	public static final String BH1750FVI_CONFIG_FILE	= "bh1750fvi.properties";
	public static final String MHZ19B_CONFIG_FILE		= "mhz19b.properties";
	public static final String PPD42NS_CONFIG_FILE		= "ppd42ns.properties";
	public static final String RCWL0516_CONFIG_FILE		= "rcwl0516.properties";
	public static final String HCSR501_CONFIG_FILE		= "hcsr501.properties";
	public static final String OPCUA_CONFIG_FILE		= "opcua.properties";

	public static String getName() {
		return NAME;
	}

	public static String getVersion() {
		return VERSION;
	}
}
