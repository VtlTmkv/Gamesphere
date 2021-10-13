plugins {
    java
}

group = "org.example"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains:annotations:20.1.0")
    implementation("org.projectlombok:lombok:1.18.20")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation (project(":models"))
    annotationProcessor("org.projectlombok:lombok:1.18.20")
    implementation ("com.google.code.gson:gson:2.8.5")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}