# scala-javafx-desktop-android-ios
This is an example application that is built with Scala and JavaFX and runs on all of the major platforms -- Windows, OS X, Android, and iOS -- allowing your backend code *and* UI code to be shared across all platforms. It can be used as a template for your own app. This is the companion project to the article ["Running Scala + JavaFX on Android, iOS, Windows, and Mac OS X"](http://joelbecker.net/blog/scala-javafx-on-android-ios-windows-osx)

## Building, Running, and Making it into your own app
This is a Gradle project, with multiple modules that can contain Scala code, and one "app" module which brings all of the code together for a particular platform. 

It is also an IntelliJ IDEA 15 project. I used Eclipse for 8 years before switching to IntelliJ. I highly recommend IntelliJ IDEA Community Edition (free) over Eclipse; it has much better Gradle integration, as well as other benefits.

The gradle tasks for building and running on the different platforms are as follows:

  * `run` - Builds and runs on Windows and Mac OS X
  * `launchIOSDevice` Builds and runs on a connected iOS device.
    * If you don't have an iPad or iPhone, you can run with the simulator with `launchIPadSimulator` or `launchIPhoneSimulator`
  * `androidInstall` Builds and installs the app on a connected Android device. You'll have to manually launch the app

For more details see [the article](http://joelbecker.net/blog/scala-javafx-on-android-ios-windows-osx)
