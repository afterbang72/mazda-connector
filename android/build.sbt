import android.Keys._

android.Plugin.androidBuild

platformTarget in Android := "android-17"

name := "mazda_connector"

javacOptions in Compile ++= Seq("-source", "1.6", "-target", "1.6")
