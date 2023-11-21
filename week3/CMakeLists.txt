cmake_minimum_required (VERSION 2.8)

find_package(Java REQUIRED)
include(UseJava)

enable_testing()

project (main NONE)

#source and target flags will be obsolete in the future
#set(CMAKE_JAVA_COMPILE_FLAGS "-source" "1.8" "-target" "1.8")

add_jar(main E1.java E2.java E3.java E4.java E5.java E6.java E7.java Bonus.java)

get_target_property(_jarFile main JAR_FILE)
get_target_property(_classDir main CLASSDIR)

message(STATUS "Jar file ${_jarFile}")
message(STATUS "Class compiled to ${_classDir}")

add_test(NAME TestE1 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E1 1000 3 > three_dices)
add_test(NAME TestE2 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E2 6)
add_test(NAME TestE3 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E3)
add_test(NAME TestE4 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E4 < ../dups > dedups)
add_test(NAME TestE5 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E5 10)
add_test(NAME TestE6 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E6)
add_test(NAME TestE7 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E7 5)
add_test(NAME Bonus COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} Bonus)

add_custom_target(log
	COMMAND cat Testing/Temporary/LastTest.log
)

add_custom_target(zip
	COMMAND pushd ..
	COMMAND export pwd=`pwd`
	COMMAND export d=`basename $$pwd`
	COMMAND zip vigtur23-$$d.zip *.java
	COMMAND popd
)
