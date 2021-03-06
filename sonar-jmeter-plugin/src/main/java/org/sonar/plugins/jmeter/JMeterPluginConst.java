/*
 * Sonar JMeter Plugin
 * Copyright (C) 2010 eXcentia
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */

package org.sonar.plugins.jmeter;

public class JMeterPluginConst {
	
	private JMeterPluginConst() {}
	
  public static final String HOST_PROPERTY = "org.sonar.plugins.jmeter.server.host";
  public static final String PORT_PROPERTY = "org.sonar.plugins.jmeter.server.port";
  public static final String CONFIG_PROPERTY = "org.sonar.plugins.jmeter.server.config";
  public static final String LOCAL_JTL_PATH_PROPERTY = "org.sonar.plugins.jmeter.jtlpath";
  public static final String REQUESTXTIME_TIMEUNIT_PROPERTY = "org.sonar.plugins.jmeter.requestxtimeunit";
  public static final String TRANSXTIME_TIMEUNIT_PROPERTY = "org.sonar.plugins.jmeter.transxtimeunit";
  
}
