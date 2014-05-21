/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.client.core.communication.header;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import org.apache.olingo.client.api.communication.header.HeaderName;
import org.apache.olingo.client.api.communication.header.ODataHeaders;

public class ODataHeadersImpl implements ODataHeaders {

  /**
   * OData request/response header key/value pairs.
   */
  private final Map<String, String> headers = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);

  @Override
  public ODataHeaders setHeader(final String name, final String value) {
    headers.put(name, value);
    return this;
  }

  @Override
  public ODataHeaders setHeader(final HeaderName name, final String value) {
    headers.put(name.toString(), value);
    return this;
  }

  @Override
  public String getHeader(final HeaderName name) {
    return headers.get(name.toString());
  }

  @Override
  public String getHeader(final String name) {
    return headers.get(name);
  }

  @Override
  public String removeHeader(final HeaderName name) {
    return headers.remove(name.toString());
  }

  @Override
  public String removeHeader(final String name) {
    return headers.remove(name);
  }

  @Override
  public Collection<String> getHeaderNames() {
    return headers.keySet();
  }
}
