package io.turntable.scala
package library.member

enum MembershipType(numberOfBooks: Int) {
  case JUNIOR extends MembershipType(2)
  case REGULAR extends MembershipType(4)
  case SENIOR extends MembershipType(8)
  case DEFAULT extends MembershipType(0)
}