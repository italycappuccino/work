package com.stone.core.work.util.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class Test1 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new OneTask(1), 5000);// 5秒后启动任务

		OneTask secondTask = new OneTask(2);
		timer.schedule(secondTask, 1000, 3000);// 1秒后启动任务,以后每隔3秒执行一次线程

		Date date = new Date();
		timer.schedule(new OneTask(3), new Date(date.getTime() + 1000));// 以date为参数，指定某个时间点执行线程

		// timer.cancel();
		// secondTask.cancel();
		String d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		System.out.println(d+"end in main thread...");
		
		/*
2014-04-09 19:57:11end in main thread...
2014-04-09 19:57:12线程2:  正在 执行。。
2014-04-09 19:57:12线程3:  正在 执行。。
2014-04-09 19:57:15线程2:  正在 执行。。
2014-04-09 19:57:16线程1:  正在 执行。。
2014-04-09 19:57:18线程2:  正在 执行。。
2014-04-09 19:57:21线程2:  正在 执行。。
2014-04-09 19:57:24线程2:  正在 执行。。
2014-04-09 19:57:27线程2:  正在 执行。。
		 * */
	}
}
