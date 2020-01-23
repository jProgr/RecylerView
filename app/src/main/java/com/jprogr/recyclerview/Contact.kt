package com.jprogr.recyclerview;

import java.util.ArrayList;

public class Contact(val name: String, val online: Boolean)
{
    // fun getName(): String = name;

    fun isOnline(): Boolean = online;

    companion object
    {
        @JvmStatic fun createContactsList(numContacts: Int) : ArrayList<Contact>
        {
            var lastContactId: Int = 0;

            var contacts = ArrayList<Contact>();

            for (i in 1..numContacts)
            {
                contacts.add(Contact("Person " + lastContactId++, randomBoolean()));
            }

            return contacts;
        }

        private fun randomBoolean() : Boolean = ((1..10).random() % 2) == 0;
    }
}
