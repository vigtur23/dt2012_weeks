cmake_minimum_required (VERSION 2.8)

find_package(Java REQUIRED)
include(UseJava)

enable_testing()

project (main NONE)

#source and target flags will be obsolete in the future
#set(CMAKE_JAVA_COMPILE_FLAGS "-source" "1.8" "-target" "1.8")

add_jar(main E1.java E2.java E3.java E4.java E5.java E6.java E7.java E8.java E9.java Bonus.java)

get_target_property(_jarFile main JAR_FILE)
get_target_property(_classDir main CLASSDIR)

message(STATUS "Jar file ${_jarFile}")
message(STATUS "Class compiled to ${_classDir}")

add_test(NAME TestE1 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E1 255 200 100 200 100 255)
add_test(NAME TestE2 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E2)
add_test(NAME TestE3 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E3 255 0 0)
add_test(NAME TestE4 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E4 500 300)
add_test(NAME TestE5 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E5 /home/vigor/school/hh/dt2012/week5/baboon.jpg)
add_test(NAME TestE6 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E6 /home/vigor/school/hh/dt2012/week5/baboon.jpg)
add_test(NAME TestE7 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E7 /home/vigor/school/hh/dt2012/week5/baboon.jpg 0.5)
add_test(NAME TestE8 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E8 /home/vigor/school/hh/dt2012/week5/baboon.jpg 10 0 0 0)
add_test(NAME TestE9 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E9 /home/vigor/school/hh/dt2012/week5/baboon.jpg 50 20 200 40)
add_test(NAME Bonus COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} Bonus /home/vigor/school/hh/dt2012/week5/baboon.jpg 50 20 200 40)

add_custom_target(log
	COMMAND cat Testing/Temporary/LastTest.log
)

add_custom_target(zip
	COMMAND pushd ..
	COMMAND export pwd=`pwd`
	COMMAND export d=`basename $$pwd`
	COMMAND zip vigtur23-$$d.zip *.java
	COMMAND popd
	DEPENDS test
)
