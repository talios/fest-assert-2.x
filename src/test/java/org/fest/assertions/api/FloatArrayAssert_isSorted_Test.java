/*
 * Created on Dec 2, 2010
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
 * Copyright @2010-2011 the original author or authors.
 */
package org.fest.assertions.api;

import static junit.framework.Assert.assertSame;

import static org.fest.assertions.test.FloatArrayFactory.emptyArray;

import static org.mockito.Mockito.*;

import org.junit.Test;

import org.fest.assertions.internal.FloatArrays;

/**
 * Tests for <code>{@link FloatArrayAssert#isSorted()}</code>.
 * 
 * @author Joel Costigliola
 */
public class FloatArrayAssert_isSorted_Test {

  @Test
  public void should_verify_that_assertIsSorted_is_called() {
    FloatArrays arrays = mock(FloatArrays.class);
    FloatArrayAssert assertions = new FloatArrayAssert(emptyArray());
    assertions.arrays = arrays;
    assertions.isSorted();
    verify(arrays).assertIsSorted(assertions.info, assertions.actual);
  }

  @Test
  public void should_return_this() {
    FloatArrayAssert objectArrayAssert = new FloatArrayAssert(new float[] {1.0f, 2.0f});
    assertSame(objectArrayAssert, objectArrayAssert.isSorted());
  }

}
