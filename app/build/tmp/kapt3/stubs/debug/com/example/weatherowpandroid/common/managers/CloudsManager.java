package com.example.weatherowpandroid.common.managers;

import java.lang.System;

/**
 * Created by Evgeny Goncharov on 17,July, 2019
 * jtgn@yandex.ru
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/weatherowpandroid/common/managers/CloudsManager;", "", "()V", "Companion", "app_debug"})
public final class CloudsManager {
    private static final int CLOUDLESS = com.example.weatherowpandroid.R.string.str_cloudless;
    private static final int MANY_CLOUDY = com.example.weatherowpandroid.R.string.str_many_cloudy;
    private static final int CLOUDY = com.example.weatherowpandroid.R.string.str_cloudy;
    private static final int DARK = com.example.weatherowpandroid.R.string.str_dark;
    public static final com.example.weatherowpandroid.common.managers.CloudsManager.Companion Companion = null;
    
    public CloudsManager() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/weatherowpandroid/common/managers/CloudsManager$Companion;", "", "()V", "CLOUDLESS", "", "CLOUDY", "DARK", "MANY_CLOUDY", "determineCloudiness", "percent", "(Ljava/lang/Integer;)I", "app_debug"})
    public static final class Companion {
        
        public final int determineCloudiness(@org.jetbrains.annotations.Nullable()
        java.lang.Integer percent) {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}