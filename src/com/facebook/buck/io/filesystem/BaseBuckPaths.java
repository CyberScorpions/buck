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

package com.facebook.buck.io.filesystem;

import com.facebook.buck.core.filesystems.RelPath;
import com.facebook.buck.core.util.immutables.BuckStyleValue;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import org.immutables.value.Value;

/** Common Buck paths */
@BuckStyleValue
public abstract class BaseBuckPaths {

  /** The relative path to the directory where Buck will generate its files. */
  public abstract RelPath getBuckOut();

  /**
   * The relative path to the directory where Buck will generate its files. This is used when
   * configuring the output directory to some used-defined value and is a stop-gap until we can
   * support configuring all output paths. However, for now, only certain paths below will use this
   * path.
   */
  public abstract RelPath getConfiguredBuckOut();

  /** Whether to include the target configuration hash on buck-out. */
  public abstract boolean shouldIncludeTargetConfigHash();

  /** The version the buck output directory was created for */
  @Value.Derived
  public RelPath getCurrentVersionFile() {
    return getConfiguredBuckOut().resolveRel(".currentversion");
  }

  @Value.Derived
  public RelPath getGenDir() {
    return getConfiguredBuckOut().resolveRel("gen");
  }

  @Value.Derived
  public RelPath getResDir() {
    return getConfiguredBuckOut().resolveRel("res");
  }

  @Value.Derived
  public RelPath getScratchDir() {
    return getConfiguredBuckOut().resolveRel("bin");
  }

  @Value.Derived
  public RelPath getAnnotationDir() {
    return getConfiguredBuckOut().resolveRel("annotation");
  }

  @Value.Derived
  public Path getLogDir() {
    return getBuckOut().resolve("log");
  }

  @Value.Derived
  public Path getJournalDir() {
    return getLogDir().resolve("journal");
  }

  @Value.Derived
  public Path getTraceDir() {
    return getLogDir().resolve("traces");
  }

  @Value.Derived
  public Path getCacheDir() {
    return getBuckOut().resolve("cache");
  }

  @Value.Derived
  public Path getTmpDir() {
    return getBuckOut().resolve("tmp");
  }

  @Value.Derived
  public Path getXcodeDir() {
    return getBuckOut().resolve("xcode");
  }

  @Value.Derived
  public Path getTrashDir() {
    // We put a . at the front of the name so Spotlight doesn't try to index the contents on OS X.
    return getBuckOut().resolve(".trash");
  }

  @Value.Derived
  public Path getOfflineLogDir() {
    return getLogDir().resolve("offline");
  }

  @Value.Derived
  public Path getRemoteSandboxDir() {
    return getBuckOut().resolve("remote_sandbox");
  }

  @Value.Derived
  public RelPath getLastOutputDir() {
    return getConfiguredBuckOut().resolveRel("last");
  }

  @Value.Derived
  public Path getProjectRootDir() {
    return getBuckOut().resolve("project_root");
  }

  @Value.Derived
  public FileSystem getFileSystem() {
    return getBuckOut().getFileSystem();
  }

  public RelPath getSymlinkPathForDir(Path unconfiguredDirInBuckOut) {
    return getConfiguredBuckOut().resolve(getBuckOut().relativize(unconfiguredDirInBuckOut));
  }

  public static BaseBuckPaths of(
      RelPath buckOut, RelPath configuredBuckOut, boolean shouldIncludeTargetConfigHash) {
    return ImmutableBaseBuckPaths.ofImpl(buckOut, configuredBuckOut, shouldIncludeTargetConfigHash);
  }
}