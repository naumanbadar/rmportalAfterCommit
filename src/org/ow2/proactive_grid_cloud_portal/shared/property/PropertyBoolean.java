/*
 * ################################################################
 *
 * ProActive Parallel Suite(TM): The Java(TM) library for
 *    Parallel, Distributed, Multi-Core Computing for
 *    Enterprise Grids & Clouds
 *
 * Copyright (C) 1997-2010 INRIA/University of
 *              Nice-Sophia Antipolis/ActiveEon
 * Contact: proactive@ow2.org or contact@activeeon.com
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; version 3 of
 * the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307
 * USA
 *
 * If needed, contact us to obtain a release under GPL Version 2
 * or a different license than the GPL.
 *
 *  Initial developer(s):               The ProActive Team
 *                        http://proactive.inria.fr/team_members.htm
 *  Contributor(s):
 *
 * ################################################################
 * $$PROACTIVE_INITIAL_DEV$$
 */
package org.ow2.proactive_grid_cloud_portal.shared.property;


/**
 * A boolean Property
 */
public class PropertyBoolean extends Property {
    public static final String TRUE = "true";
    public static final String FALSE = "false";

    public PropertyBoolean(String name) {
        super(name, Type.BOOLEAN);
    }

    public PropertyBoolean(String name, boolean value) {
        this(name);
        this.setValue(new Boolean(value).toString());
    }
    
    public PropertyBoolean(String name, String value) {
        this(name);
        this.setValue(value);
    }

    @Override
    public boolean isValid(String value) {
        if (TRUE.equals(value) || FALSE.equals(value))
            return true;

        return false;
    }

	@Override
	public String getDefaultValue() {
		// TODO Auto-generated method stub
		return FALSE;
	}

	@Override
	public Object getValue() {
		// TODO Auto-generated method stub
		return new Boolean(this.value);
	}

}
