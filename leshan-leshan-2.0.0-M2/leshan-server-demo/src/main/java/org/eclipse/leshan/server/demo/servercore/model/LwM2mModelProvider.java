/*******************************************************************************
 * Copyright (c) 2015 Sierra Wireless and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 * 
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 * and the Eclipse Distribution License is available at
 *    http://www.eclipse.org/org/documents/edl-v10.html.
 * 
 * Contributors:
 *     Sierra Wireless - initial API and implementation
 *******************************************************************************/
package org.eclipse.leshan.server.demo.servercore.model;

import org.eclipse.leshan.core.model.LwM2mModel;
import org.eclipse.leshan.core.node.codec.LwM2mNodeDecoder;
import org.eclipse.leshan.core.node.codec.LwM2mNodeEncoder;
import org.eclipse.leshan.server.demo.servercore.registration.Registration;

/**
 * A <code>LwM2mModelProvider</code> implementation is in charge of returning the description of the LWM2M objects for
 * each registered client.
 * <p>
 * The description of each object is mainly used by the {@link LwM2mNodeEncoder}/{@link LwM2mNodeDecoder} to
 * encode/decode the requests/responses payload.
 * </p>
 * <p>
 * A typical use case to implement a custom provider is the need to support several version of the specification.
 * </p>
 */
public interface LwM2mModelProvider {

    /**
     * Returns the description of the objects supported by the given registration.
     * 
     * @param registration the registered client
     * @return the list of object descriptions
     */
    LwM2mModel getObjectModel(Registration registration);

}
