package activity.ds.qianfeng.com.touchdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by Administrator on 2015/3/17.
 */
public class Layout_2 extends RelativeLayout {
    private final String TAG="Layout_2";
    private float x;
    private float y;

    public Layout_2(Context context) {
        super(context);
    }

    public Layout_2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Layout_2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 分发事件
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, "dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    /**
     * 拦截事件
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d(TAG,"onInterceptTouchEvent");

        boolean flag=true;

        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                x = ev.getX();
                y = ev.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                flag=Math.sqrt(Math.pow(x-ev.getX(),2)+Math.pow(y-ev.getY(),2))>20;
                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_CANCEL://当父控件执行打断的时，调用
                break;

        }
        return flag;
    }

    /**
     * 处理事件
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG,"onTouchEvent");
        return super.onTouchEvent(event);
    }
}
