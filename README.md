# VideoPlayer
视频播放器
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  	dependencies {
	        implementation 'com.github.zhangjunnan123:VideoPlayer:V1.0'
	}
1.借用别人的项目  NiceVieoPlayer-master 
2.对原版项目 开放出seek控件 和 播放结束之后 的分享控件
3.屏蔽掉原版中续播的接口，更改使用续播方法
4.混淆 -keep class tv.danmaku.ijk.media.player.**{*;}

