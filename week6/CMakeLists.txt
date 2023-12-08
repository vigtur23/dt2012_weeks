cmake_minimum_required (VERSION 2.8)

find_package(Java REQUIRED)
include(UseJava)

enable_testing()

project (main NONE)

#source and target flags will be obsolete in the future
#set(CMAKE_JAVA_COMPILE_FLAGS "-source" "1.8" "-target" "1.8")

add_jar(main BouncingBall.java ManyBalls.java Complex.java RandomBalls.java IntSet.java)

get_target_property(_jarFile main JAR_FILE)
get_target_property(_classDir main CLASSDIR)

message(STATUS "Jar file ${_jarFile}")
message(STATUS "Class compiled to ${_classDir}")

add_test(NAME Test1 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} BouncingBall)
#add_test(NAME Test2 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} ManyBalls)
add_test(NAME Test3 COMMAND ${Java_JAVA_EXECUTABLE} -cp ${_jarFile} Complex)

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
