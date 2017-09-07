# Screenshot

![](https://github.com/yanjiabin/ExtendsRingPrigressBar/blob/master/pic/screen1.gif)

## import
```java
   step1.  Add it in your root build.gradle at the end of repositories:
            allprojects {
               repositories {
                  ...
                  maven { url 'https://jitpack.io' }
               }
            }
   
   step2.  Add the dependency
          dependencies {
	        compile 'com.github.yanjiabin:ExtendsRingPrigressBar:1.1.1'
	       }
  
```

## how to use 
```java
  in your xml
       <com.github.yanjiabin.extendsringprogressbarlib.RingProgressBar
          android:layout_gravity="center"
          android:id="@+id/progress_bar_1"
          android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:layout_centerInParent="true"
          android:layout_alignParentTop="true"
          app:max="100"                        最大进度
          app:ringColor="@color/colorPrimary"  圆环的颜色
          app:ringProgressColor="@color/colorPrimaryDark" 进度条的颜色
          app:ringWidth="3dp" 圆环的宽度
          app:style="FILL"   填充状态和描边状态  还有一种是STROKE
          app:textColor="@color/colorPrimary" 显示文本的颜色
          app:textIsShow="true"   是否显示文本
          app:textSize="16sp" />
   
```
