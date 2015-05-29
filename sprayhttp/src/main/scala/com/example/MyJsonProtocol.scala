package com.example

/**
 * Created by jlopesde on 29-05-2015.
 */
import spray.json.DefaultJsonProtocol

object MyJsonProtocol extends DefaultJsonProtocol {
  implicit val personFormat = jsonFormat3(Person)
}

case class Person(name: String, fistName: String, age: Long)