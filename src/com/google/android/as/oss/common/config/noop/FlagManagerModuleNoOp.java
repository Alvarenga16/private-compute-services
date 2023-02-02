/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.as.oss.common.config.noop;

import com.google.android.as.oss.common.config.FlagManagerFactory;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

/** No-op implementation of {@link FlagManagerFactory}. */
@Module
@InstallIn(SingletonComponent.class)
abstract class FlagManagerModuleNoOp {
  @Binds
  @Singleton
  abstract FlagManagerFactory provideFlagManagerFactory(DeviceFlagManagerFactoryNoOp impl);
}