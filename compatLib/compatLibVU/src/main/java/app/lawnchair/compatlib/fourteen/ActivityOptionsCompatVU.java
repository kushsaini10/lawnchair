package app.lawnchair.compatlib.fourteen;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Handler;
import android.view.RemoteAnimationAdapter;
import android.window.RemoteTransition;
import app.lawnchair.compatlib.ActivityOptionsCompat;

public class ActivityOptionsCompatVU extends ActivityOptionsCompat {
    @Override
    public ActivityOptions makeCustomAnimation(
            Context context,
            int enterResId,
            int exitResId,
            Runnable callback,
            Handler callbackHandler) {
        return null;
    }

    @Override
    public ActivityOptions makeRemoteAnimation(
            RemoteAnimationAdapter remoteAnimationAdapter,
            Object remoteTransition,
            String debugName) {
        return ActivityOptions.makeRemoteAnimation(
                remoteAnimationAdapter, (RemoteTransition) remoteTransition);
    }
}
