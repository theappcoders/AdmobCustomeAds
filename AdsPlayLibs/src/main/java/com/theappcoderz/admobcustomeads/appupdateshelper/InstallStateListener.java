/*
 * Copyright (C) 2021 HyperDevs
 *
 * Copyright (C) 2019 BQ
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.theappcoderz.admobcustomeads.appupdateshelper;

import androidx.annotation.NonNull;

/**
 * Listener that emits changes when an app update installation event happens.
 */
public interface InstallStateListener {
    /**
     * Triggered on an app update installation event is emitted.
     *
     * @param state App  update installation event
     */
    void onInstallStateUpdate(@NonNull AppUpdateInstallState state);
}
