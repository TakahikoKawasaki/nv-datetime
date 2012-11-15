nv-datetime
===========

Overview
--------

Lightweight datetime utilities. Currently, just a GregorianCalendar
subclass, 'GCalendar', is contained.

GCalendar provides getXxx(), setXxx(), addXxx() and rollXxx() methods
for each Calendar field. For example, getYear() method exists.
In addition, some format() and parse() methods are available.

GregorianCalendar class has isLeapYear(int year) method, but it is
not a static method. On the other hand, GCalendar provides no-argument
isLeapYear() instance method and isLeap(int year) as a static method.
Some constructor variants, for example, GCalendar(Date), are provided,
too.


License
-------

Apache License, Version 2.0


Download
--------

    git clone https://github.com/TakahikoKawasaki/nv-datetime.git


Javadoc
-------

[com.neovisionaris.datetime javadoc](http://TakahikoKawasaki.github.com/nv-datetime/)


Maven
-----

    <dependency>
        <groupId>com.neovisionaries</groupId>
        <artifactId>nv-datetime</artifactId>
        <version>1.0</version>
    </depenency>


Author
------

Takahiko Kawasaki, Neo Visionaries Inc.