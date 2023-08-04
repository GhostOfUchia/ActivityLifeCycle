import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent


class observer: LifecycleObserver{
    val tag = "observer"
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreat(){
        Log.d(tag,"obser on creat Running")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart(){
        Log.d(tag,"obser on Start Running")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(){
        Log.d(tag,"obser on Resume Running")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause(){
        Log.d(tag,"obser on pause Running")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(){
        Log.d(tag,"obser on Stop Running")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun onAny(){
        Log.d(tag,"obser on Any Running")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(){
        Log.d(tag,"obser on Destroy Running")
    }
}