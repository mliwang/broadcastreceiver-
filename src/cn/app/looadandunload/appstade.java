package cn.app.looadandunload;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class appstade extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		//��ȡ�㲥�¼�������
		String action = intent.getAction();
		if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
			//System.out.println("���ж�سɹ�111111111111");
			Toast.makeText(context, "���ж�سɹ�111111111111"+intent.getData(), 1).show();
			
		}
		else if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
			//System.out.println("���������");
			Toast.makeText(context, "���������"+intent.getData(), 1).show();
		}
		else{//System.out.println("���˹���");
		Toast.makeText(context, "���˹���", 1).show();
		}

	}

}
