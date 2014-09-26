package com.stone.core.work.util.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class OneTask extends TimerTask {

	private int id;

	public OneTask(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		String d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		System.out.println(d+"线程" + id + ":  正在 执行。。");
		// System.gc();
	}
}
