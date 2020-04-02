/*
 * Copyright (c) Facebook, Inc. and its affiliates.
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

package com.facebook.buck.rules.macros;

import com.facebook.buck.core.model.UnconfiguredBuildTarget;
import com.facebook.buck.core.util.immutables.BuckStyleValue;
import com.google.common.collect.ImmutableList;
import java.util.Optional;
import java.util.regex.Pattern;

/** Base class for <code>cxx_genrule</code> flags-based macros. */
@BuckStyleValue
public abstract class UnconfiguredCxxGenruleFilterAndTargetsMacro implements UnconfiguredMacro {

  /** Which macro is this. */
  public enum Which {
    CPPFLAGS,
    CXXPPFLAGS,
    LDFLAGS_SHARED,
    LDFLAGS_SHARED_FILTER,
    LDFLAGS_STATIC,
    LDFLAGS_STATIC_FILTER,
    LDFLAGS_STATIC_PIC,
    LDFLAGS_STATIC_PIC_FILTER,
  }

  public abstract Which getWhich();

  public abstract Optional<Pattern> getFilter();

  public abstract ImmutableList<UnconfiguredBuildTarget> getTargets();
}