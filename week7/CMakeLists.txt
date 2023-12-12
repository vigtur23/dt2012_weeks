cmake_minimum_required (VERSION 2.8)

find_package(Java REQUIRED)
include(UseJava)

enable_testing()

project (main NONE)

#source and target flags will be obsolete in the future
#set(CMAKE_JAVA_COMPILE_FLAGS "-source" "1.8" "-target" "1.8")

#CounterView.java 
add_jar(main DiceModel.java DiceController.java DiceController2.java DiceView.java DiceView2.java E1.java E5.java E8.java Bonus.java)

get_target_property(_jarFile main JAR_FILE)
get_target_property(_classDir main CLASSDIR)

message(STATUS "Jar file ${_jarFile}")
message(STATUS "Class compiled to ${_classDir}")

add_test(NAME TestE1 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E1)
add_test(NAME TestE2 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E5)
add_test(NAME TestE3 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} E8)

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
