package com.def_ask

class User {
	String name
	String nickname
	String password
	String email

	static hasMany = [questions: Question]

    static constraints = {
    	email email: true
    }
}
