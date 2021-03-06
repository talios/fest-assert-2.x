/*
 * Created on Jun 4, 2012
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010-2012 the original author or authors.
 */
package org.fest.assertions.api;

import static java.util.Collections.emptyMap;
import static junit.framework.Assert.assertSame;
import static org.fest.util.Collections.list;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.fest.assertions.internal.Maps;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for <code>{@link MapsAssert#hasSameSizeAs(Iterable)}</code>.
 *
 * @author Nicolas François
 */
public class MapAssert_hasSameSizeAs_with_Iterable_Test {

  private Maps maps;
  private MapAssert<Object, Object> assertions;
  private final List<String> other = list("Yoda", "Luke");
  
  @Before public void setUp() {
    maps = mock(Maps.class);
    assertions = new MapAssert<Object, Object>(emptyMap());
    assertions.maps = maps;
  }

  @Test
  public void should_verify_that_actual_has_expected_size() {
    assertions.hasSameSizeAs(other);
    verify(maps).assertHasSameSizeAs(assertions.info, assertions.actual, other);
  }

  @Test public void should_return_this() {
	MapAssert<?, ?> returned = assertions.hasSameSizeAs(other);
    assertSame(assertions, returned);
  }
}
