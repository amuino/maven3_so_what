project("myGroupId:myArtifactId:1.0-SNAPSHOT") { proj =>
	proj modelVersion = "4.0.0"

    //...adds scala library dependency and configures Maven Scala compiler plugin...
    proj includesScalaSourceCode "2.7.7"

    //...adds normal Maven artifact dependency...
    proj dependency "commons-httpclient:commons-httpclient:jar:3.0.1"
}
