package one.microstream.communication.types;

/*-
 * #%L
 * microstream-communication
 * %%
 * Copyright (C) 2019 - 2022 MicroStream Software
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

import static one.microstream.X.notNull;

import java.net.InetSocketAddress;

/**
 * 
 * @param <C> the communication layer type
 */
@FunctionalInterface
public interface ComClientCreator<C>
{
	public ComClient.Default<C> createClient(
		InetSocketAddress          hostAddress       ,
		ComConnectionHandler<C>    connectionHandler ,
		ComProtocolStringConverter protocolParser    ,
		ComPersistenceAdaptor<C>   persistenceAdaptor,
		int                        inactivityTimeOut
	);
	
	
	public static <C> ComClientCreator.Default<C> New()
	{
		return new ComClientCreator.Default<>();
	}
	
	public final class Default<C> implements ComClientCreator<C>
	{
		@Override
		public ComClient.Default<C> createClient(
			final InetSocketAddress          hostAddress       ,
			final ComConnectionHandler<C>    connectionHandler ,
			final ComProtocolStringConverter protocolParser    ,
			final ComPersistenceAdaptor<C>   persistenceAdaptor,
			final int                        inactivityTimeOut
		)
		{
			return ComClient.New(
				notNull(hostAddress)       ,
				notNull(connectionHandler) ,
				notNull(protocolParser)    ,
				notNull(persistenceAdaptor),
				inactivityTimeOut
			);
		}
		
	}
}
