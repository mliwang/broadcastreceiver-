package cn.app.looadandunload;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class appstade extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		//获取广播事件的类型
		String action = intent.getAction();
		if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
			//System.out.println("软件卸载成功111111111111");
			Toast.makeText(context, "软件卸载成功111111111111"+intent.getData(), 1).show();
			
		}
		else if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
			//System.out.println("软件安好了");
			Toast.makeText(context, "软件安好了"+intent.getData(), 1).show();
		}
		else{//System.out.println("奇了怪了");
		Toast.makeText(context, "奇了怪了", 1).show();
		}

	}

}
