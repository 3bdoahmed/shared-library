package io.depi;
def javaBuild(Build_OPT){
    sh "mvn package install ${Build_OPT}"
}
def javaTest(Test_OPT){
    sh "mvn test ${Test_OPT}"
}
