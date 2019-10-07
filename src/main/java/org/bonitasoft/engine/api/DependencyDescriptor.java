/**
 * Copyright (C) 2015 BonitaSoft S.A.
 * BonitaSoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation
 * version 2.1 of the License.
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth
 * Floor, Boston, MA 02110-1301, USA.
 **/
package org.bonitasoft.engine.api;

import org.bonitasoft.engine.bpm.BonitaObject;

public interface DependencyDescriptor extends BonitaObject {

    /**
     * Get the identifier of this <code>DependencyDescriptor</code>
     * 
     * @return the if of this <code>DependencyDescriptor</code>
     */
    long getId();

    /**
     * Get the name of the dependency
     * 
     * @return the name of the dependency
     */
    String getName();
    
    /**
     * Get the version of the dependency
     * 
     * @return the version of the dependency
     */
    String getVersion();

    /**
     * Get the description of the Dependency
     * 
     * @return the description of the dependency
     */
    String getDescription();

    /**
     * Get the file name of the dependency
     * 
     * @return the file name of the dependency
     */
    String getFileName();

}

