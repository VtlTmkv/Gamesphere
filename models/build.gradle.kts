plugins {
    java
}

group = "org.example"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly ("org.jetbrains:annotations:16.0.2")
    implementation ("com.google.code.gson:gson:2.8.5")
    implementation("org.projectlombok:lombok:1.18.20")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    annotationProcessor("org.projectlombok:lombok:1.18.20")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}