package activity.ds.qianfeng.com.touchdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by Administrator on 2015/3/17.
 */
public class Layout_1 extends RelativeLayout {

    private final String TAG="Layout_1";

    public Layout_1(Context context) {
        super(context);
    }

    public Layout_1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Layout_1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 分发事件
     * @param ev
     * @return 当某一个子view的onTouchEvent返回值为true或
     *         自己的onTouchEvent返回值为true时，返回tru
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, "dispatchTouchEvent");
        boolean b = super.dispatchTouchEvent(ev);
        Log.d(TAG, "dispatchTouchEvent"+"----"+b);
        return b;
    }

    /**
     * 事件拦截
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d(TAG, "onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }

    /**
     * 处理事件
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "onInterceptTouchEvent");

        boolean flag=true;

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_CANCEL://当父控件执行打断的时，调用
                break;

        }

        return true;
    }
}
