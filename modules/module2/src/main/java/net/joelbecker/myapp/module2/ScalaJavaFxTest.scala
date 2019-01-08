package net.joelbecker.myapp.module2

import javafx.scene.control.Alert
import javafx.scene.control.Alert.AlertType

/**
  * Created by Joel on 3/29/2016.
  */
object ScalaJavaFxTest {
  def doit = {
    val alert = new Alert(AlertType.INFORMATION, "Test")
    alert.showAndWait()
  }
}
