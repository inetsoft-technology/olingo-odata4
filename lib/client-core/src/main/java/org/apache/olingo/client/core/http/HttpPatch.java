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
package org.apache.olingo.client.core.http;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.olingo.client.core.uri.URIUtils;

import java.net.URI;

/**
 * Class identifying PATCH HTTP method.
 * @NotThreadSafe
 */
public class HttpPatch extends HttpEntityEnclosingRequestBase {

  public final static String METHOD_NAME = "PATCH";

  /**
   * Constructor.
   */
  public HttpPatch() {
    super();
  }

  /**
   * Constructor.
   *
   * @param uri request URI.
   */
  public HttpPatch(final URI uri) {
    super();
    setURI(uri);
  }

  /**
   * Constructor.
   *
   * @param uri request URI.
   * @throws IllegalArgumentException if the uri is invalid.
   */
  public HttpPatch(final String uri) {
    super();
    setURI(URI.create(URIUtils.cleanHref(uri)));
  }

  /**
   * Gets HTTP method name.
   *
   * @return HTTP method name.
   */
  @Override
  public String getMethod() {
    return METHOD_NAME;
  }
}
