package com.example.contactapp

data class ContactDB(
    val id:Int,
    val name:String,
    val phone:String,
    val email:String,
    val address:String
)
val contactList = mutableListOf(
    ContactDB(1,"Ibrahim","0179655665","aitvetibar@gmail.com","Dhaka"),
    ContactDB(2,"hasan","0179655665","aitvetibar@gmail.com","Dhaka"),
    ContactDB(3,"Tomal","0179655665","aitvetibar@gmail.com","Dhaka"),
    ContactDB(4,"Rana","0179655665","aitvetibar@gmail.com","Dhaka"),
    ContactDB(5,"hanif","0179655665","aitvetibar@gmail.com","Dhaka"),
)
val scheduleList = mutableListOf<ContactDB>()
