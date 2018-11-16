package com.meiyou.jet.grant;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * @author zhengxiaobin
 * @since 17/8/11
 */

interface IPermissionsManager {
    @SuppressWarnings("unused")
    boolean hasPermission(@Nullable Context context, @NonNull String permission);

    @SuppressWarnings("unused")
    boolean hasAllPermissions(@Nullable Context context, @NonNull String[] permissions);

    @SuppressWarnings("unused")
    void requestAllManifestPermissionsIfNecessary(@Nullable Activity activity,
                                                  @Nullable PermissionsResultAction action);

    @SuppressWarnings("unused")
    void requestPermissionsIfNecessaryForResult(@Nullable Activity activity,
                                                @NonNull String[] permissions,
                                                @Nullable PermissionsResultAction action);

    @SuppressWarnings("unused")
    void requestPermissionsIfNecessaryForResult(@NonNull Fragment fragment,
                                                @NonNull String[] permissions,
                                                @Nullable PermissionsResultAction action);

    @SuppressWarnings("unused")
    void notifyPermissionsChange(@NonNull String[] permissions, @NonNull int[] results);
}
