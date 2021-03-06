/*
 * Copyright (C)2016 - SMBJ Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hierynomus.smbj.transport;

import com.hierynomus.protocol.Packet;

import java.io.IOException;
import java.net.InetSocketAddress;

public interface TransportLayer<P extends Packet<P, ?>> {

    /**
     * Write the packet to the transport.
     *
     * @param packet The packet to write.
     */
    void write(P packet) throws TransportException;

    /**
     * Connect to the remote side
     * 
     * @param remoteAddress The remote address to connect to
     */
    void connect(InetSocketAddress remoteAddress) throws IOException;

    /**
     * Connect to the remote side
     * 
     * @param remoteAddress The remote address to connect to
     * @param localAddress The local address to use
     */
    void connect(InetSocketAddress remoteAddress, InetSocketAddress localAddress) throws IOException;

    /**
     * Disconnect from the remote side
     * 
     * @throws IOException
     */
    void disconnect() throws IOException;

    boolean isConnected();
}
