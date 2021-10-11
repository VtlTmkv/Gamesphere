plugins {
    java
}

group = "org.example"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("com.google.code.gson:gson:2.8.5")
    implementation("org.projectlombok:lombok:1.18.20")
//    implementation("com.intellij:annotations:12.0.")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}