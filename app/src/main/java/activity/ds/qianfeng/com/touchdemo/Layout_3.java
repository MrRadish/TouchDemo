package activity.ds.qianfeng.com.touchdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by Administrator on 2015/3/17.
 */
public class Layout_3 extends RelativeLayout {
    private final String TAG="Layout_3";
    public Layout_3(Context context) {
        super(context);
    }

    public Layout_3(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Layout_3(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 分发事件
     * @param ev
     * @return 当某一个子view的onTouchEvent返回值为true或
     *         自己的onTouchEvent返回值为true时，返回true
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG,"dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    /**
     * 打断事件
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d(TAG,"onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }

    /**
     * 处理事件
     * @param event
     * @return 是否处理
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG,"onTouchEvent");
        boolean flag=true;

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                flag=true;
                break;
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_CANCEL://当父控件执行打断的时，调用
                break;

        }
        return flag;
    }
}
