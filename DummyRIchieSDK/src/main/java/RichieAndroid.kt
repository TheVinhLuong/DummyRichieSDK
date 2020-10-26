import android.util.Log

internal class RichieAndroid private constructor(private val flutterGateway: FlutterToNativeInterface) :
    NativeToFlutterInterface {
    override fun onLogout() {
        Log.d("WTF", "Logout event from FLUTTER")
    }

    companion object {
        var instance: RichieAndroid? = null
            private set

        fun init(flutterGateway: FlutterToNativeInterface) {
            instance = RichieAndroid(flutterGateway)
        }
    }

}