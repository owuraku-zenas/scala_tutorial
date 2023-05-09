package io.turntable.scala
package library.member

private class Member(val fname: String, val lname: String, var numberOfBooks: Int, var initialMembershipType: MembershipType){
  private var _member = initialMembershipType
  def membershipType(membershipType: MembershipType) = _member = membershipType
}

object Member {
  def apply(fname: String, lname: String, numberOfBooks: Int,  membershipType: MembershipType): Member = {
    new Member(fname, lname, numberOfBooks, membershipType)
  }

  def apply(fname: String, lname: String, numberOfBooks: Int): Member = {
    new Member(fname, lname, numberOfBooks, MembershipType.DEFAULT)
  }
}
